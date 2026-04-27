package com.bensalcie.kmmbasics.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bensalcie.kmmbasics.viewmodel.MyViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(toAbout: () -> Unit) {

    val homeViewModel = koinViewModel <MyViewModel>()
    Surface{
        Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            Text("Home Screen")
            Button(
                onClick = toAbout,
                content = { Text("Navigate to About \n${homeViewModel.getHelloWorldString()}") })
        }
    }
}