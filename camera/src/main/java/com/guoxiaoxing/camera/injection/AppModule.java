package com.guoxiaoxing.camera.injection;

import android.content.Context;
import android.support.annotation.NonNull;

import com.guoxiaoxing.camera.CameraApp;

import dagger.Module;
import dagger.Provides;

@Module
public final class AppModule {
    @NonNull
    private final CameraApp mApp;

    public AppModule(@NonNull CameraApp app) {
        mApp = app;
    }

    @Provides
    public Context provideAppContext() {
        return mApp;
    }

    @Provides
    public CameraApp provideApp() {
        return mApp;
    }
}
