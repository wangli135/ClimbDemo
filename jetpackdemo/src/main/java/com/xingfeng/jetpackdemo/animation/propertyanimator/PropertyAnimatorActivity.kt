package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_property_animator.*

class PropertyAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animator)
        btnViewAnimation.setOnClickListener {
            startActivity(Intent(this, ViewAnimationActivity::class.java))
        }
        btnVauleAnimator.setOnClickListener {
            startActivity(Intent(this, ValueAnimatorActivity::class.java))
        }
        btnObjectAnimator.setOnClickListener {
            startActivity(Intent(this, ObjectAnimatorActivity::class.java))
        }
        btnAnimatorSet.setOnClickListener {
            startActivity(Intent(this, AnimatorSetActivity::class.java))
        }
        btnInterpolator.setOnClickListener {
            startActivity(Intent(this, InterpolatorActivity::class.java))
        }
        btnStateListAnimator.setOnClickListener {
            startActivity(Intent(this, StateListAnimatorActivity::class.java))
        }
        btnBreathView.setOnClickListener {
            startActivity(Intent(this, BreathViewActivity::class.java))
        }
    }
}
