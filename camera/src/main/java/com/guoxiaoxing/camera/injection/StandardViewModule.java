package com.guoxiaoxing.camera.injection;

import android.support.annotation.NonNull;

import com.guoxiaoxing.camera.interactor.StandardInteractor;
import com.guoxiaoxing.camera.interactor.impl.StandardInteractorImpl;
import com.guoxiaoxing.camera.presenter.StandardPresenter;
import com.guoxiaoxing.camera.presenter.impl.StandardPresenterImpl;
import com.guoxiaoxing.camera.presenter.loader.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public final class StandardViewModule {
    @Provides
    public StandardInteractor provideInteractor() {
        return new StandardInteractorImpl();
    }

    @Provides
    public PresenterFactory<StandardPresenter> providePresenterFactory(@NonNull final StandardInteractor interactor) {
        return new PresenterFactory<StandardPresenter>() {
            @NonNull
            @Override
            public StandardPresenter create() {
                return new StandardPresenterImpl(interactor);
            }
        };
    }
}
