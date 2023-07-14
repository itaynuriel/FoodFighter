package com.example.food_fighter;

import android.app.Application;

import Utilities.ImageLoader;
import Utilities.SignalGenerator;

public class App extends Application {
    public void onCreate() {
        super.onCreate();
        ImageLoader.initImageLoader(this);
        SignalGenerator.init(this);
    }
}
