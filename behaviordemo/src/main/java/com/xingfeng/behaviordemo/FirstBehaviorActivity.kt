package com.xingfeng.behaviordemo

import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first_behavior.*

class FirstBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_behavior)

        btnMove.setOnClickListener {
            ObjectAnimator.ofFloat(text1,View.TRANSLATION_Y,0f,1000f).apply {
                duration=3000
                start()
            }
        }
        btnRemove.setOnClickListener {
           col.removeView(text1)
        }
    }
}
