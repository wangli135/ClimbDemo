package com.example.wangli.climbdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 2 * @Author: 王立
 * 3 * @Date: 2018/11/4 3:14 PM
 * 4
 */
public class MyTextView1 extends TextView {

    private Paint paint1;
    private Paint paint2;

    public MyTextView1(Context context) {
        this(context, null);
    }

    public MyTextView1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyTextView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        paint1 = new Paint();
        paint1.setColor(getResources().getColor(android.R.color.holo_blue_light));
        paint1.setStyle(Paint.Style.FILL);

        paint2 = new Paint();
        paint2.setColor(Color.YELLOW);
        paint2.setStyle(Paint.Style.FILL);


    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawRect(0,0,getMeasuredWidth(),getMeasuredHeight(),paint1);
        canvas.drawRect(10,10,getMeasuredWidth()-10,getMeasuredHeight()-10,paint2);
        canvas.save();
        canvas.translate(10,0);
        super.onDraw(canvas);
        canvas.restore();

    }
}
