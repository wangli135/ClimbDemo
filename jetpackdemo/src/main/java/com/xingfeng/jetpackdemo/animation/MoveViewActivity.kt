package com.xingfeng.jetpackdemo.animation

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Path
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.PathInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_move_view.*

class MoveViewActivity : AppCompatActivity() {


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_view)

        moveBtn.setOnClickListener {
            val path = Path().apply {
//                lineTo(400f, 0f)
//                moveTo(400f, 0f)
//                arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true)
//                lineTo(400f, 400f)
                lineTo(0.2f,0.2f)
                moveTo(0.2f,0.2f)
                lineTo(1f,1f)
            }
//            ObjectAnimator.ofFloat(tvShow, View.X, View.Y, path).apply {
//                duration = 2000
//                interpolator = PathInterpolator(0.3f, 0.7f)
//                start()
//            }
            ObjectAnimator.ofFloat(tvShow, "translationX", 400f).apply {
                duration = 2000
                interpolator = PathInterpolator(path)
                start()
            }
        }

    }
}
