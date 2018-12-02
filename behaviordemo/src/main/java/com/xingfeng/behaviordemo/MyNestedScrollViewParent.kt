package com.xingfeng.behaviordemo

import android.content.Context
import android.support.v4.view.NestedScrollingParent2
import android.support.v4.view.NestedScrollingParentHelper
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.view.View
import android.view.ViewTreeObserver
import android.widget.LinearLayout

/**
 * @Author: 王立
 * @Date: 2018/11/27 15:53
 */


class MyNestedScrollViewParent : LinearLayout, NestedScrollingParent2 {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }


    fun init() {
        mParentHelper = NestedScrollingParentHelper(this)
    }


    private lateinit var mParentHelper: NestedScrollingParentHelper
    var mFirstChildHeight: Int = 0

    override fun onFinishInflate() {
        super.onFinishInflate()
        val firstChild = getChildAt(0)
        firstChild?.viewTreeObserver?.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                mFirstChildHeight=firstChild.measuredHeight
                firstChild.viewTreeObserver.removeOnGlobalLayoutListener(this)
            }
        })
    }

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        val isFirstChildVisible = (dy > 0 && scrollY < mFirstChildHeight) || (dy < 0 && target.scrollY<=0)
        if (isFirstChildVisible) {
            consumed[1] = dy
            scrollBy(0, dy)
        }
    }

    override fun onStopNestedScroll(target: View, type: Int) {
        mParentHelper.onStopNestedScroll(target, type)
    }

    override fun onStartNestedScroll(child: View, parent: View, axies: Int, type: Int): Boolean {
        return ViewCompat.SCROLL_AXIS_VERTICAL.and(axies) != 0
    }

    override fun onNestedScrollAccepted(child: View, parent: View, axies: Int, type: Int) {
        mParentHelper.onNestedScrollAccepted(child, parent, axies, type)
    }

    override fun onNestedScroll(p0: View, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int) {
    }

    override fun scrollTo(x: Int, y: Int) {
        var dy = if (y < 0) 0 else y
        dy = if (dy > mFirstChildHeight) mFirstChildHeight else dy
        super.scrollTo(x, dy)
    }

}