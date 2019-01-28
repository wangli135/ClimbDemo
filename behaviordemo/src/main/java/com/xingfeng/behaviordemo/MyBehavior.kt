package com.xingfeng.behaviordemo

import android.animation.ObjectAnimator
import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v4.view.ViewCompat
import android.support.v4.widget.NestedScrollView
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


/**
 * @Author: 王立
 * @Date: 2019/1/22 17:21
 * @Desc: 本TextView根据另一textView变化TransitionY
 */
class FirstBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<TextView>(context, attributeSet) {
    override fun layoutDependsOn(parent: CoordinatorLayout, child: TextView, dependency: View): Boolean {
        return dependency is TextView
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: TextView, dependency: View): Boolean {
        child.translationY = dependency.translationY
        return true
    }

    //依赖移除时的处理
    override fun onDependentViewRemoved(parent: CoordinatorLayout, child: TextView, dependency: View) {
        ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, 400f).apply {
            duration = 3000
            start()
        }
    }


    //参与布局，等同于该TextView在布局文件中设置layout_gravity="right"，返回true，CoordinatorLayout就不再layout了
    override fun onLayoutChild(parent: CoordinatorLayout, child: TextView, layoutDirection: Int): Boolean {
        val left = parent.measuredWidth - child.measuredWidth
        child.layout(left, 0, left + child.measuredWidth, child.measuredHeight)
        return true
    }

    //参数measure，返回true，CoordinatorLayout就不再measure了
    override fun onMeasureChild(parent: CoordinatorLayout, child: TextView, parentWidthMeasureSpec: Int, widthUsed: Int, parentHeightMeasureSpec: Int, heightUsed: Int): Boolean {
        child.measure(View.MeasureSpec.makeMeasureSpec(300, View.MeasureSpec.EXACTLY), View.MeasureSpec.makeMeasureSpec(300, View.MeasureSpec.EXACTLY))
        return true
    }
}

/**
 * 滚动时隐藏，停止时显示
 */
class ShowHideBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<LinearLayout>(context, attributeSet) {

    //布局在底部
    override fun onLayoutChild(parent: CoordinatorLayout, child: LinearLayout, layoutDirection: Int): Boolean {
        val top = parent.measuredHeight - child.measuredHeight
        child.layout(0, top, child.measuredWidth, top + child.measuredHeight)
        return true
    }

    //是否支持内嵌滚动
    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: LinearLayout, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return ViewCompat.SCROLL_AXIS_VERTICAL.and(axes) != 0
    }

    var isShow = true
    var animator: ObjectAnimator? = null

    override fun onStopNestedScroll(coordinatorLayout: CoordinatorLayout, child: LinearLayout, target: View, type: Int) {
        super.onStopNestedScroll(coordinatorLayout, child, target, type)
        if (!isShow) {
            child.clearAnimation()
            animator?.cancel()
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, 0f).apply {
                start()
            }
            isShow = isShow.not()
        }
    }

    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: LinearLayout, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type)
        if (isShow) {
            child.clearAnimation()
            animator?.cancel()
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, child.height.toFloat()).apply {
                start()
            }
            isShow = isShow.not()
        }
    }
}

/**
 * 遮住头
 */
class CoverHeaderBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<View>(context, attributeSet) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is ImageView
    }

    var initOffset: Float? = null

    override fun onLayoutChild(parent: CoordinatorLayout, child: View, layoutDirection: Int): Boolean {
        parent.onLayoutChild(child, layoutDirection)
        child.translationY = parent.getDependencies(child)[0].height.toFloat()
        initOffset = child.translationY
        return true
    }

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: View, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return ViewCompat.SCROLL_AXIS_VERTICAL.and(axes) != 0
    }

    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: View, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        //在这个方法只处理向上滑，首先移动
        if (dy > 0) {
            if (child.translationY > 0) {
                val newY = Math.max(0f, child.translationY - dy)
                consumed[1] = dy
                child.translationY = newY
            }
        }
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)
    }

    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: View, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type)
        // 在这个方法里只处理向下滑动
        if (dyUnconsumed > 0) {
            return
        }

        val transY = child.translationY - dyUnconsumed
        if (transY > 0 && transY < initOffset!!) {
            child.translationY = transY
        }
    }

}

/**
 * 头部Header，布局在最顶部
 */
class HeaderBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<View>(context, attributeSet) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is NestedScrollView
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        child.translationY = dependency.translationY
        return true
    }
}

class SecondHeaderBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<View>(context, attributeSet) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is ImageView
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        child.translationY = dependency.translationY
        return true
    }

    override fun onLayoutChild(parent: CoordinatorLayout, child: View, layoutDirection: Int): Boolean {
        var top = parent.getDependencies(child)[0].height
        child.layout(0, top, child.measuredWidth, top + child.measuredHeight)
        return true
    }
}

class NestedBehavior @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null)
    : CoordinatorLayout.Behavior<View>(context, attributeSet) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is TextView
    }

    var initOffset:Float?=null

    override fun onLayoutChild(parent: CoordinatorLayout, child: View, layoutDirection: Int): Boolean {
        parent.onLayoutChild(child,layoutDirection)
        child.translationY=parent.getDependencies(child)[0].bottom.toFloat()
        initOffset=child.translationY
        return true
    }

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: View, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return ViewCompat.SCROLL_AXIS_VERTICAL.and(axes) != 0
    }

    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: View, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        //在这个方法只处理向上滑，首先移动
        if (dy > 0) {
            if (child.translationY > 0) {
                val newY = Math.max(0f, child.translationY - dy)
                consumed[1] = (child.translationY - newY).toInt()
                child.translationY = newY
            }
        }
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)
    }

    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: View, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type)
        // 在这个方法里只处理向下滑动
        if (dyUnconsumed > 0) {
            return
        }

        val transY = child.translationY - dyUnconsumed
        if (transY > 0 && transY < initOffset!!) {
            child.translationY = transY
        }
    }
}




