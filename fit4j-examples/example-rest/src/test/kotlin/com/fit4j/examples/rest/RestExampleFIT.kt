package com.fit4j.examples.rest

import com.fit4j.annotation.FIT
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

@FIT
class RestExampleFIT {

    @Autowired
    private lateinit var exampleRestClient: ExampleRestClient

    @Test
    fun `rest call using okhttp2 should work`() {
        val response = exampleRestClient.sayHello(_root_ide_package_.com.fit4j.examples.rest.ExampleRestRequest("Kenan")).execute()
        Assertions.assertEquals(200, response.code())
        Assertions.assertEquals("Hello, John!", response.body()!!.message)

        val response2 = exampleRestClient.sayBye(_root_ide_package_.com.fit4j.examples.rest.ExampleRestRequest("Umut")).execute()
        Assertions.assertEquals(200, response2.code())
        Assertions.assertEquals("Bye, Joe!", response2.body()!!.message)
    }
}

