package com.xingfeng.behaviordemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val data=initDatas()
        val adapter=DataAdapter(data)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter

    }

    private fun initDatas(): List<String> {
        val result= mutableListOf<String>()
        for(i in 1..15){
            result.add(i.toString())
        }
        return result
    }


}

class DataAdapter(data:List<String>):RecyclerView.Adapter<TextViewHolder>(){

    val data:List<String>

    init {
        this.data=data
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TextViewHolder {
        return TextViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_tv_layout,p0,false))
    }

    override fun onBindViewHolder(p0: TextViewHolder, p1: Int) {
        p0.tvTitle.text=data[p1]
    }
}

class TextViewHolder(view:View):RecyclerView.ViewHolder(view){

    val tvTitle: TextView

    init {
        tvTitle=view.findViewById(R.id.tv_title)
    }


}

