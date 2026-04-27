package com.bensalcie.kmmbasics.viewmodel

import androidx.lifecycle.ViewModel
import com.bensalcie.kmmbasics.dependancies.MyRepository

class MyViewModel(private val myRepository: MyRepository) : ViewModel() {
    fun getHelloWorldString(): String {
        return myRepository.helloWorld()
    }
}