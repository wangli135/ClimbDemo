package com.xingfeng.jetpackdemo.animation.propertyanimator

import android.animation.*
import android.graphics.drawable.DrawableContainer
import android.graphics.drawable.StateListDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_state_list_animator.*

class StateListAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_list_animator)

        val xPressedAnim = ObjectAnimator.ofFloat(ivLike, View.SCALE_X, 1.0f, 1.5f).apply {
            duration = 1000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
        }
        val yPressedAnim = ObjectAnimator.ofFloat(ivLike, View.SCALE_Y, 1.0f, 1.5f).apply {
            duration = 1000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
        }
        val xNormalAnim = ObjectAnimator.ofFloat(ivLike, View.SCALE_X, 1.0f).apply {
            duration = 1000
        }
        val yNormalAnim = ObjectAnimator.ofFloat(ivLike, View.SCALE_Y, 1.0f).apply {
            duration = 1000
        }

        val pressedAnim = AnimatorSet().apply {
            play(xPressedAnim).with(yPressedAnim)
        }
        val normalAnim = AnimatorSet().apply {
            play(xNormalAnim).with(yNormalAnim)
        }

        //这个不能少，否则没有效果
        ivLike.isClickable=true
        ivLike.stateListAnimator = StateListAnimator().apply {
            addState(intArrayOf(android.R.attr.state_pressed), pressedAnim)
            //负数表示该状态=false
            addState(intArrayOf(-android.R.attr.state_pressed), normalAnim)
        }

        cardView.stateListAnimator=AnimatorInflater.loadStateListAnimator(this,R.animator.card_smooth_shadow)



    }
}
