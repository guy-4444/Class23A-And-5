package com.guy.class23a_and_5;


import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyImageUtils.initHelper(this);
    }
}
