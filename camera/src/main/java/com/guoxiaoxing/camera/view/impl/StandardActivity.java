package com.guoxiaoxing.camera.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.guoxiaoxing.camera.R;
import com.guoxiaoxing.camera.injection.AppComponent;
import com.guoxiaoxing.camera.injection.DaggerStandardViewComponent;
import com.guoxiaoxing.camera.injection.StandardViewModule;
import com.guoxiaoxing.camera.presenter.StandardPresenter;
import com.guoxiaoxing.camera.presenter.loader.PresenterFactory;
import com.guoxiaoxing.camera.view.StandardView;

import javax.inject.Inject;

public final class StandardActivity extends BaseActivity<StandardPresenter, StandardView> implements StandardView {
    @Inject
    PresenterFactory<StandardPresenter> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        // Your code here
        // Do not call mPresenter from here, it will be null! Wait for onStart or onPostCreate.
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerStandardViewComponent.builder()
                .appComponent(parentComponent)
                .standardViewModule(new StandardViewModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<StandardPresenter> getPresenterFactory() {
        return mPresenterFactory;
    }
}
