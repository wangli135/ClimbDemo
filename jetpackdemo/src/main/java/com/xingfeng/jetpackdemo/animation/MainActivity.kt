package com.xingfeng.jetpackdemo.animation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xingfeng.jetpackdemo.R
import com.xingfeng.jetpackdemo.animation.activitytransition.ActivityTransitionActivity
import com.xingfeng.jetpackdemo.animation.layoutanimate.CustomTransitionActivity
import com.xingfeng.jetpackdemo.animation.layoutanimate.LayoutAnimateActivity
import com.xingfeng.jetpackdemo.animation.layoutanimate.TransitionLayoutActivity
import com.xingfeng.jetpackdemo.animation.physicsanimation.PhysicsAnimationActivity
import com.xingfeng.jetpackdemo.animation.propertyanimator.PropertyAnimatorActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAnimationDrawable.setOnClickListener {
            startActivity(Intent(this, AnimationDrawableActivity::class.java))
        }

        btnCardFlip.setOnClickListener {
            startActivity(Intent(this, CardFlipActivity::class.java))
        }

        btnCircleReveal.setOnClickListener {
            startActivity(Intent(this, CircleRevealActivity::class.java))
        }

        btnCrossFade.setOnClickListener {
            startActivity(Intent(this, CrossFadeActivity::class.java))
        }

        btnMoveView.setOnClickListener {
            startActivity(Intent(this, MoveViewActivity::class.java))
        }

        btnEnlargeImage.setOnClickListener {
            startActivity(Intent(this, EnlargeImageActivity::class.java))
        }

        btnLayoutAnimate.setOnClickListener {
            startActivity(Intent(this, LayoutAnimateActivity::class.java))
        }

        btnLayoutTransition.setOnClickListener {
            startActivity(Intent(this, TransitionLayoutActivity::class.java))
        }

        btnCustomTransition.setOnClickListener {
            startActivity(Intent(this, CustomTransitionActivity::class.java))
        }

        btnActivityTransition.setOnClickListener {
            startActivity(Intent(this, ActivityTransitionActivity::class.java))
        }

        btnPhysicsAnimate.setOnClickListener {
            startActivity(Intent(this, PhysicsAnimationActivity::class.java))
        }

        btnPropertyAnimator.setOnClickListener {
            startActivity(Intent(this, PropertyAnimatorActivity::class.java))
        }
    }
}
