package com.guoxiaoxing.camera.view.impl;

import android.os.Bundle;

import com.guoxiaoxing.camera.util.BaseFragmentActivity;
import com.guoxiaoxing.camera.view.camera.effect.CameraManager;


public class CameraBaseFragmentActivity extends BaseFragmentActivity {

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
