package com.bensalcie.kmmbasics

import androidx.compose.ui.window.ComposeUIViewController
import com.bensalcie.kmmbasics.di.initKoin

fun MainViewController() =
    ComposeUIViewController(
        { initKoin()// Called once for App Lifecycle
     }
    ) {
        App()
    }