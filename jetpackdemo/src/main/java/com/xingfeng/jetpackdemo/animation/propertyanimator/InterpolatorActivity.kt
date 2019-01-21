package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.*
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_interpolator.*

class InterpolatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpolator)

        val anim = ObjectAnimator.ofFloat(tvShow, View.TRANSLATION_X, 0f, 1000f)
                .apply {
                    duration = 3000
                    addListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationStart(animation: Animator?) {
                            tvXShow.text = "0"
                        }
                    })
                    addUpdateListener {
                        tvXShow.text = (animatedValue as Float).toString()
                    }
                }
        interpolatorRg.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.accDecRb -> anim.interpolator = AccelerateDecelerateInterpolator()
                R.id.accRb -> anim.interpolator = AccelerateInterpolator()
                R.id.lineRb -> anim.interpolator = LinearInterpolator()
                R.id.antiRb -> anim.interpolator = AnticipateInterpolator()
                R.id.antiOvershotRb -> anim.interpolator = AnticipateOvershootInterpolator()
                R.id.overshotRb -> anim.interpolator = OvershootInterpolator()
                R.id.bounceRb -> anim.interpolator = BounceInterpolator()
                R.id.pathRb -> anim.interpolator = PathInterpolator(0.3f, 0.7f)
                R.id.decRb -> anim.interpolator = DecelerateInterpolator()
                R.id.cycleRb -> anim.interpolator = CycleInterpolator(2f)
                R.id.customRb -> anim.interpolator = SpringInterpolator(0.2f)
            }
        }

        btnMoveView.setOnClickListener {
            anim.start()
        }
    }
}
