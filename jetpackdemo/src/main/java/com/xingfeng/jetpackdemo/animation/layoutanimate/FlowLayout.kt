package com.xingfeng.jetpackdemo.animation.layoutanimate

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup

/**
 * @Author: 王立
 * @Date: 2019/1/9 14:49
 * @Desc:
 */
class FlowLayout : ViewGroup {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        for (i in 0..childCount) {
            getChildAt(i)?.apply {
                measureChild(this, widthMeasureSpec, heightMeasureSpec)
            }
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        var left = 0
        var top = 0
        var lineWidth = 0
        var lineHeight = 0
        val w = measuredWidth

        for (i in 0..childCount) {
            getChildAt(i)?.apply {
                val width = measuredWidth
                val height = measuredHeight
                //换行
                if (width + lineWidth > w) {
                    top += lineHeight
                    left = l
                    lineHeight = height
                    lineWidth = width
                    layout(left, top, left + width, top + height)
                } else {
                    left = lineWidth
                    layout(left, top, left + width, top + height)
                    lineHeight = Math.max(lineHeight, height)
                    lineWidth += width

                }
            }
        }
    }
}