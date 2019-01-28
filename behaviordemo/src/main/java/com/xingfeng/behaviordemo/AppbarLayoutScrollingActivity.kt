package com.xingfeng.behaviordemo

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_scrolling2.*

class AppbarLayoutScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling2)
        setSupportActionBar(toolBar)

//        app_bar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, offset ->
//            val toolBarHeight = toolBar.height
//            if (Math.abs(offset) <= toolBarHeight) {
//                appBarLayout.alpha = 1.0f - Math.abs(offset) * 1.0f / toolBarHeight
//            }
//        })

    }
}
