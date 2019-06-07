package com.enniu.hookdemo.activityintercept

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enniu.hookdemo.R

class TargetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG","Target destory")
    }

}
