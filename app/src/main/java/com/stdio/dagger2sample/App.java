package com.stdio.dagger2sample;

import android.app.Application;

import com.stdio.dagger2sample.di.components.AppComponent;
import com.stdio.dagger2sample.di.components.DaggerAppComponent;
import com.stdio.dagger2sample.di.modules.AppModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
