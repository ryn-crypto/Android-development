package com.ryan.belajarandroiddasar

import org.junit.Assert
import org.junit.Test

class HelloTest {

    @Test
    fun testSayHello() {
        val result = Hello.sayHello("Ryan")
        Assert.assertEquals("Hello Ryan", result)
    }
}