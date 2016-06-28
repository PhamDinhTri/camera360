package com.guoxiaoxing.camera.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.guoxiaoxing.camera.R;
import com.guoxiaoxing.camera.injection.AppComponent;
import com.guoxiaoxing.camera.injection.CustomViewModule;
import com.guoxiaoxing.camera.injection.DaggerCustomViewComponent;
import com.guoxiaoxing.camera.presenter.CustomPresenter;
import com.guoxiaoxing.camera.presenter.loader.PresenterFactory;
import com.guoxiaoxing.camera.view.CustomView;

import javax.inject.Inject;

public final class CustomFragment extends BaseFragment<CustomPresenter, CustomView> implements CustomView {
    @Inject
    PresenterFactory<CustomPresenter> mPresenterFactory;

    // Your presenter is available using the mPresenter variable

    public CustomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_custom, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Your code here
        // Do not call mPresenter from here, it will be null! Wait for onStart
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerCustomViewComponent.builder()
                .appComponent(parentComponent)
                .customViewModule(new CustomViewModule())
                .build()
                .inject(this);
    }

    @NonNull
    @Override
    protected PresenterFactory<CustomPresenter> getPresenterFactory() {
        return mPresenterFactory;
    }
}
