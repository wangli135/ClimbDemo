package com.xingfeng.jetpackdemo.animation.layoutanimate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Scene
import android.transition.TransitionInflater
import android.transition.TransitionManager
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_transition_layout.*

class TransitionLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_layout)

        secneRg.setOnCheckedChangeListener { group, checkedId ->
            var endScene: Scene? = null
            when (checkedId) {
                R.id.scene1Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.layout_scene_1, this)
                }
                R.id.scene2Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.layout_scene_2, this)
                }
                R.id.scene3Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.layout_scene_3, this)
                }
                R.id.scene4Rb -> {
                    endScene = Scene.getSceneForLayout(scene_root, R.layout.layout_scene_4, this)
                }
            }
//            TransitionManager.go(endScene, TransitionSet().apply {
//                removeTarget(middleTv)
//                addTransition(Fade())
//                addTransition(ChangeBounds())
//            })
//            TransitionManager.go(endScene,TransitionInflater.from(this)
//                    .inflateTransition(R.transition.autotransition))
            TransitionManager.go(endScene, CustomTransition())
//            TransitionManager.go(endScene,AutoTransition())
//            TransitionManager.go(endScene)
        }

    }
}
