package com.enniu.hookdemo.amshook

import android.content.ComponentName
import android.content.Intent
import android.util.Log
import com.enniu.hookdemo.activityintercept.StubActivity
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import java.util.*

/**
 * @Author: 王立
 * @Date: 2019/5/5 16:21
 * @Desc:
 */

class AMSHookHandler(val base: Any) : InvocationHandler {

    val TAG = "AMSHookHandler"

    override fun invoke(proxy: Any?, method: Method?, args: Array<Any>?): Any? {
        if (method?.name == "startActivity") {
           var raw:Intent
            var index=0
            for(i in 0 until args!!.size){
                if(args[i] is Intent){
                    index=i
                    break
                }
            }
            raw=args[index] as Intent

            val newIntent=Intent()
            with(newIntent){
                component= ComponentName("com.enniu.hookdemo",StubActivity::class.java.canonicalName)
                putExtra("extra_target_intent", raw)
            }

            args[index]=newIntent

        }

        return method?.invoke(base, *args!!)
    }
}


fun hookAms() {
    val activitymanager_clazz = Class.forName("android.app.ActivityManager")
    val getServiceMethod = activitymanager_clazz.getDeclaredMethod("getService")
    getServiceMethod.isAccessible = true
    val rawAms = getServiceMethod.invoke(null)

    val singletonField = activitymanager_clazz.getDeclaredField("IActivityManagerSingleton")
    singletonField.isAccessible = true
    val singletonObject = singletonField.get(null)

    val singleton_clazz = Class.forName("android.util.Singleton")
    val instance_field = singleton_clazz.getDeclaredField("mInstance")
    instance_field.isAccessible = true

    val amInterface = Class.forName("android.app.IActivityManager")
    val newAms = Proxy.newProxyInstance(Thread.currentThread().contextClassLoader,
            arrayOf(amInterface), AMSHookHandler(rawAms))

    instance_field.set(singletonObject, newAms)

}

