package com.xingfeng.jetpackdemo.animation.activitytransition

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.view.Window
import com.xingfeng.jetpackdemo.R

class FadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            enterTransition = Fade()
            exitTransition = Fade()
        }
        setContentView(R.layout.activity_fade)
    }

}
