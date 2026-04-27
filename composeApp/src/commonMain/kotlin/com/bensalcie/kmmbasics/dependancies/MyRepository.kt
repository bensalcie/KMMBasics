package com.bensalcie.kmmbasics.dependancies

interface MyRepository {
    fun helloWorld(): String
}
class MyRepositoryImpl(private val dbClient: DBClient): MyRepository {
    override fun helloWorld(): String {
        return "Hello World! \n ${dbClient.getPlatformHello()}"
    }

}