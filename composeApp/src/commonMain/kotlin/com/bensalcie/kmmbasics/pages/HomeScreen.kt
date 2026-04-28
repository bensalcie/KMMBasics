package com.bensalcie.kmmbasics.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bensalcie.kmmbasics.viewmodel.MyViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(toAbout: () -> Unit) {
//    val homeViewModel = koinViewModel<MyViewModel>()
    var counter by remember { mutableIntStateOf(0) }


    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
        Text("Home Screen at ")


        Spacer(modifier = Modifier.height(100.dp))
        Text(counter.toString())
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { counter++ }, content = {
            Text("Increment")
        })

//
//        Button(
//            onClick = { toAbout.invoke() },
//            content = { Text("Navigate to About \n${homeViewModel.getHelloWorldString()}") })
    }

}



