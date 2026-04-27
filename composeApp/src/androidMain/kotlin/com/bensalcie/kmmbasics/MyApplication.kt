package com.bensalcie.kmmbasics

import android.app.Application
import com.bensalcie.kmmbasics.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }
}