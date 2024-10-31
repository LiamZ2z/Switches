package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.util.Log;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService","创建服务，执行onCreate()方法");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("MyService","开启服务，执行onStartCommand()方法");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyService","关闭服务，执行onDestory()方法");
    }
}