package com.guoxiaoxing.camera.util;

import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.guoxiaoxing.camera.widget.CommonTitleBar;

/**
 * Created by sky on 15/7/6.
 */
public class BaseFragmentActivity extends FragmentActivity {

    protected CommonTitleBar titleBar;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        //titleBar = (CommonTitleBar) findViewById(R.id.title_layout);
        if (titleBar != null)
            titleBar.setLeftBtnOnclickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
    }
}
