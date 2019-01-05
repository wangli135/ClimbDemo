package com.xingfeng.asynclayoutinflater

import android.os.Bundle
import android.support.v4.view.AsyncLayoutInflater
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var context = this
        var inflater = AsyncLayoutInflater(this)
        btnShare.setOnClickListener {
            inflater.inflate(R.layout.layout_share, null,
                    { view, resId, viewGroup ->
                        view.findViewById<ImageView>(R.id.ivAvatar).setImageResource(R.drawable.pic_11)
                        view.findViewById<TextView>(R.id.tvName).text = "杨幂"
                        val dialog=AlertDialog.Builder(context).setView(view)
                                .create()
                        val attrs=dialog.window.attributes
                        attrs.width=300
                        attrs.height=300
                        dialog.window.attributes=attrs
                        dialog.show()
                    })
        }

    }
}
