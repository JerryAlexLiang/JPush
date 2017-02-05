package com.liang.jpushdemo;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

/**
 * 创建日期：2017/2/5 on 16:13
 * 作者:杨亮 liangyang
 * 描述:自定义接收器
 * 如果不定义这个 Receiver，则：
 * 1) 默认用户会打开主界面
 * 2) 接收不到自定义消息
 */

public class MyReceiver extends BroadcastReceiver {

    private NotificationManager manager;
    private NotificationCompat.Builder notifyBuilder;

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(JPushInterface.ACTION_MESSAGE_RECEIVED)) {
            Bundle bundle = intent.getExtras();
            String title = bundle.getString(JPushInterface.EXTRA_TITLE);
            String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);
            Toast.makeText(context, "title:   " + title+  "message:   " + message, Toast.LENGTH_SHORT).show();
            System.out.println("==============> " + title + "  " + message);
            //接收到推送下来的自定义消息，开启服务执行耗时的操作
            //processCustomMessage(context, bundle);
        }

    }

    /**
     * 接收到推送下来的自定义消息，开启服务执行耗时的操作
     *
     * @param context
     * @param bundle
     */
    private void processCustomMessage(Context context, Bundle bundle) {
//        manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//        notifyBuilder = new NotificationCompat.Builder(context);
//        String title = bundle.getString(JPushInterface.EXTRA_TITLE);
//        String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);
//        Toast.makeText(context, "title:   " + title + "message:   " + message, Toast.LENGTH_SHORT).show();
//        notifyBuilder.setContentTitle(title);
//        notifyBuilder.setContentText(message);
//        notifyBuilder.setSmallIcon(R.drawable.ic_launcher);
//        manager.notify();
//        System.out.println("==============> " + title + "  " + message);
    }


}
