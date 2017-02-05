package com.liang.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 创建日期：2017/2/5 on 9:18
 * 作者:杨亮 liangyang
 * 描述:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //设置极光推送的debug模式为打开,发布时设置为false
        JPushInterface.setDebugMode(true);
        //初始化SDK
        JPushInterface.init(getApplicationContext());
    }
}
