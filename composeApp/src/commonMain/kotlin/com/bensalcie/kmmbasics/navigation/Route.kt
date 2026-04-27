package com.bensalcie.kmmbasics.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class Route : NavKey

@Serializable
data object RouteA : Route()

@Serializable
data class RouteB(val id: String) : Route()
