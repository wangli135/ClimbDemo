package com.xingfeng.jetpackdemo.animation.layoutanimate

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.transition.Transition
import android.transition.TransitionSet
import android.transition.TransitionValues
import android.view.ViewGroup

/**
 * @Author: 王立
 * @Date: 2019/1/9 20:37
 * @Desc:
 */
class CustomTransition : Transition() {

    private val BACKGROUND_KEY = "com.xingfeng.jetpackdemo.animation.layoutanimate:CustomTransition:background"

    override fun captureStartValues(transitionValues: TransitionValues?) {
        catureValues(transitionValues)
    }

    private fun catureValues(transitionValues: TransitionValues?) {
        transitionValues?.values!![BACKGROUND_KEY] = transitionValues?.view?.background
    }

    override fun captureEndValues(transitionValues: TransitionValues?) {
        catureValues(transitionValues)
    }

    override fun createAnimator(sceneRoot: ViewGroup?, startValues: TransitionValues?, endValues: TransitionValues?): Animator? {
        if (startValues == null || endValues == null) {
            return null
        }

        val startDrawable = startValues?.values!![BACKGROUND_KEY] as Drawable
        val endDrawable = endValues?.values!![BACKGROUND_KEY] as Drawable
        if (startDrawable is ColorDrawable && endDrawable is ColorDrawable) {
            val startColor = startDrawable.color
            val endColor = endDrawable.color
            if (startColor != endColor) {
                return ObjectAnimator.ofObject(ArgbEvaluator(), startColor, endColor).apply {
                    addUpdateListener {
                        endValues?.view!!.setBackgroundColor(it?.animatedValue as Int)
                    }
                    duration = 3000
                }
            }
        }
        return null
    }

}