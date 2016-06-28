package com.guoxiaoxing.camera.widget.drawable;

import android.graphics.Paint;

public interface EditableDrawable {
    public static final int CURSOR_BLINK_TIME = 400;

    public void setOnSizeChangeListener(OnSizeChange paramOnSizeChange);

    public void beginEdit();

    public void endEdit();

    public boolean isEditing();

    public CharSequence getText();

    public void setText(String paramString);

    public void setText(CharSequence paramCharSequence);

    public void setTextHint(CharSequence paramCharSequence);

    public boolean isTextHint();

    public void setTextHint(String paramString);

    public void setBounds(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);

    public int getTextColor();

    public void setTextColor(int paramInt);

    public float getTextSize();

    public float getFontMetrics(Paint.FontMetrics paramFontMetrics);

    public int getTextStrokeColor();

    public void setTextStrokeColor(int paramInt);

    public boolean getStrokeEnabled();

    public void setStrokeEnabled(boolean paramBoolean);

    public int getNumLines();

    public static interface OnSizeChange {
        public void onSizeChanged(EditableDrawable paramEditableDrawable, float paramFloat1,
                                  float paramFloat2, float paramFloat3, float paramFloat4);
    }
}
