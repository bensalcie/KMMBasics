package com.bensalcie.kmmbasics.di

import com.bensalcie.kmmbasics.dependancies.DBClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
singleOf(::DBClient)
}