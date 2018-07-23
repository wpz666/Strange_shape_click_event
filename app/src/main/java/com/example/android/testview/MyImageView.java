package com.example.android.testview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by Android on 2018/7/23.
 */

public class MyImageView extends android.support.v7.widget.AppCompatImageView {

    private int width = -1;
    private int height = -1;
    private Bitmap bitmap;

    public MyImageView( Context context) {
        super(context);
    }

    public MyImageView( Context context,AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action != MotionEvent.ACTION_DOWN){
            return super.onTouchEvent( event);
        }
        int x = (int) event.getX();
        int y = (int) event.getY();
        if (width == -1 || height == -1){
//            TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.ButtonPreference, defStyle, 0);
//            Drawable drawable = a.getDrawable(R.styleable.MyComponent_img); //button的名称
//            Drawable drawable = (getBackground()).getCurrent();
            Drawable drawable = getDrawable();
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            width = getWidth();
            height = getHeight();
        }
        if (null == bitmap || x < 0 || y < 0 || x >= width || y >= height){
            return false;
        }
        int pixel = bitmap.getPixel(x, y);
        if (Color.TRANSPARENT == pixel){
            return false;
        }
        return super.onTouchEvent(event);
    }
}
