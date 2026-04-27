package com.bensalcie.kmmbasics

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.bensalcie.kmmbasics.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KMMBasics",
        ) {
            App()
        }
    }
}