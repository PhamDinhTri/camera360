package com.guoxiaoxing.camera.injection;

import com.guoxiaoxing.camera.view.impl.CustomFragment;

import dagger.Component;

@FragmentScope
@Component(dependencies = AppComponent.class, modules = CustomViewModule.class)
public interface CustomViewComponent {
    void inject(CustomFragment fragment);
}