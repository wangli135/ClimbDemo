package com.xingfeng.jetpackdemo.animation.physicsanimation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_physics_animation.*

class PhysicsAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics_animation)

        btnFlingAnimation.setOnClickListener {
            startActivity(Intent(this, FlingAnimationActivity::class.java))
        }

        btnSpringAnimation.setOnClickListener {
            startActivity(Intent(this, SpringAnimationActivity::class.java))
        }

        btnChainedSpringAnimation.setOnClickListener {
            startActivity(Intent(this, ChainedSpringActivity::class.java))
        }

    }
}
