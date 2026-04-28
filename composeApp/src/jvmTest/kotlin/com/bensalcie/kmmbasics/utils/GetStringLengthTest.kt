package com.bensalcie.kmmbasics.utils

import assertk.assertThat
import org.junit.Test


class GetStringLengthTest {
    @Test
    fun getStringLength(){
        val name = "Ben Salcie"
        assertThat(name).equals(10)

    }
}