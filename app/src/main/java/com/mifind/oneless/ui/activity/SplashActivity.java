package com.mifind.oneless.ui.activity;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.mifind.oneless.R;
import com.socks.library.KLog;

/**
 * Created by Xuanjiawei on 2016/10/31.
 */

public class SplashActivity extends Activity {

    private TextView mTvVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mTvVersion = (TextView) findViewById(R.id.tv_version);
        String formatT = String.format(getResources().getString(R.string.app_splash_version), getVersion());
        mTvVersion.setText(formatT);
    }

    private String getVersion() {
        try {
            PackageManager manager = this.getPackageManager();
            PackageInfo info = manager.getPackageInfo(this.getPackageName(), 0);
            String version = info.versionName;
            KLog.i(version);
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
