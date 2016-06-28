package com.guoxiaoxing.camera.util;

import com.guoxiaoxing.camera.CameraApp;

public class DistanceUtil {

    public static int getCameraAlbumWidth() {
        return (CameraApp.getApp().getScreenWidth() - CameraApp.getApp().dp2px(10)) / 4 - CameraApp.getApp().dp2px(4);
    }

    // 相机照片列表高度计算 
    public static int getCameraPhotoAreaHeight() {
        return getCameraPhotoWidth() + CameraApp.getApp().dp2px(4);
    }

    public static int getCameraPhotoWidth() {
        return CameraApp.getApp().getScreenWidth() / 4 - CameraApp.getApp().dp2px(2);
    }

    //活动标签页grid图片高度
    public static int getActivityHeight() {
        return (CameraApp.getApp().getScreenWidth() - CameraApp.getApp().dp2px(24)) / 3;
    }
}
