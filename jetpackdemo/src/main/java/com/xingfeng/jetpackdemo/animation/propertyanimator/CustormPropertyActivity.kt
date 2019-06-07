package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_custorm_property.*

class CustormPropertyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custorm_property)

        btnAnimatorPoint.setOnClickListener {
            ObjectAnimator.ofObject(pointView, "point", PointEvaluator(), Point(500f, 600f)).apply {
                duration = 2000
                interpolator = SpringInterceptor(0.6f)
                start()
            }
        }

    }
}
