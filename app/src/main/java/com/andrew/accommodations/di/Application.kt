package com.andrew.accommodations.di

import android.content.Context
import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application : MultiDexApplication() {
    override fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
    }

    override fun onCreate() {
        super.onCreate()
    }
}