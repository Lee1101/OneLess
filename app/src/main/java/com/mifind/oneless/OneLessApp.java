package com.mifind.oneless;

import android.app.Application;
import android.content.Context;

import com.socks.library.KLog;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class OneLessApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        KLog.init(BuildConfig.LOG_DEBUG, "ONELess");
    }

    public static Context getAppContext() {
        return context;
    }
}
