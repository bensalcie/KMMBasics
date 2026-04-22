package com.bensalcie.kmmbasics

import android.os.BatteryManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App(batteryManager = BatteryManager(applicationContext))
        }
    }
}

//@Preview
//@Composable
//fun AppAndroidPreview() {
//    App(batteryManager = )
//}