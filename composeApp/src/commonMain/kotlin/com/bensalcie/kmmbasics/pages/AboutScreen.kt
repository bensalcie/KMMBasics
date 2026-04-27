package com.bensalcie.kmmbasics.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AboutScreen(toHome:()-> Unit){
    Column(modifier  = Modifier.fillMaxHeight().fillMaxWidth()) {
        Text("About Screen", modifier = Modifier.align (Alignment.CenterHorizontally))
        Button(onClick = { toHome() }, content = { Text("Navigate to Home") },modifier = Modifier.align (Alignment.CenterHorizontally))
    }
}