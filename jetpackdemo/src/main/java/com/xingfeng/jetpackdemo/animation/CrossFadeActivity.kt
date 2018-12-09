package com.xingfeng.jetpackdemo.animation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_cross_fade.*

/**
 * 淡入淡出动画
 */
class CrossFadeActivity : AppCompatActivity() {

    private var mShortAnimationDuration: Int = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cross_fade)
        crossFade()
    }

    private fun crossFade() {
        content.apply {
            visibility = View.VISIBLE
            alpha = 0f

            animate().alpha(1.0f)
                    .setDuration(mShortAnimationDuration.toLong())
                    .withEndAction {
                        content.visibility = View.VISIBLE
                    }.start()

        }

        loading_spinner.animate()
                .alpha(0.0f)
                .setDuration(mShortAnimationDuration.toLong())
                .withEndAction {
                    loading_spinner.visibility = View.GONE
                }.start()

    }

}
