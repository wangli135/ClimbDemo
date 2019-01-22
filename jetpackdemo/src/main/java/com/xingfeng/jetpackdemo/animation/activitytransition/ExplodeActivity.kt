package com.xingfeng.jetpackdemo.animation.activitytransition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.transition.TransitionSet
import android.view.Window
import com.xingfeng.jetpackdemo.R

class ExplodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            enterTransition = Explode()
            exitTransition = Explode()
        }
        setContentView(R.layout.activity_explode)
    }

}
