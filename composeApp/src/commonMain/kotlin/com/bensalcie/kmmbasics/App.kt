package com.bensalcie.kmmbasics

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmmbasics.composeapp.generated.resources.Res
import kmmbasics.composeapp.generated.resources.compose_multiplatform
import kmmbasics.composeapp.generated.resources.hello_world
import kmmbasics.composeapp.generated.resources.vector
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun App(batteryManager: BatteryManager) {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Battery Level: ${remember { batteryManager.getBatteryLevel() }}%")
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(Res.drawable.vector), null, modifier = Modifier.size(300.dp))
                        Text("Image from Resources ")
                    }
                }
            }

            AnimatedVisibility(true) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Battery Level: ${remember { batteryManager.getBatteryLevel() }}%")
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(painterResource(Res.drawable.vector), null, modifier = Modifier.size(300.dp))
                        Text(text = stringResource(Res.string.hello_world))
                    }
                }
            }


        }
    }
}