package com.example.zz.scrollproject;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zz on 2018/3/21.
 */

public class DragView1  extends View {

    private int lastX;
    private int lastY;

    public DragView1(Context context) {
        super(context);
        ininView();
    }

    public DragView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        ininView();
    }

    public DragView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ininView();
    }

    private void ininView() {
        // 给View设置背景颜色，便于观察
        setBackgroundColor(Color.BLUE);
    }

    // 视图坐标方式
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        Log.d("aaaaa","x="+x+",y="+y);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // 记录触摸点坐标
                lastX = x;
                lastY = y;
                Log.d("bbbb","lastX ="+lastX +",lastY ="+lastY );
                break;
            case MotionEvent.ACTION_MOVE:
                // 计算偏移量
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                Log.d("cccc","x="+x+",y="+y);
                Log.d("cccc","lastX ="+lastX +",lastY ="+lastY );
                // 在当前left、top、right、bottom的基础上加上偏移量
                layout(getLeft() + offsetX,
                        getTop() + offsetY,
                        getRight() + offsetX,
                        getBottom() + offsetY);
//                lastX = x;
//                lastY = y;
//                        offsetLeftAndRight(offsetX);
//                        offsetTopAndBottom(offsetY);
                break;
        }
        return true;
    }
}
