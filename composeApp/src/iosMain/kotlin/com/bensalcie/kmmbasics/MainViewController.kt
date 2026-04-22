package com.bensalcie.kmmbasics

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { App(batteryManager = BatteryManager()) }