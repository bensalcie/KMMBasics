package com.bensalcie.kmmbasics.dependancies

actual class DBClient{
    actual fun getPlatformHello(): String {
       return "Hello from Native! "
    }
}