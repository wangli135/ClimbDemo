package com.xingfeng.jetpackdemo.architecture.databinding

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xingfeng.jetpackdemo.R
import kotlinx.android.synthetic.main.activity_data_binding_main.*

class DataBindingMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding_main)

        firstExample.setOnClickListener {
            startActivity(Intent(this,FirstExampleActivity::class.java))
        }

    }
}
