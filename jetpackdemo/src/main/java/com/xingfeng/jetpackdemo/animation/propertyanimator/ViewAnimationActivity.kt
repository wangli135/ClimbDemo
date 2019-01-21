package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.widget.Toast
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        btnHello.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }
        btnWorld.setOnClickListener {
            Toast.makeText(this, "World", Toast.LENGTH_SHORT).show()
        }

        btnViewAnimation.setOnClickListener {
            btnHello.startAnimation(
                    TranslateAnimation(0f, 400f, 0f, 0f).apply {
                        duration = 3000
                        fillAfter=true
                    }
            )
        }
        btnPropertyAnimator.setOnClickListener {
            ObjectAnimator.ofFloat(btnWorld, View.TRANSLATION_X, 0f, 400f).apply {
                duration = 3000
                start()
            }
        }
    }
}
