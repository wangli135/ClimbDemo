package com.xingfeng.behaviordemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * @Author: 王立
 * @Date: 2019/1/25 16:23
 * @Desc:
 */

fun getDatas(): List<String> {
    val list = mutableListOf<String>()
    for (c in 'a'..'z') {
        list.add(c.toString().toUpperCase())
    }
    return list
}

fun getScreenHeight(context: Context) = context.resources.displayMetrics.heightPixels

class TitleAdapter(val datas: List<String>) : RecyclerView.Adapter<TitleViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): TitleViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_item_datas, viewGroup, false)
        return TitleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(viewHolder: TitleViewHolder, position: Int) {
        viewHolder.tvTitle.text = datas[position]
    }
}

class TitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tvTitle: TextView

    init {
        tvTitle = itemView.findViewById(R.id.text)
    }
}

