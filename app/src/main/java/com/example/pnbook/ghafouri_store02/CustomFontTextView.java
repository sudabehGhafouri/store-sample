package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class CustomFontTextView extends AppCompatTextView {
    String customFont;
    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        style( attrs);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        style( attrs);
    }
    private void style(AttributeSet attrs) {

        TypedArray a = getContext().obtainStyledAttributes(attrs,
                R.styleable.CustomFontTextView);
        int cf = a.getInteger(R.styleable.CustomFontTextView_fontName, 0);
        int fontName = 0;
        switch (cf)
        {
            case 1:
                fontName = R.string.Roboto_Bold;
                break;

            case 3:
                fontName = R.string.Roboto_Light;
                break;
            case 4:
                fontName =R.string.Roboto_Medium;
                break;

            default:
                fontName = R.string.Roboto_Medium;
                break;
        }

        customFont = getResources().getString(fontName);

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/" + customFont + ".ttf");
        setTypeface(tf);
        a.recycle();
    }
}
