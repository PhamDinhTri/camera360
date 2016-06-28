package com.guoxiaoxing.camera.injection;

import android.support.annotation.NonNull;

import com.guoxiaoxing.camera.interactor.CustomInteractor;
import com.guoxiaoxing.camera.interactor.impl.CustomInteractorImpl;
import com.guoxiaoxing.camera.presenter.CustomPresenter;
import com.guoxiaoxing.camera.presenter.impl.CustomPresenterImpl;
import com.guoxiaoxing.camera.presenter.loader.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public final class CustomViewModule {
    @Provides
    public CustomInteractor provideInteractor() {
        return new CustomInteractorImpl();
    }

    @Provides
    public PresenterFactory<CustomPresenter> providePresenterFactory(@NonNull final CustomInteractor interactor) {
        return new PresenterFactory<CustomPresenter>() {
            @NonNull
            @Override
            public CustomPresenter create() {
                return new CustomPresenterImpl(interactor);
            }
        };
    }
}
