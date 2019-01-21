package com.xingfeng.jetpackdemo.animation.physicsanimation

import android.os.Bundle
import android.support.animation.DynamicAnimation
import android.support.animation.FloatPropertyCompat
import android.support.animation.SpringAnimation
import android.support.animation.SpringForce
import android.support.v7.app.AppCompatActivity
import android.util.FloatProperty
import android.view.MotionEvent
import android.view.View
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_spring_animation.*

class SpringAnimationActivity : AppCompatActivity() {

    lateinit var xSpringAnimation: SpringAnimation
    lateinit var ySpringAnimation: SpringAnimation

    var xDiffLeft: Float? = null
    var yDiffTop: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring_animation)

        val springForce = SpringForce(0f).apply {
            setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY)
            setStiffness(SpringForce.STIFFNESS_HIGH)
        }

        dampingRatioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.dampingRatioHigh -> springForce.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
                R.id.dampingRatioMedium -> springForce.dampingRatio = SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY
                R.id.dampingRatioLow -> springForce.dampingRatio = SpringForce.DAMPING_RATIO_LOW_BOUNCY
                R.id.dampingRatioNo -> springForce.dampingRatio = SpringForce.DAMPING_RATIO_NO_BOUNCY
            }
        }

        stiffnessGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.stiffnessHigh -> springForce.stiffness = SpringForce.STIFFNESS_HIGH
                R.id.stiffnesMedium -> springForce.stiffness = SpringForce.STIFFNESS_MEDIUM
                R.id.stiffnesLow -> springForce.stiffness = SpringForce.STIFFNESS_LOW
                R.id.stiffnesVeryLow -> springForce.stiffness = SpringForce.STIFFNESS_VERY_LOW
            }
        }

        xSpringAnimation = SpringAnimation(ivImg, DynamicAnimation.TRANSLATION_X).setSpring(springForce)
        ySpringAnimation = SpringAnimation(ivImg, DynamicAnimation.TRANSLATION_Y).setSpring(springForce)

        ivImg.setOnTouchListener { v, event ->
            val actionCode = event.action
            if (actionCode == MotionEvent.ACTION_DOWN) {
                xDiffLeft = event.rawX - ivImg.x
                yDiffTop = event.rawY - ivImg.y
                xSpringAnimation.cancel()
                ySpringAnimation.cancel()
            } else if (actionCode == MotionEvent.ACTION_MOVE) {
                ivImg.x = event.rawX - xDiffLeft!!
                ivImg.y = event.rawY - yDiffTop!!
            } else if (actionCode == MotionEvent.ACTION_UP) {
                xSpringAnimation.start()
                ySpringAnimation.start()
            }
            true
        }

        var changed = false
        val sForce = SpringForce()
                .setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY)
                .setStiffness(SpringForce.STIFFNESS_LOW)
        val propertyCompat = object : FloatPropertyCompat<View>("scale") {
            override fun setValue(view: View?, scale: Float) {
                view!!.scaleX = scale
                view!!.scaleY = scale
            }

            override fun getValue(view: View?): Float {
                return view!!.scaleX
            }
        }
        ivImg2.setOnClickListener {
            if (!changed) {
                SpringAnimation(it, propertyCompat).setSpring(sForce.setFinalPosition(2f))
                        .setMinimumVisibleChange(0.00390625f)
                        .start()
            } else {
                SpringAnimation(it, propertyCompat).setSpring(sForce.setFinalPosition(1f))
                        .setMinimumVisibleChange(0.00390625f)
                        .start()
            }
            changed = !changed
        }


    }
}
