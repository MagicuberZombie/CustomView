package com.example.zombiefan.customview;

import android.app.Application;

import com.example.zombiefan.customview.utils.Utils;

/**
 * Created by ZombieFan on 2017/2/9.
 */

public class App extends Application {
    private static App app;

    public static App getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        Utils.init(app);
    }
}
