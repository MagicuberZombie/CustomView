package com.example.zombiefan.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zombiefan.customview.custom.CustomCircle;

public class MainActivity extends AppCompatActivity {

    private CustomCircle circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        startView();
    }

    private void startView() {
        new Thread(circle).start();
    }

    private void initView() {
        circle = (CustomCircle) findViewById(R.id.circle);
    }
}
