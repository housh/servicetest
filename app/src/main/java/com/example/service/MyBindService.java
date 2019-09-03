package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.wifi.aware.PublishConfig;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by liuyueyue on 2017/8/20.
 */

public class MyBindService extends Service{
    @Override
    public void onCreate() {
        Log.i("info","BindService-->onCreat()");
        super.onCreate();
    }
    public class MyBinder extends Binder{
            public MyBindService getService(){
                return MyBindService.this;
            }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("info","BindService-->onBind()");
        return new MyBinder();
    }
    @Override
    public void unbindService(ServiceConnection conn) {
        Log.i("info","BindService-->unbindService()");
        super.unbindService(conn);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("info","BindService-->onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i("info","BindService-->onDestroy()");
        super.onDestroy();
    }
    public void play(){
        Log.i("info","播放");
    }
    public void pause(){
        Log.i("info","暂停");
    }
    public void perious(){
        Log.i("info","上一首");
    }
    public void next(){
        Log.i("info","下一首");
    }

}
