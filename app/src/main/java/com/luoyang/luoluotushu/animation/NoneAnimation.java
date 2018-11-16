package com.luoyang.luoluotushu.animation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.Scroller;

/**
 * package: com.luoyang.luoluotushu.animation
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */
public class NoneAnimation extends AnimationProvider {

    public NoneAnimation(Bitmap mCurrentBitmap, Bitmap mNextBitmap, int width, int height) {
        super(mCurrentBitmap, mNextBitmap, width, height);
    }

    @Override
    public void drawMove(Canvas canvas) {
        if (getCancel()){
            canvas.drawBitmap(mCurPageBitmap, 0, 0, null);
        }else {
            canvas.drawBitmap(mNextPageBitmap, 0, 0, null);
        }
    }

    @Override
    public void drawStatic(Canvas canvas) {
        if (getCancel()){
            canvas.drawBitmap(mCurPageBitmap, 0, 0, null);
        }else {
            canvas.drawBitmap(mNextPageBitmap, 0, 0, null);
        }
    }

    @Override
    public void startAnimation(Scroller scroller) {

    }

}
