package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.Keyframe
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnticipateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_key_frame.*

class KeyFrameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key_frame)

        val kf1 = Keyframe.ofFloat(0.2f, 100f).apply {
            interpolator = AnticipateInterpolator()
        }
        val kf2 = Keyframe.ofFloat(0.4f, 200f).apply {
            interpolator = LinearInterpolator()
        }
        val kf3 = Keyframe.ofFloat(0.6f, 300f)
        val kf4 = Keyframe.ofFloat(0.8f, 400f).apply {
            interpolator = BounceInterpolator()
        }
        val kf5 = Keyframe.ofFloat(1.0f, 500f).apply {
            interpolator = SpringInterpolator(0.2f)
        }

        btnMove.setOnClickListener {
            ObjectAnimator.ofPropertyValuesHolder(tvShow,
                    PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, kf1, kf2, kf3, kf4, kf5)).apply {
                duration = 3000
                start()
            }
        }

    }
}
