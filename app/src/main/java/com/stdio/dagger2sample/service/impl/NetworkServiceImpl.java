package com.stdio.dagger2sample.service.impl;

import android.content.Context;

import com.stdio.dagger2sample.service.NetworkService;

public class NetworkServiceImpl implements NetworkService {

    private Context context;

    public NetworkServiceImpl(Context context) {
        this.context = context;
    }

    @Override
    public String getHello() {
        return context.getClass().getSimpleName();
    }
}
