package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.animation.AccelerateInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_value_animator.*

class ValueAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_value_animator)

        val animator = ValueAnimator.ofFloat(0f, 1000f)
                .apply {
                    duration = 3000
                    interpolator = AccelerateInterpolator()
                    addUpdateListener {
                        tvShow.translationX = it.animatedValue as Float
                    }
                }
        btnMove.setOnClickListener {
            animator.start()
        }

        val animatorFromXml = AnimatorInflater.loadAnimator(this, R.animator.value_move_view)
        btnMoveFromXml.setOnClickListener {
            if (animatorFromXml is ValueAnimator) {
                animatorFromXml.apply {
                    addUpdateListener {
                        tvShow.translationX = it.animatedValue as Float
                    }
                    start()
                }
            }
        }
    }
}
