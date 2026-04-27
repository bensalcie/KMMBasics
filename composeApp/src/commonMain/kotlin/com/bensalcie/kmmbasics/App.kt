package com.bensalcie.kmmbasics

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSerializable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.compose.serialization.serializers.SnapshotStateListSerializer
import com.bensalcie.kmmbasics.navigation.Route
import com.bensalcie.kmmbasics.navigation.RouteA
import com.bensalcie.kmmbasics.navigation.RouteB
import com.bensalcie.kmmbasics.pages.AboutScreen
import com.bensalcie.kmmbasics.pages.HomeScreen

@Composable
fun App() {
    MaterialTheme{
        val backStack: MutableList<Route> =
            rememberSerializable(serializer = SnapshotStateListSerializer(Route.serializer())) {
                mutableStateListOf(RouteA)
            }

        NavDisplay(
            backStack = backStack,
            onBack = { backStack.removeLastOrNull() },
            entryProvider = { key ->
                when (key) {
                    is RouteA -> NavEntry(key) {
                        HomeScreen(toAbout = {
                            backStack.add(RouteB("123"))
                        })
                    }

                    is RouteB -> NavEntry(key) {
                        AboutScreen(toHome = {
                            backStack.add(RouteA)
                        })
                    }

                }
            }
        )

    }

//    MaterialTheme {
//        var showContent by remember { mutableStateOf(false) }
//        Column(
//            modifier = Modifier
//                .background(MaterialTheme.colorScheme.primaryContainer)
//                .safeContentPadding()
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Battery Level: ${remember { batteryManager.getBatteryLevel() }}%")
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(painterResource(Res.drawable.vector), null, modifier = Modifier.size(300.dp))
//                        Text("Image from Resources ")
//                    }
//                }
//            }
//
//            AnimatedVisibility(true) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Battery Level: ${remember { batteryManager.getBatteryLevel() }}%")
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(painterResource(Res.drawable.vector), null, modifier = Modifier.size(300.dp))
//                        Text(text = stringResource(Res.string.hello_world))
//                    }
//                }
//            }
//
//
//        }
//    }
}

