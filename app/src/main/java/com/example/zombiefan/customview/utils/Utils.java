package com.example.zombiefan.customview.utils;

import android.content.Context;

/**
 * Created by ZombieFan on 2017/2/9.
 */

public class Utils {
    private static Context context;

    private Utils(){
        throw new UnsupportedOperationException("u can't instantiate me");
    }

    public static void init(Context context){
        Utils.context = context.getApplicationContext();
    }

    public static Context getContext(){
        if(context != null) return context;
        throw new NullPointerException("u should init first");
    }
}
