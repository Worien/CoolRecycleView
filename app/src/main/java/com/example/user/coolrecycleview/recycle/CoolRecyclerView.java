package com.example.user.coolrecycleview.recycle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 8/16/2016.
 */
public class CoolRecyclerView extends RecyclerView {

    private CoolChildDrawer childDrawer;

    public CoolRecyclerView(Context context) {
        super(context);
    }

    public CoolRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CoolRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setChildDrawer(CoolChildDrawer childDrawer) {
        this.childDrawer = childDrawer;
    }

    @Override
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (childDrawer != null)
            return childDrawer.drawChild(canvas, child, drawingTime, this);
        else return super.drawChild(canvas, child, drawingTime);
    }

}
