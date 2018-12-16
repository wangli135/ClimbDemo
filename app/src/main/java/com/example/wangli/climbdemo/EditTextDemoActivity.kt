package com.example.wangli.climbdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_edit_text_demo.*

class EditTextDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_demo)
        recyclerView.adapter = PicAdapter(getInitDatas())
    }

    fun getInitDatas(): List<PicItem> {
        val list = mutableListOf<PicItem>()
        list.add(PicItem(R.drawable.pic1, "Pic 1"))
        list.add(PicItem(R.drawable.pic2, "Pic 2"))
        list.add(PicItem(R.drawable.pic3, "Pic 3"))
        list.add(PicItem(R.drawable.pic4, "Pic 4"))
        list.add(PicItem(R.drawable.pic5, "Pic 5"))
        list.add(PicItem(R.drawable.pic6, "Pic 6"))
        list.add(PicItem(R.drawable.pic1, "Pic 7"))
        list.add(PicItem(R.drawable.pic2, "Pic 8"))
        list.add(PicItem(R.drawable.pic3, "Pic 9"))
        list.add(PicItem(R.drawable.pic4, "Pic 10"))
        list.add(PicItem(R.drawable.pic5, "Pic 11"))
        list.add(PicItem(R.drawable.pic6, "Pic 12"))
        return list
    }

}


data class PicItem(val picResId: Int, val title: String, var score: String? = null)

class PicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var ivPic: ImageView = itemView.findViewById(R.id.ivPic)
    var etScore: EditText = itemView.findViewById(R.id.etScore)
    var tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    var myTextWatcher: MyTextWatcher = MyTextWatcher()

    init {
        etScore.addTextChangedListener(myTextWatcher)
    }

    fun updateView(picItem: PicItem) {
        myTextWatcher.picItem = picItem
        ivPic.setImageResource(picItem.picResId)
        tvTitle.text = picItem.title
        if (picItem.score == null) {
            etScore.hint = "请输入分数"
            etScore.setText("")
        } else {
            etScore.setText(picItem.score)
        }
    }
}

class MyTextWatcher : TextWatcher {

    lateinit var picItem: PicItem

    override fun afterTextChanged(s: Editable?) {
        picItem?.apply {
            score = s?.toString()
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }
}

class PicAdapter(val picItems: List<PicItem>) : RecyclerView.Adapter<PicViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int): PicViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_edit_text_layout, viewGroup, false)
        return PicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return picItems.size
    }

    override fun onBindViewHolder(viewHolder: PicViewHolder, position: Int) {
        viewHolder.updateView(picItems[position])
    }
}