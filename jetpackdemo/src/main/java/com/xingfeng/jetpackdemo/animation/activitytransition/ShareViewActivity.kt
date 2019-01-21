package com.xingfeng.jetpackdemo.animation.activitytransition

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_share_view.*

class ShareViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        }
        setContentView(R.layout.activity_share_view)

        ivImage.transitionName = "image"
        if (intent.getBooleanExtra("showTwoView", false)) {
            tvTitle.transitionName = "text"
        }
//        ivImage.setImageResource(R.drawable.pic_11)
    }

    override fun onBackPressed() {
        finishAfterTransition()
    }
}
