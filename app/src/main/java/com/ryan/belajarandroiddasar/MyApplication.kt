package com.ryan.belajarandroiddasar

import android.app.Application
import android.util.Log

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("App", "Application Created")
    }
}