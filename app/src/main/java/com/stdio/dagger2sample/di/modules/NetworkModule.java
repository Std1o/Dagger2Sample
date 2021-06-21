package com.stdio.dagger2sample.di.modules;

import android.content.Context;

import com.stdio.dagger2sample.service.NetworkService;
import com.stdio.dagger2sample.service.impl.NetworkServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public class NetworkModule {

    @Provides
    @Singleton
    NetworkService provideNetworkService(Context context) {
        return new NetworkServiceImpl(context);
    }
}
