package com.fit4j.grpc

import com.fit4j.mock.declarative.TestFixture
import com.fit4j.mock.declarative.TestFixturePredicate
import com.google.protobuf.Message

data class GrpcTestFixture(
    val requestType: Class<*> = Message::class.java,
    val predicate: TestFixturePredicate? = null,
    val responses: List<GrpcTestFixtureResponse> = listOf(GrpcTestFixtureResponse(statusCode = 0))
) : TestFixture(predicate), GrpcResponseJsonBuilder<Message> {

    override fun build(request: Message?): String? {
        val response: GrpcTestFixtureResponse = obtainResponse(request, responses) as GrpcTestFixtureResponse
        return if(response.statusCode > 0) {
            """
                throw {
                    "status": "${io.grpc.Status.fromCodeValue(response.statusCode).code.name}"
                }
            """.trimIndent()
        } else {
            response.responseBody
        }
    }



    override fun isApplicableFor(request: Any?): Boolean {
        return request is Message && requestType == request.javaClass && evaluatePredicate(request)
    }
}

data class GrpcTestFixtureResponse(val statusCode: Int = 0,
                                   val responseBody: String? = null)
