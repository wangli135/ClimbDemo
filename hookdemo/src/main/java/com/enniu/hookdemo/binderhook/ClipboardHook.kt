package com.enniu.hookdemo.binderhook

import android.content.ClipData
import android.os.IBinder
import android.os.IInterface
import android.util.Log
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * @Author: 王立
 * @Date: 2019-05-06 16:34
 * @Desc:
 */
class BinderHookHandler(val binder: IBinder, val stubClass: Class<*>) : InvocationHandler {

    lateinit var base: Any

    init {
        try {
            with(stubClass.getDeclaredMethod("asInterface", IBinder::class.java)) {
                base = invoke(null, binder)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val TAG = "BinderHookHandler"

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {

        //把剪贴板的内容替换为"you are hooked"
        if (method?.name == "getPrimaryClip") {
            Log.i(TAG, "hook getPrimaryClip")
            return ClipData.newPlainText(null, "you are hooked")
        }

        //欺骗系统，使之认为剪贴板上一直有内容
        if (method?.name == "hasPrimaryClip") {
            return true
        }

        return method!!.invoke(base, *args!!)

    }
}

class BinderProxyHookHandler(val base: IBinder) : InvocationHandler {

    lateinit var stub: Class<*>
    lateinit var iinterface: Class<*>

    init {
        stub = Class.forName("android.content.IClipboard\$Stub")
        iinterface = Class.forName("android.content.IClipboard")
    }


    val TAG = "BinderHookHandler"

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        if (method?.name == "queryLocalInterface") {
            Log.i(TAG, "hook queryLocalInterface")
            return Proxy.newProxyInstance(proxy!!.javaClass.classLoader,
                    arrayOf(IBinder::class.java, IInterface::class.java,iinterface),
                    BinderHookHandler(base, stub))
        }
        Log.i(TAG, "method:${method?.name}")
        return method!!.invoke(base, *args!!)
    }
}

fun hookBinder() {
    val serviceManager_clazz = Class.forName("android.os.ServiceManager")
    val getService_method = serviceManager_clazz.getDeclaredMethod("getService", String::class.java)
    //原始Binder
    val rawBinder = getService_method.invoke(null, "clipboard") as IBinder

    //Hook掉这个Binder代理对象的queryLocalInterface方法
    val hookedBinder = Proxy.newProxyInstance(serviceManager_clazz.classLoader,
            arrayOf(IBinder::class.java),
            BinderProxyHookHandler(rawBinder)) as IBinder

    //把这个hook过的Binder代理对象放进ServiceManager的cache里面
    val cache_field = serviceManager_clazz.getDeclaredField("sCache")
    cache_field.isAccessible = true
    val map = cache_field.get(null) as MutableMap<String, IBinder>
    map["clipboard"] = hookedBinder

}
