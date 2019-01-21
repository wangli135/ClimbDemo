package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AccelerateInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_object_animator.*

class ObjectAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_animator)

        val animator = ObjectAnimator.ofFloat(tvShow,View.TRANSLATION_X,0f,1000f).apply {
            duration=3000
            interpolator=AccelerateInterpolator()
            repeatMode=ValueAnimator.RESTART
            repeatCount=10
        }
        btnMove.setOnClickListener {
            animator.start()
        }

        val animatorFromXml = AnimatorInflater.loadAnimator(this, R.animator.object_move_view)
        btnMoveFromXml.setOnClickListener {
            if(animatorFromXml is ValueAnimator){
                animatorFromXml.apply {
                    addUpdateListener {
                        tvShow.translationX=animatedValue as Float
                    }
                    start()
                }
            }
        }

    }
}
