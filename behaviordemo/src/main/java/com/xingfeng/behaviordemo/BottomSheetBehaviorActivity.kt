package com.xingfeng.behaviordemo

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.BottomSheetDialog
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_bottom_sheet_behavior.*

class BottomSheetBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_behavior)

        btnBehavior.setOnClickListener {
            val view = LayoutInflater.from(this).inflate(R.layout.layout_exit_bottom_sheet, container, true)
            BottomSheetBehavior.from<LinearLayout>(view.findViewById(R.id.exit_ll)).apply {
                //禁止拖动
                //这里禁止了双向拖动
                //如果只想禁止向下拖动，hiddable=false即可
                //如果想禁止向上拖动，初始化时peekHeight=0+state=EXPAND
                setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                    override fun onSlide(p0: View, p1: Float) {

                    }

                    override fun onStateChanged(view: View, state: Int) {
                        if (state == BottomSheetBehavior.STATE_DRAGGING) {
                            setState(BottomSheetBehavior.STATE_COLLAPSED)
                        }
                    }
                })
            }
        }

        btnBehaviorDialog.setOnClickListener {
            ExitBottomSheetDialog(this, R.style.CustomBottomSheetDialog).show()
        }

        btnBehaviorDialogFragment.setOnClickListener {
            ExitBottomSheetDialogFragment().show(supportFragmentManager, "Fragment")
        }

        btnBottomSheetWithRecyclerView.setOnClickListener {
            ListBottomSheetDialog(this).show()
        }

    }
}

class ExitBottomSheetDialog(context: Context, theme: Int = 0) : BottomSheetDialog(context, theme) {
    init {
        setContentView(R.layout.content_layout_exit_bottom_sheet)
    }

    override fun setContentView(view: View) {
        super.setContentView(view)
        BottomSheetBehavior.from<FrameLayout>(view.parent as FrameLayout?).apply {
            peekHeight = TypedValue.complexToDimensionPixelSize(300, context.resources.displayMetrics)
        }
    }
}

class ExitBottomSheetDialogFragment : BottomSheetDialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.content_layout_exit_bottom_sheet, container, false)
    }
}

class ListBottomSheetDialog(context: Context) : BottomSheetDialog(context) {
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_list_bottom_sheet, null)
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, getScreenHeight(context) * 2 / 3)
            setGravity(Gravity.BOTTOM)
        }
    }

    override fun setContentView(view: View) {
        super.setContentView(view)
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)!!
        recyclerView.apply {
            adapter = TitleAdapter(getDatas())
        }

        BottomSheetBehavior.from<FrameLayout>(view.parent as FrameLayout).apply {
            peekHeight = getScreenHeight(context) * 2 / 3
        }
    }
}

