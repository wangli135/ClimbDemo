package com.xingfeng.jetpackdemo.animation.activitytransition

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_transition.*
import android.support.v4.util.Pair as UtilPair

class ActivityTransitionActivity : AppCompatActivity() {

    var slideEdge = Gravity.TOP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        btnFade.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.startActivity(this,
                        Intent(this, FadeActivity::class.java),
                        ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
            } else {
                startActivity(Intent(this, FadeActivity::class.java))
            }
        }
        btnExplode.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.startActivity(this,
                        Intent(this, ExplodeActivity::class.java),
                        ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
            } else {
                startActivity(Intent(this, ExplodeActivity::class.java))
            }
        }

        slideEdgeRg.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.topEdgeRb -> slideEdge = Gravity.TOP
                R.id.bottomEdgeRb -> slideEdge = Gravity.BOTTOM
                R.id.leftEdgeRb -> slideEdge = Gravity.LEFT
                R.id.rightEdgeRb -> slideEdge = Gravity.RIGHT
            }
        }
        btnSlide.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.startActivity(this,
                        Intent(this, SlideActivity::class.java).apply {
                            putExtra("slideedge", slideEdge)
                        },
                        ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
            } else {
                startActivity(Intent(this, SlideActivity::class.java))
            }
        }

        ivShareIv.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ActivityCompat.startActivity(this,
                        Intent(this, ShareViewActivity::class.java),
                        ActivityOptionsCompat.makeSceneTransitionAnimation(this, ivShareIv, "image").toBundle())
            } else {
                startActivity(Intent(this, ShareViewActivity::class.java))
            }
        }

        tvShare.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this,
                        UtilPair<View, String>(ivShareIv, "image"),
                        UtilPair<View, String>(tvShare, "text")
                )
                ActivityCompat.startActivity(this,
                        Intent(this, ShareViewActivity::class.java).apply {
                            putExtra("showTwoView", true)
                        },
                        options.toBundle()
                )
            } else {
                startActivity(Intent(this, ShareViewActivity::class.java))
            }
        }

        btnScaleUp.setOnClickListener {
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
                val options = ActivityOptionsCompat.makeScaleUpAnimation(it!!, it!!.x.toInt(), it!!.y.toInt(), 300, 300)
                ActivityCompat.startActivity(this, Intent(this, ScaleUpActivity::class.java), options.toBundle())
            } else {
                startActivity(Intent(this, ScaleUpActivity::class.java))
            }
        }

        btnThumbnailScaleUp.setOnClickListener {
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
                val options = ActivityOptionsCompat.makeThumbnailScaleUpAnimation(it!!, BitmapFactory.decodeResource(resources, R.drawable.pic_11), btnThumbnailScaleUp.x.toInt(), btnThumbnailScaleUp.y.toInt())
                ActivityCompat.startActivity(this, Intent(this, ThumbnailScaleUpActivity::class.java), options.toBundle())
            } else {
                startActivity(Intent(this, ThumbnailScaleUpActivity::class.java))
            }
        }

    }
}
