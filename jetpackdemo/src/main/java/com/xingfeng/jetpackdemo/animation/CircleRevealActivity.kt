package com.xingfeng.jetpackdemo.animation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_circle_reveal.*

/**
 * Circle Reveal 效果
 */
class CircleRevealActivity : AppCompatActivity() {

    private var isTextShow = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_reveal)

        btn.setOnClickListener {
            if (isTextShow) hideView() else showView()
            isTextShow = !isTextShow
        }

    }

    private fun hideView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val cx = text.width / 2
            val cy = text.height / 2

            val initRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
            val anim = ViewAnimationUtils.createCircularReveal(text, cx, cy, initRadius, 0f)
            anim.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator?) {
                    super.onAnimationEnd(animation)
                    text.visibility = View.INVISIBLE
                }
            })
            anim.start()
        } else {
            text.visibility = View.INVISIBLE
        }
    }

    private fun showView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val cx = text.width / 2
            val cy = text.height / 2

            val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
            val anim = ViewAnimationUtils.createCircularReveal(text, cx, cy, 0f, finalRadius)
            text.visibility = View.VISIBLE
            anim.start()
        } else {
            text.visibility = View.VISIBLE
        }
    }


}
