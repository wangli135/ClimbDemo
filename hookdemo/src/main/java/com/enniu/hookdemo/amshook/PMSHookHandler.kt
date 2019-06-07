package com.enniu.hookdemo.amshook

import org.joor.Reflect.*;

import android.content.Context
import android.util.Log
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import java.util.*

/**
 * @Author: 王立
 * @Date: 2019-05-08 11:11
 * @Desc:
 */
class PMSHookHandler(val base: Any) : InvocationHandler {
    override fun invoke(proxy: Any, method: Method, args: Array<out Any>): Any {
        if (method.name == "getInstalledApplications") {
            Log.i("TAG", "you are hooked")
        }

        Log.i("TAG", "method ${method.name} with args ${Arrays.toString(args)}")

        return method.invoke(base, *args)
    }
}

fun hookPms(context: Context) {

    val activityThread_clazz = Class.forName("android.app.ActivityThread")
    val getcurrent_method = activityThread_clazz.getDeclaredMethod("currentActivityThread")
    //得到ActivityThread对象
    val activityThread = getcurrent_method.invoke(null)


    //得到原PMS
    val getPackageManager_method = activityThread_clazz.getDeclaredMethod("getPackageManager")
    val rawPms = getPackageManager_method.invoke(null)

    //动态代理，得到新PMS
    val ipackagemanager_interface = Class.forName("android.content.pm.IPackageManager")
    val newPms = Proxy.newProxyInstance(rawPms.javaClass.classLoader,
            arrayOf(ipackagemanager_interface), PMSHookHandler(rawPms))

    //修改ActivityThread中的字段
    val sPackageManager_field = activityThread_clazz.getDeclaredField("sPackageManager")
    sPackageManager_field.isAccessible = true
    sPackageManager_field.set(activityThread, newPms)

    //修改ContextImpl中的字段
    val packageManager = context.packageManager
    val pm_field = packageManager.javaClass.getDeclaredField("mPM")
    pm_field.isAccessible = true
    pm_field.set(packageManager, newPms)

}

