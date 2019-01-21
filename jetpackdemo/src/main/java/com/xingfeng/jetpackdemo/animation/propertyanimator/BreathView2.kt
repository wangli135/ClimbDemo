package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.StateListAnimator
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

/**
 * @Author: 王立
 * @Date: 2019/1/17 17:00
 * @Desc: 呼吸效果的View，在onTouch中控制属性动画开关
 */
class BreathView2 @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0) : View(context, attributeSet, defStyleAttr) {

    val MIN_INNER_RADIUS_FACTOR = 0.75f
    val MAX_INNER_RADIUS_FACTOR = 0.9f

    init {
        isClickable = true
    }

    val paint: Paint by lazy {
        Paint().apply {
            isAntiAlias = true
            isDither = true
            style = Paint.Style.STROKE
            color = Color.RED
        }
    }

    val pressedAnimtor by lazy {
        val pressedOuterAnim = AnimatorSet().apply {
            play(ObjectAnimator.ofFloat(this@BreathView2, SCALE_X, 1.0f, 1.5f))
                    .with(ObjectAnimator.ofFloat(this@BreathView2, SCALE_Y, 1.0f, 1.5f))
        }
        val pressedInnerAnim = ObjectAnimator.ofFloat(this, "innerRaduisFactor", MAX_INNER_RADIUS_FACTOR, MIN_INNER_RADIUS_FACTOR).apply {
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
            duration = 1000
        }
        AnimatorSet().apply {
            play(pressedOuterAnim).before(pressedInnerAnim)
        }
    }

    val normalAnimator by lazy {
        val normalOuterAnim = AnimatorSet().apply {
            play(ObjectAnimator.ofFloat(this@BreathView2, SCALE_X, 1.0f))
                    .with(ObjectAnimator.ofFloat(this@BreathView2, SCALE_Y, 1.0f))
        }
        val normalInnerAnim = ObjectAnimator.ofFloat(this, "innerRaduisFactor", 0f)
        AnimatorSet().apply {
            play(normalInnerAnim).before(normalOuterAnim)
        }
    }

    var innerRaduisFactor: Float = 0f
        //内部半径因子，[0,1）
        set(value) {
            field = value
            invalidate()
        }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthSpec = MeasureSpec.getMode(widthMeasureSpec)
        var width = MeasureSpec.getSize(widthMeasureSpec)
        val heightSpec = MeasureSpec.getMode(heightMeasureSpec)
        var height = MeasureSpec.getSize(heightMeasureSpec)

        if (widthSpec == MeasureSpec.EXACTLY && heightSpec == MeasureSpec.EXACTLY) {
            width = Math.max(width, height)
            height = width
        } else if (widthSpec == MeasureSpec.EXACTLY) {
            height = width
        } else if (heightSpec == MeasureSpec.EXACTLY) {
            height = width
        } else {
            width = 200
            height = 200
        }
        setMeasuredDimension(width, height)
    }

    var myX: Float = 0f
    var myY: Float = 0f
    val showText = "按住拍"

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (innerRaduisFactor >= MIN_INNER_RADIUS_FACTOR) {
            paint.style = Paint.Style.STROKE
            val left = measuredWidth * (1 - innerRaduisFactor) / 2
            val right = left + (width / 2 - left) * 2
            paint.strokeWidth = measuredWidth * (1 - innerRaduisFactor) / 2
            canvas?.drawArc(left, left, right, right, 0f, 360f, false, paint)
        } else {
            paint.style = Paint.Style.FILL
            canvas?.drawCircle(width / 2.0f, height / 2.0f, width / 2.0f, paint)
            paint.textSize = 40f
            paint.color = Color.WHITE
            val textX = (width - paint.measureText(showText)) / 2.0f
            val textY = height / 2 + Math.abs(paint.fontMetrics.ascent + paint.fontMetrics.descent) / 2
            canvas?.drawText(showText, 0, showText.length, textX, textY, paint)
            paint.color = Color.RED
        }
    }

    var xDiff: Float = 0f
    var yDiff: Float = 0f

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                myX = x
                myY = y
                xDiff = event?.rawX - x
                yDiff = event?.rawY - y
                normalAnimator.cancel()
                pressedAnimtor.start()
            }
            MotionEvent.ACTION_MOVE -> {
                x = event?.rawX - xDiff
                y = event?.rawY - yDiff
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                animate().x(myX).y(myY)
                pressedAnimtor.cancel()
                normalAnimator.start()
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        pressedAnimtor.cancel()
        normalAnimator.cancel()
    }

}