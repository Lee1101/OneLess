package com.mifind.oneless.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mifind.oneless.R;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        String formatT = String.format(getResources().getString(R.string.app_splash_version), "1.0");
        TextView tv = (TextView) findViewById(R.id.tv_version);
        tv.setText(formatT);
    }
}
