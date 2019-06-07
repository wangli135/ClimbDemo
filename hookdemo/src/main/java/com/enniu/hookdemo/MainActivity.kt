package com.enniu.hookdemo

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.enniu.hookdemo.activityintercept.TargetActivity
import com.enniu.hookdemo.activityintercept.hooActivityThreadHandler
import com.enniu.hookdemo.amshook.hookAms
import com.enniu.hookdemo.amshook.hookPms
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        hookAms()
//        hookPms(newBase!!)
        hooActivityThreadHandler()
        super.attachBaseContext(newBase)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHookAms.setOnClickListener {
            startActivity(Intent(this, AMSHookActivity::class.java))
        }

        btnHookPms.setOnClickListener {
            packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
        }

        btnHookBinder.setOnClickListener {
            startActivity(Intent(this, BinderHookActivity::class.java))
        }

        btnActivityIntercept.setOnClickListener {
            startActivity(Intent(this,TargetActivity::class.java))
        }

    }
}
