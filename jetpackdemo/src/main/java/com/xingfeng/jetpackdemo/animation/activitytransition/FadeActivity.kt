package com.xingfeng.jetpackdemo.animation.activitytransition

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.transition.Fade
import android.view.Window
import com.xingfeng.jetpackdemo.R

class FadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

            enterTransition = Fade()
            exitTransition = Fade()
        }
        setContentView(R.layout.activity_fade)
    }

}
