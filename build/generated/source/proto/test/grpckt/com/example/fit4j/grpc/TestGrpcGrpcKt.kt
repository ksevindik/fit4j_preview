package com.example.fit4j.grpc

import com.example.fit4j.grpc.FooGrpcServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for com.example.FooGrpcService.
 */
object FooGrpcServiceGrpcKt {
  const val SERVICE_NAME: String = FooGrpcServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = FooGrpcServiceGrpc.getServiceDescriptor()

  val getFooListResponseMethod: MethodDescriptor<TestGrpc.GetFooListGrpcRequest,
      TestGrpc.GetFooListGrpcResponse>
    @JvmStatic
    get() = FooGrpcServiceGrpc.getGetFooListResponseMethod()

  val getFooByIdResponseMethod: MethodDescriptor<TestGrpc.GetFooByIdRequest,
      TestGrpc.GetFooByIdResponse>
    @JvmStatic
    get() = FooGrpcServiceGrpc.getGetFooByIdResponseMethod()

  val getAgeRequestMethod: MethodDescriptor<TestGrpc.GetAgeRequest, TestGrpc.GetAgeResponse>
    @JvmStatic
    get() = FooGrpcServiceGrpc.getGetAgeRequestMethod()

  val pingRequestMethod: MethodDescriptor<TestGrpc.PingRequest, TestGrpc.PingResponse>
    @JvmStatic
    get() = FooGrpcServiceGrpc.getPingRequestMethod()

  val getAllRequestMethod: MethodDescriptor<TestGrpc.GetAllRequest, TestGrpc.GetAllResponse>
    @JvmStatic
    get() = FooGrpcServiceGrpc.getGetAllRequestMethod()

  /**
   * A stub for issuing RPCs to a(n) com.example.FooGrpcService service as suspending coroutines.
   */
  @StubFor(FooGrpcServiceGrpc::class)
  class FooGrpcServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<FooGrpcServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FooGrpcServiceCoroutineStub =
        FooGrpcServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getFooListResponse(request: TestGrpc.GetFooListGrpcRequest):
        TestGrpc.GetFooListGrpcResponse = unaryRpc(
      channel,
      FooGrpcServiceGrpc.getGetFooListResponseMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getFooByIdResponse(request: TestGrpc.GetFooByIdRequest): TestGrpc.GetFooByIdResponse
        = unaryRpc(
      channel,
      FooGrpcServiceGrpc.getGetFooByIdResponseMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getAgeRequest(request: TestGrpc.GetAgeRequest): TestGrpc.GetAgeResponse = unaryRpc(
      channel,
      FooGrpcServiceGrpc.getGetAgeRequestMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun pingRequest(request: TestGrpc.PingRequest): TestGrpc.PingResponse = unaryRpc(
      channel,
      FooGrpcServiceGrpc.getPingRequestMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getAllRequest(request: TestGrpc.GetAllRequest): TestGrpc.GetAllResponse = unaryRpc(
      channel,
      FooGrpcServiceGrpc.getGetAllRequestMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the com.example.FooGrpcService service based on Kotlin coroutines.
   */
  abstract class FooGrpcServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.example.FooGrpcService.getFooListResponse.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getFooListResponse(request: TestGrpc.GetFooListGrpcRequest):
        TestGrpc.GetFooListGrpcResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooGrpcService.getFooListResponse is unimplemented"))

    /**
     * Returns the response to an RPC for com.example.FooGrpcService.getFooByIdResponse.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getFooByIdResponse(request: TestGrpc.GetFooByIdRequest):
        TestGrpc.GetFooByIdResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooGrpcService.getFooByIdResponse is unimplemented"))

    /**
     * Returns the response to an RPC for com.example.FooGrpcService.getAgeRequest.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getAgeRequest(request: TestGrpc.GetAgeRequest): TestGrpc.GetAgeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooGrpcService.getAgeRequest is unimplemented"))

    /**
     * Returns the response to an RPC for com.example.FooGrpcService.pingRequest.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun pingRequest(request: TestGrpc.PingRequest): TestGrpc.PingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooGrpcService.pingRequest is unimplemented"))

    /**
     * Returns the response to an RPC for com.example.FooGrpcService.getAllRequest.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getAllRequest(request: TestGrpc.GetAllRequest): TestGrpc.GetAllResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooGrpcService.getAllRequest is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooGrpcServiceGrpc.getGetFooListResponseMethod(),
      implementation = ::getFooListResponse
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooGrpcServiceGrpc.getGetFooByIdResponseMethod(),
      implementation = ::getFooByIdResponse
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooGrpcServiceGrpc.getGetAgeRequestMethod(),
      implementation = ::getAgeRequest
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooGrpcServiceGrpc.getPingRequestMethod(),
      implementation = ::pingRequest
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooGrpcServiceGrpc.getGetAllRequestMethod(),
      implementation = ::getAllRequest
    )).build()
  }
}
