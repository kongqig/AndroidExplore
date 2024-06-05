package com.kongqikill.kongqikillexplore.views.textviewc;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

/*
* 自定义TextView——自动获取焦点的文本视图
*/

public class MarqueeTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
