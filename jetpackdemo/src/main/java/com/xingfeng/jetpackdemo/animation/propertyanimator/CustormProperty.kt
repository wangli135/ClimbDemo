package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.TimeInterpolator
import android.animation.TypeEvaluator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

/**
 * @Author: 王立
 * @Date: 2019-05-07 10:54
 * @Desc:
 */

data class Point(var x: Float, var y: Float)

class PointView
@JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defaultResId: Int = 0)
    : View(context, attrs, defStyleAttr, defaultResId) {

    var point: Point = Point(40f, 40f)
        set(value) {
            field = value
            invalidate()
        }

    val paint: Paint = Paint().apply {
        isAntiAlias = true
        isDither = true
        color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawCircle(point.x, point.y, 30f, paint)

    }
}

class PointEvaluator : TypeEvaluator<Point> {
    override fun evaluate(fraction: Float, startValue: Point, endValue: Point): Point {
        val x = startValue.x + (endValue.x - startValue.x) * fraction
        val y = startValue.y + (endValue.y - startValue.y) * fraction
        return Point(x, y)
    }
}

class SpringInterceptor(private val factor: Float) : TimeInterpolator {
    override fun getInterpolation(input: Float): Float {
        return (Math.pow(2.0, -10.0 * input) * Math.sin((input - factor / 4) * (2 * Math.PI) / factor) + 1).toFloat()
    }
}
