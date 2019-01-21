package com.xingfeng.jetpackdemo.animation.layoutanimate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Scene
import android.transition.TransitionManager
import android.transition.TransitionSet
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_custom_transition.*

class CustomTransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_transition)

        var endScene: Scene? = null

        secneRg.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.scene1Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.custom_layout_scene_1, this)
                }
                R.id.scene2Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.custom_layout_scene_2, this)
                }
            }
            TransitionManager.go(endScene, TransitionSet().apply {
                addTransition(CustomTransition())
                addTransition(ChangeBounds())
            })
        }


    }
}
