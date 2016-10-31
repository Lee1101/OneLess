package com.mifind.oneless;

import android.app.Application;
import android.content.Context;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class OneLessApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
    }
}
