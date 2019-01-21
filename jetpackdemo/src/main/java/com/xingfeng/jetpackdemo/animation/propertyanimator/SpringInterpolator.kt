package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.view.animation.Interpolator

/**
 * @Author: 王立
 * @Date: 2019/1/16 15:00
 * @Desc:
 */
class SpringInterpolator(val factor: Float) : Interpolator{

    override fun getInterpolation(input: Float): Float {
        return (Math.pow(2.0, -10.0 * input) * Math.sin((input - factor / 4) * (2 * Math.PI) / factor) + 1).toFloat()
    }
}