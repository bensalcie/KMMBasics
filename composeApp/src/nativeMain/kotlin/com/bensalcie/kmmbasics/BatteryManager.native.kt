package com.bensalcie.kmmbasics

import platform.UIKit.UIDevice
import kotlin.math.roundToInt
actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        return (UIDevice.currentDevice.batteryLevel *100).roundToInt()
    }
}