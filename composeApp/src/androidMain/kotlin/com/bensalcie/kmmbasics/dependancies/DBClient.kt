package com.bensalcie.kmmbasics.dependancies

import android.content.Context

actual class DBClient(private val context: Context) {
    actual fun getPlatformHello(): String {
       return "Hello from Android!"
    }
}