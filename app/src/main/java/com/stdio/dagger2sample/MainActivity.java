package com.stdio.dagger2sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.stdio.dagger2sample.service.NetworkService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkService networkService;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App)getApplication()).getAppComponent()
                .inject(this);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText(networkService.getHello());
    }
}