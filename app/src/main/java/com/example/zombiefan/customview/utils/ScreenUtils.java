package com.example.zombiefan.customview.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by ZombieFan on 2017/2/9.
 * desc:屏幕工具
 */

public class ScreenUtils {
    private ScreenUtils(){
        throw  new UnsupportedOperationException(
                "u can't instantiate me"
        );
    }

    public static int getScreenWidth(){
        WindowManager windowManager =
                (WindowManager) Utils.getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }
}
