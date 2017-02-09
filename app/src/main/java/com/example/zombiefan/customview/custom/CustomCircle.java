package com.example.zombiefan.customview.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import android.view.View;

import com.example.zombiefan.customview.R;
import com.example.zombiefan.customview.utils.ScreenUtils;

/**
 * Created by ZombieFan on 2017/2/9.
 */

public class CustomCircle extends View implements Runnable {

    private Context mContext;
    private Paint mPaint;
    private String mText;
    private int mTextColor;
    private int mTextSize;

    private int radius;


    public CustomCircle(Context context) {
        this(context, null);
    }

    public CustomCircle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomCircle(Context context, AttributeSet attrs,
                        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initPaint();
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.CustomCircle);
        if (array.getResourceId(R.styleable.CustomCircle_radius, 0) != 0)
            radius = array.getResourceId(R.styleable.CustomCircle_radius, 0);
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(ScreenUtils.getScreenWidth() / 2, 300, radius, mPaint);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (radius <= 200) {
                    radius += 20;
                    postInvalidate();
                } else {
                    radius = 0;
                }

                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
