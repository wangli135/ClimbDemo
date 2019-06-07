package com.enniu.hookdemo

import android.content.ClipboardManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enniu.hookdemo.binderhook.hookBinder
import kotlinx.android.synthetic.main.activity_binder_hook.*

class BinderHookActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        hookBinder()
        super.attachBaseContext(newBase)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binder_hook)

        btnCopy.setOnClickListener {
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            with(clipboardManager) {
                if (hasPrimaryClip()) {
                    Log.i("TAG", primaryClip?.toString())
                }
            }
        }

    }
}
