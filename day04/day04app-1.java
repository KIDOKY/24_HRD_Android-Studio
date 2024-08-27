package com.example.myapplicationapp;

import android.app.Application;

public class MyApplication extends Application {
    private String globalString;

    @Override
    public void onCreate() {
        super.onCreate();
        globalString = "Hello Application!!";
    }

    public String getGlobalString() {
        return globalString;
    }

    public void setGlobalString(String globalString) {
        this.globalString = globalString;
    }
}
