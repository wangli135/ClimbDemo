package com.xingfeng.jetpackdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xingfeng.jetpackdemo.animation.MainActivity
import com.xingfeng.jetpackdemo.architecture.databinding.DataBindingMainActivity
import kotlinx.android.synthetic.main.activity_jetpack_main.*

class JetpackMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack_main)

        animation.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        architecture.setOnClickListener {
            startActivity(Intent(this, DataBindingMainActivity::class.java))
        }

    }
}
