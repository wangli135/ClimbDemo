package com.xingfeng.behaviordemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.AbsListView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_swipe_refresh_layout.*
import kotlin.math.log

class SwipeRefreshLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_refresh_layout)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getDatas())
        listView.adapter = adapter
        listView.setOnScrollListener(object : AbsListView.OnScrollListener {
            override fun onScroll(view: AbsListView?, firstVisibleItem: Int, visibleItemCount: Int, totalItemCount: Int) {
                Log.d("TAG", ""+listView.canScrollVertically(-1))//是否可以向下滚动
                Log.d("TAG", ""+listView.canScrollVertically(1))
            }

            override fun onScrollStateChanged(view: AbsListView?, scrollState: Int) {
            }
        })
    }

    private fun getDatas(): List<String> {
        val list = mutableListOf<String>()
        for (c in 'a'..'z') {
            list.add(c.toString().toUpperCase())
        }
        return list
    }

}
