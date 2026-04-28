package com.bensalcie.kmmbasics

import androidx.compose.ui.Modifier
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import com.bensalcie.kmmbasics.pages.HomeScreen
import kotlin.test.Test

class HomeScreenTest {
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testCountingUp(){
        runComposeUiTest {
            setContent {
                HomeScreen(toAbout = {})
            }
            onNodeWithText("0").assertExists()
            onNodeWithText("1").assertDoesNotExist()
            onNodeWithText("Increment").performClick().also {   onNodeWithText("1").assertExists()
                onNodeWithText("0").assertDoesNotExist()}





        }

    }
}