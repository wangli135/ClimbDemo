package com.xingfeng.jetpackdemo.animation.physicsanimation

import android.os.Bundle
import android.support.animation.DynamicAnimation
import android.support.animation.FlingAnimation
import android.support.v7.app.AppCompatActivity
import android.view.GestureDetector
import android.view.MotionEvent
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_fling.*

class FlingAnimationActivity : AppCompatActivity() {

    lateinit var gestureDetector: GestureDetector
    var maxTransitionX: Int? = null
    var maxTransitionY: Int? = null

    private val gestureListener = object : GestureDetector.SimpleOnGestureListener() {
        override fun onDown(e: MotionEvent?): Boolean {
            return true
        }

        override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
            if (Math.abs(velocityX) > Math.abs(velocityY)) {
                FlingAnimation(ivImg, DynamicAnimation.TRANSLATION_X).apply {
                    setStartVelocity(velocityX)
                    setMinValue(0f)
                    setMaxValue(maxTransitionX!!.toFloat())
                    friction = 1.1f
                    start()
                }
            } else {
                FlingAnimation(ivImg, DynamicAnimation.TRANSLATION_Y).apply {
                    setStartVelocity(velocityY)
                    setMinValue(0f)
                    setMaxValue(maxTransitionY!!.toFloat())
                    friction = 1.1f
                    start()
                }
            }
            return true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fling)

        mainLayout.viewTreeObserver.addOnGlobalLayoutListener {
            maxTransitionX = mainLayout.width - ivImg.width
            maxTransitionY = mainLayout.height - ivImg.height
        }

        gestureDetector = GestureDetector(this, gestureListener)

        ivImg.setOnTouchListener { v, event ->
            gestureDetector!!.onTouchEvent(event)
        }
    }
}
