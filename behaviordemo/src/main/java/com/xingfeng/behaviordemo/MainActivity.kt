package com.xingfeng.behaviordemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBottomSheetBehavior.setOnClickListener {
            startActivity(Intent(this, BottomSheetBehaviorActivity::class.java))
        }
//        btnFirstBehavior.setOnClickListener {
//            startActivity(Intent(this, FirstBehaviorActivity::class.java))
//        }
//        btnSwipeRefreshLayout.setOnClickListener {
//            startActivity(Intent(this, SwipeRefreshLayoutActivity::class.java))
//        }
//        btnShowHideBehavior.setOnClickListener {
//            startActivity(Intent(this, ShowHideBehaviorActivity::class.java))
//        }
//        btnCoverHeaderBehavior.setOnClickListener {
//            startActivity(Intent(this, CoverHeaderBehaviorActivity::class.java))
//        }
//        btnNormalScroll.setOnClickListener {
//            startActivity(Intent(this, DefaultScrollingActivity::class.java))
//        }
//        btnCustomNestedScrollView.setOnClickListener {
//            startActivity(Intent(this, ScrollingActivity::class.java))
//        }
//        btnHeaderBehavior.setOnClickListener {
//            startActivity(Intent(this, HeaderBehaviorActivity::class.java))
//        }
    }
}
