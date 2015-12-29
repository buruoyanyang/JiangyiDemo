package com.example.buruoyanyang.jiangyidemo.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 焕锋 on 2015/12/29
 * 跟随手指的小球.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }
    public DrawView(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
    }

    public float currentX = 40;
    public float currentY = 50;
    Paint paint = new Paint();
    @Override
    public void onDraw(Canvas canvas)
    {
        //重写绘制事件
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,25,paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        currentX = event.getX();
        currentY = event.getY();
        //通知当前控件重绘自己
        invalidate();
        return true;
    }
}
