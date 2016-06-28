package com.guoxiaoxing.camera.injection;

import com.guoxiaoxing.camera.view.impl.StandardActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = StandardViewModule.class)
public interface StandardViewComponent {
    void inject(StandardActivity activity);
}