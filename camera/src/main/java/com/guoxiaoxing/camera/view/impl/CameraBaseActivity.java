package com.guoxiaoxing.camera.view.impl;

import android.os.Bundle;

import com.guoxiaoxing.camera.util.BaseActivity;
import com.guoxiaoxing.camera.view.camera.effect.CameraManager;


public class CameraBaseActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CameraManager.getInst().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CameraManager.getInst().removeActivity(this);
    }
}
