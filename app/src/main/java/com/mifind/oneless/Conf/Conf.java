package com.mifind.oneless.conf;

import android.support.graphics.drawable.BuildConfig;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class Conf {
    public static boolean DEBUG = BuildConfig.DEBUG;
    private static String URL_HEAD;

    public static class Request {
        public static String URL_MOVIE_DETAIL = URL_HEAD + "/movie/detail/145";
    }

    static {
        if (DEBUG) {
            URL_HEAD = "http://v3.wufazhuce.com:8000/api";
        }
    }
}
