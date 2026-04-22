package com.bensalcie.kmmbasics

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import kotlin.math.roundToInt

actual class BatteryManager (private val context: Context){
    actual fun getBatteryLevel(): Int {
        val intentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        val batteryStatus = context.registerReceiver(null, intentFilter)
        val level = batteryStatus?.getIntExtra("level", -1) ?: -1
        val scale = batteryStatus?.getIntExtra("scale", -1) ?: -1
        return (level / scale.toFloat() * 100).roundToInt()
    }
}