package com.example.user.coolrecycleview.recycle;

import android.graphics.Canvas;
import android.view.View;

/**
 * Created by user on 8/17/2016.
 */
public interface CoolChildDrawer {
    boolean drawChild(Canvas canvas, View child, long drawingTime, View parent);
}
