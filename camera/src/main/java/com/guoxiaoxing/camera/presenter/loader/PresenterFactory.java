package com.guoxiaoxing.camera.presenter.loader;

import android.support.annotation.NonNull;

import com.guoxiaoxing.camera.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
