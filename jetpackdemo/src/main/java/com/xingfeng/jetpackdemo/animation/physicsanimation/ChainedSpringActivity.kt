package com.xingfeng.jetpackdemo.animation.physicsanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.animation.DynamicAnimation
import android.support.animation.SpringAnimation
import android.support.animation.SpringForce
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_chained_spring.*

class ChainedSpringActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chained_spring)

        val springForce = SpringForce(-600f).apply {
            dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
            stiffness = SpringForce.STIFFNESS_LOW
        }
        val tvTextSpringAnimation = SpringAnimation(tvPublishText,
                DynamicAnimation.TRANSLATION_Y)
        val tvVideoSpringAnimation = SpringAnimation(tvPublishVideo,
                DynamicAnimation.TRANSLATION_Y).apply {
            addUpdateListener { animation, value, velocity ->
                tvTextSpringAnimation.animateToFinalPosition(value)
            }
        }
        val tvPicSpringAnimation = SpringAnimation(tvPublishPic,
                DynamicAnimation.TRANSLATION_Y).apply {
            spring = springForce
            addUpdateListener { dynamicAnimation, value, velocity ->
                tvVideoSpringAnimation.animateToFinalPosition(value)
            }
        }
        var changed = false
        fab.setOnClickListener {
            if (!changed) {
                tvPicSpringAnimation.start()
            } else {
                tvPicSpringAnimation.skipToEnd()
            }
            changed = !changed
        }

    }
}