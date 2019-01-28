package com.xingfeng.behaviordemo

import android.content.Context
import android.support.v4.view.NestedScrollingChild2
import android.support.v4.view.NestedScrollingChildHelper
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout

/**
 * @Author: 王立
 * @Date: 2018/12/1 09:23
 * @Desc:
 */
class MyNestedScrollViewChild : LinearLayout, NestedScrollingChild2 {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    fun init() {
        mNestScrollViewHelper = NestedScrollingChildHelper(this)
        mNestScrollViewHelper.isNestedScrollingEnabled = true
    }

    private lateinit var mNestScrollViewHelper: NestedScrollingChildHelper
    var mViewHeight = 0
    var mCanScrollY = 0
    var mLastMotionY = 0

    val mScrollOffsert = IntArray(2)
    val mScrollConsumed = IntArray(2)

    override fun dispatchNestedScroll(dxComsumed: Int, dyConsumed: Int, dxUnComsumed: Int, dyUnComsumed: Int, offsetInWindow: IntArray?, type: Int): Boolean {
        return mNestScrollViewHelper.dispatchNestedScroll(dxComsumed, dyConsumed, dxUnComsumed, dyUnComsumed, offsetInWindow, type)
    }

    override fun startNestedScroll(axes: Int, type: Int): Boolean {
        return mNestScrollViewHelper.startNestedScroll(axes, type)
    }

    override fun dispatchNestedPreScroll(dx: Int, dy: Int, consumed: IntArray?, offsetInWindow: IntArray?, type: Int): Boolean {
        return mNestScrollViewHelper.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type)
    }

    override fun stopNestedScroll(type: Int) {
        mNestScrollViewHelper.stopNestedScroll(type)
    }

    override fun hasNestedScrollingParent(type: Int): Boolean {
        return mNestScrollViewHelper.hasNestedScrollingParent(type)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (mViewHeight <= 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
            mViewHeight = measuredHeight
        } else {
            val newHeightMeasureSpec = MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.UNSPECIFIED)
            super.onMeasure(widthMeasureSpec, newHeightMeasureSpec)
            mCanScrollY = measuredHeight
        }
    }

    override fun scrollTo(x: Int, y: Int) {
        var dy = if (y < 0) 0 else y
        dy = if (dy > mCanScrollY) mCanScrollY else dy
        super.scrollTo(x, dy)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                mLastMotionY = event?.y.toInt()
                startNestedScroll(ViewCompat.SCROLL_AXIS_VERTICAL, ViewCompat.TYPE_TOUCH)
            }
            MotionEvent.ACTION_MOVE -> {
                var y = event?.y.toInt()
                var deltaY = mLastMotionY - y
                if (dispatchNestedPreScroll(0, deltaY, mScrollConsumed, mScrollOffsert, ViewCompat.TYPE_TOUCH)) {
                    deltaY-=mScrollConsumed[1]
                }
                scrollBy(0, deltaY)
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                mNestScrollViewHelper.stopNestedScroll(ViewCompat.TYPE_TOUCH)
            }

        }

        return true
    }
}