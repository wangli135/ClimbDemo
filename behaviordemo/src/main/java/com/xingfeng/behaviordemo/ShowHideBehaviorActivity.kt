package com.xingfeng.behaviordemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_hide_behavior.*

class ShowHideBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_hide_behavior)
        recyclerView.adapter=TitleAdapter(getDatas())
    }

}
