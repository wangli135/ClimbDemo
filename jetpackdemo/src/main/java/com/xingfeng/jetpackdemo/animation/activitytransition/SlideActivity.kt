package com.xingfeng.jetpackdemo.animation.activitytransition

import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.transition.Explode
import android.transition.Slide
import android.view.Gravity
import android.view.Window
import com.xingfeng.jetpackdemo.R

class SlideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val edge = intent.getIntExtra("slideedge", Gravity.TOP)
        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

            enterTransition = Slide().apply {
                slideEdge = edge
            }
            exitTransition = Slide().apply {
                slideEdge = edge
            }
        }
        setContentView(R.layout.activity_slide)
    }
    
}
