package com.bensalcie.kmmbasics

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMMBasics",
    ) {
        App(batteryManager = BatteryManager())
    }
}