package com.xingfeng.jetpackdemo.animation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.Point
import android.graphics.Rect
import android.graphics.RectF
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.DecelerateInterpolator
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_enlarge_image.*

class EnlargeImageActivity : AppCompatActivity() {

    private var mCurrentAnimator: Animator? = null

    private var mShortAnimationDuration: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enlarge_image)

        imageBtn.setOnClickListener {
            //            zoomImageFromThumb()
            zoomImageFromThumbV2()
        }

        imageView.setOnClickListener {
            //            zoomImageFromLarge()
            zoomImageFromLargeV2()
        }

        mShortAnimationDuration = resources.getInteger(android.R.integer.config_shortAnimTime)
    }

    //从大到小
    private fun zoomImageFromLarge() {
        mCurrentAnimator?.cancel()

        imageBtn.setImageResource(R.drawable.pic_11)

        val startBoundsInt = Rect()
        val finalBoundsInt = Rect()
        val globalOffset = Point()

        imageView.getGlobalVisibleRect(startBoundsInt, globalOffset)
        imageBtn.getGlobalVisibleRect(finalBoundsInt)
        startBoundsInt.offset(-globalOffset.x, -globalOffset.y)
        finalBoundsInt.offset(-globalOffset.x, -globalOffset.y)

        val startBounds = RectF(startBoundsInt)
        val finalBounds = RectF(finalBoundsInt)

        val startScale: Float
        if ((finalBounds.width() / finalBounds.height() > startBounds.width() / startBounds.height())) {
            // Extend start bounds horizontally
            startScale = startBounds.height() / finalBounds.height()
            val startWidth: Float = startScale * finalBounds.width()
            val deltaWidth: Float = (startWidth - startBounds.width()) / 2
            startBounds.left -= deltaWidth.toInt()
            startBounds.right += deltaWidth.toInt()
        } else {
            // Extend start bounds vertically
            startScale = startBounds.width() / finalBounds.width()
            val startHeight: Float = startScale * finalBounds.height()
            val deltaHeight: Float = (startHeight - startBounds.height()) / 2f
            startBounds.top -= deltaHeight.toInt()
            startBounds.bottom += deltaHeight.toInt()
        }

        imageView.visibility = View.INVISIBLE
        imageBtn.visibility = View.VISIBLE

        imageBtn.pivotX = 0f
        imageBtn.pivotY = 0f

        mCurrentAnimator = AnimatorSet().apply {
            play(ObjectAnimator.ofFloat(
                    imageBtn,
                    View.X,
                    startBounds.left,
                    finalBounds.left)
            ).apply {
                with(ObjectAnimator.ofFloat(imageBtn, View.Y, startBounds.top, finalBounds.top))
                with(ObjectAnimator.ofFloat(imageBtn, View.SCALE_X, startScale, 1f))
                with(ObjectAnimator.ofFloat(imageBtn, View.SCALE_Y, startScale, 1f))
            }
            duration = mShortAnimationDuration.toLong()
            interpolator = DecelerateInterpolator()
            addListener(object : AnimatorListenerAdapter() {

                override fun onAnimationEnd(animation: Animator) {
                    mCurrentAnimator = null
                }

                override fun onAnimationCancel(animation: Animator) {
                    mCurrentAnimator = null
                }
            })
            start()
        }
    }

    //从小到大
    private fun zoomImageFromThumb() {

        mCurrentAnimator?.cancel()

        imageView.setImageResource(R.drawable.pic_11)

        //获取尺寸
        val startBoundsInt = Rect()
        val finalBoundsInt = Rect()
        val globalOffset = Point()

        imageBtn.getGlobalVisibleRect(startBoundsInt)
        imageView.getGlobalVisibleRect(finalBoundsInt, globalOffset)
        //调整使top=left=0
        startBoundsInt.offset(-globalOffset.x, -globalOffset.y)
        finalBoundsInt.offset(-globalOffset.x, -globalOffset.y)

        val startBounds = RectF(startBoundsInt)
        val finalBounds = RectF(finalBoundsInt)

        //计算宽高缩放比
        val startScale: Float
        if ((finalBounds.width() / finalBounds.height() > startBounds.width() / startBounds.height())) {
            startScale = startBounds.height() / finalBounds.height()
            val startWidth: Float = startScale * finalBounds.width()
            val deltaWidth: Float = (startWidth - startBounds.width()) / 2
            startBounds.left -= deltaWidth.toInt()
            startBounds.right += deltaWidth.toInt()
        } else {
            // Extend start bounds vertically
            startScale = startBounds.width() / finalBounds.width()
            val startHeight: Float = startScale * finalBounds.height()
            val deltaHeight: Float = (startHeight - startBounds.height()) / 2f
            startBounds.top -= deltaHeight.toInt()
            startBounds.bottom += deltaHeight.toInt()
        }

        imageBtn.visibility = View.INVISIBLE
        imageView.visibility = View.VISIBLE

        imageView.pivotX = 0f
        imageView.pivotY = 0f

        mCurrentAnimator = AnimatorSet().apply {
            //x、y、scaleX、scaleY四个维度一起动画
            play(ObjectAnimator.ofFloat(
                    imageView,
                    View.X,
                    startBounds.left,
                    finalBounds.left)
            ).apply {
                with(ObjectAnimator.ofFloat(imageView, View.Y, startBounds.top, finalBounds.top))
                with(ObjectAnimator.ofFloat(imageView, View.SCALE_X, startScale, 1f))
                with(ObjectAnimator.ofFloat(imageView, View.SCALE_Y, startScale, 1f))
            }
            duration = mShortAnimationDuration.toLong()
            interpolator = DecelerateInterpolator()
            addListener(object : AnimatorListenerAdapter() {

                override fun onAnimationEnd(animation: Animator) {
                    mCurrentAnimator = null
                }

                override fun onAnimationCancel(animation: Animator) {
                    mCurrentAnimator = null
                }
            })
            start()
        }
    }

    //从大到小
    private fun zoomImageFromLargeV2() {
        mCurrentAnimator?.cancel()

        imageBtn.setImageResource(R.drawable.pic_11)

        val startBoundsInt = Rect()
        val finalBoundsInt = Rect()
        val globalOffset = Point()

        imageView.getGlobalVisibleRect(startBoundsInt, globalOffset)
        imageBtn.getGlobalVisibleRect(finalBoundsInt)
        startBoundsInt.offset(-globalOffset.x, -globalOffset.y)
        finalBoundsInt.offset(-globalOffset.x, -globalOffset.y)

        val startBounds = RectF(startBoundsInt)
        val finalBounds = RectF(finalBoundsInt)

        val startHScale = startBounds.width() / finalBounds.width()
        val startVScale = startBounds.height() / finalBounds.height()
//        val startScale: Float
//        if ((finalBounds.width() / finalBounds.height() > startBounds.width() / startBounds.height())) {
//            // Extend start bounds horizontally
//            startScale = startBounds.height() / finalBounds.height()
//            val startWidth: Float = startScale * finalBounds.width()
//            val deltaWidth: Float = (startWidth - startBounds.width()) / 2
//            startBounds.left -= deltaWidth.toInt()
//            startBounds.right += deltaWidth.toInt()
//        } else {
//            // Extend start bounds vertically
//            startScale = startBounds.width() / finalBounds.width()
//            val startHeight: Float = startScale * finalBounds.height()
//            val deltaHeight: Float = (startHeight - startBounds.height()) / 2f
//            startBounds.top -= deltaHeight.toInt()
//            startBounds.bottom += deltaHeight.toInt()
//        }

        imageView.visibility = View.INVISIBLE
        imageBtn.visibility = View.VISIBLE

        imageBtn.pivotX = 0f
        imageBtn.pivotY = 0f

        mCurrentAnimator = AnimatorSet().apply {
            play(ObjectAnimator.ofFloat(
                    imageBtn,
                    View.X,
                    startBounds.left,
                    finalBounds.left)
            ).apply {
                with(ObjectAnimator.ofFloat(imageBtn, View.Y, startBounds.top, finalBounds.top))
                with(ObjectAnimator.ofFloat(imageBtn, View.SCALE_X, startHScale, 1f))
                with(ObjectAnimator.ofFloat(imageBtn, View.SCALE_Y, startVScale, 1f))
            }
            duration = mShortAnimationDuration.toLong()
            interpolator = DecelerateInterpolator()
            addListener(object : AnimatorListenerAdapter() {

                override fun onAnimationEnd(animation: Animator) {
                    mCurrentAnimator = null
                }

                override fun onAnimationCancel(animation: Animator) {
                    mCurrentAnimator = null
                }
            })
            start()
        }
    }

    //从小到大
    private fun zoomImageFromThumbV2() {

        mCurrentAnimator?.cancel()

        imageView.setImageResource(R.drawable.pic_11)

        //获取尺寸
        val startBoundsInt = Rect()
        val finalBoundsInt = Rect()
        val globalOffset = Point()

        imageBtn.getGlobalVisibleRect(startBoundsInt)
        imageView.getGlobalVisibleRect(finalBoundsInt, globalOffset)
        //调整使top=left=0
        startBoundsInt.offset(-globalOffset.x, -globalOffset.y)
        finalBoundsInt.offset(-globalOffset.x, -globalOffset.y)

        val startBounds = RectF(startBoundsInt)
        val finalBounds = RectF(finalBoundsInt)

        //计算宽高缩放比
        val startHScale = startBounds.width() / finalBounds.width()
        val startVScale = startBounds.height() / finalBounds.height()
//        val startScale: Float
//        if ((finalBounds.width() / finalBounds.height() > startBounds.width() / startBounds.height())) {
//            startScale = startBounds.height() / finalBounds.height()
//            val startWidth: Float = startScale * finalBounds.width()
//            val deltaWidth: Float = (startWidth - startBounds.width()) / 2
//            startBounds.left -= deltaWidth.toInt()
//            startBounds.right += deltaWidth.toInt()
//        } else {
//            // Extend start bounds vertically
//            startScale = startBounds.width() / finalBounds.width()
//            val startHeight: Float = startScale * finalBounds.height()
//            val deltaHeight: Float = (startHeight - startBounds.height()) / 2f
//            startBounds.top -= deltaHeight.toInt()
//            startBounds.bottom += deltaHeight.toInt()
//        }

        imageBtn.visibility = View.INVISIBLE
        imageView.visibility = View.VISIBLE

        imageView.pivotX = 0f
        imageView.pivotY = 0f

        mCurrentAnimator = AnimatorSet().apply {
            //x、y、scaleX、scaleY四个维度一起动画
            play(ObjectAnimator.ofFloat(
                    imageView,
                    View.X,
                    startBounds.left,
                    finalBounds.left)
            ).apply {
                with(ObjectAnimator.ofFloat(imageView, View.Y, startBounds.top, finalBounds.top))
                with(ObjectAnimator.ofFloat(imageView, View.SCALE_X, startHScale, 1f))
                with(ObjectAnimator.ofFloat(imageView, View.SCALE_Y, startVScale, 1f))
            }
            duration = mShortAnimationDuration.toLong()
            interpolator = DecelerateInterpolator()
            addListener(object : AnimatorListenerAdapter() {

                override fun onAnimationEnd(animation: Animator) {
                    mCurrentAnimator = null
                }

                override fun onAnimationCancel(animation: Animator) {
                    mCurrentAnimator = null
                }
            })
            start()
        }
    }
}
