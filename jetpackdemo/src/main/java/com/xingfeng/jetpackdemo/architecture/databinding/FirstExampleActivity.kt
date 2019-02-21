package com.xingfeng.jetpackdemo.architecture.databinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xingfeng.jetpackdemo.R
import com.xingfeng.jetpackdemo.databinding.ActivityFirstExampleBinding
import com.xingfeng.jetpackdemo.model.User

class FirstExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityFirstExampleBinding = DataBindingUtil.setContentView(this, R.layout.activity_first_example)
        binding.user = User("data", "binding")
    }
}
