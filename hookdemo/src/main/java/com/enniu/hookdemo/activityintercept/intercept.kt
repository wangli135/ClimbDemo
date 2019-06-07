package com.enniu.hookdemo.activityintercept

import android.content.Intent
import android.os.Handler
import android.os.Message
import android.util.Log
import java.util.ArrayList

/**
 * @Author: 王立
 * @Date: 2019-05-16 19:55
 * @Desc:
 */
class ActivityThreadHandlerCallback(val base: Handler) : Handler.Callback {


    override fun handleMessage(msg: Message?): Boolean {
        when (msg?.what) {
            159 ->
                handleLaunchActivity(msg!!)
        }
        Log.i("TAG",msg!!.toString())
        base.handleMessage(msg)
        return true
    }

    private fun handleLaunchActivity(msg: Message) {
        if (msg.obj.javaClass.name == "android.app.servertransaction.ClientTransaction") {
            val mActivityCallbacks_field = msg.obj.javaClass.getDeclaredField("mActivityCallbacks")
            mActivityCallbacks_field.isAccessible = true
            val mActivityCallbacks = mActivityCallbacks_field.get(msg.obj) as ArrayList<*>

            //有时为null
            if (mActivityCallbacks.size == 1) {
                //LaunchActivityItem
                val item = mActivityCallbacks.get(0)
                try{
                    val mIntent_field = item.javaClass.getDeclaredField("mIntent")
                    mIntent_field.isAccessible = true
                    val intent = mIntent_field.get(item) as Intent

                    val raw = intent.getParcelableExtra<Intent>("extra_target_intent")
                    intent.component=raw.component
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }

        }
    }
}

fun hooActivityThreadHandler() {
    val activityThread_clazz = Class.forName("android.app.ActivityThread")
    val currentActivityThread_field = activityThread_clazz.getDeclaredField("sCurrentActivityThread")
    currentActivityThread_field.isAccessible = true
    val currentActivityThread = currentActivityThread_field.get(null)

    val mH_field = activityThread_clazz.getDeclaredField("mH")
    mH_field.isAccessible = true
    val handler = mH_field.get(currentActivityThread) as Handler

    val mCallback_field = Handler::class.java.getDeclaredField("mCallback")
    mCallback_field.isAccessible = true
    mCallback_field.set(handler, ActivityThreadHandlerCallback(handler))

}
