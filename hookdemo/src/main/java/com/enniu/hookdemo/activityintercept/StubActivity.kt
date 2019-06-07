package com.enniu.hookdemo.activityintercept

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.enniu.hookdemo.R

class StubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stub)
    }
}
