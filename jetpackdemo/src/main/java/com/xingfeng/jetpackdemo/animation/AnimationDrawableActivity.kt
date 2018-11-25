package com.xingfeng.jetpackdemo.animation

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.xingfeng.jetpackdemo.R

class AnimationDrawableActivity : AppCompatActivity() {

    private lateinit var wifiSignalAnimation: AnimationDrawable
    private lateinit var vectorAnimation: AnimatedVectorDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_drawable)

        findViewById<ImageView>(R.id.iv_wifi_signal).apply {
            //            setBackgroundResource(R.drawable.wifi_signal)
//            wifiSignalAnimation = background as AnimationDrawable
            setBackgroundResource(R.drawable.animvectordrawable2)
            vectorAnimation = background as AnimatedVectorDrawable
        }

        findViewById<Button>(R.id.btn_start).setOnClickListener {
            vectorAnimation.start()
        }

    }

    override fun onStart() {
        super.onStart()
//        wifiSignalAnimation.start()
//        vectorAnimation.start()
    }
}
