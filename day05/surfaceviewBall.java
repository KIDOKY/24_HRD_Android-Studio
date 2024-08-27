package com.example.myapplicationserfaceview;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class Ball {
    private Drawable image = null;
    private Point point = new Point();
    private Point size = new Point();
    private Point delta;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Point getSize() {
        return size;
    }

    public void setSize(Point size) {
        this.size = size;
    }

    public Point getDelta() {
        return delta;
    }

    public void setDelta(int dx, int dy) {
        delta = new Point(dx, dy);
    }

    public void draw(Canvas canvas) {

    }

    public void move(Rect surfaceFrame) {

    }
}
