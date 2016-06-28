package com.guoxiaoxing.camera.injection;

import android.content.Context;

import com.guoxiaoxing.camera.CameraApp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getAppContext();

    CameraApp getApp();
}