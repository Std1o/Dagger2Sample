package com.stdio.dagger2sample.di.components;

import com.stdio.dagger2sample.MainActivity;
import com.stdio.dagger2sample.di.modules.AppModule;
import com.stdio.dagger2sample.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
