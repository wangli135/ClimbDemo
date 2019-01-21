package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_animator_set.*

class AnimatorSetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animator_set)

        val alphaStartAnim = ObjectAnimator.ofFloat(tvShow, View.ALPHA, 1f, 0f, 1f)
        val xAnim = ObjectAnimator.ofFloat(tvShow, View.TRANSLATION_X, 0f, 1000f)
        val yAnim = ObjectAnimator.ofFloat(tvShow, View.TRANSLATION_Y, 0f, 500f)
        val alphaEndAnim = ObjectAnimator.ofFloat(tvShow, View.ALPHA, 1f, 0f, 1f)
        btnMove.setOnClickListener {
            AnimatorSet().apply {
                play(xAnim).after(alphaStartAnim)
                play(xAnim).with(yAnim)
                play(xAnim).before(alphaEndAnim)
                start()
            }
        }
    }
}
