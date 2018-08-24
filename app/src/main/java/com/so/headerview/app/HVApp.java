package com.so.headerview.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * application类
 * Created by sorrower on 07/03/2018.
 */

public class HVApp extends Application {

    private static Context mContext;
    private static Handler mHandler;
    private static int mMainTid;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mHandler = new Handler();
        mMainTid = Process.myTid();
    }

    public static Context getContext() {
        return mContext;
    }

    public static Handler getHandler() {
        return mHandler;
    }

    public static int getMainTid() {
        return mMainTid;
    }
}
