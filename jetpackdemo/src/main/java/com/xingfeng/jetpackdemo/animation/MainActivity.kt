package com.xingfeng.jetpackdemo.animation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xingfeng.jetpackdemo.R
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

    }
}
