package com.example.textviewrun;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/1.
 */
public class Marqun extends TextView {
    public Marqun(Context context) {
        super(context);
    }

    public Marqun(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Marqun(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }

}
