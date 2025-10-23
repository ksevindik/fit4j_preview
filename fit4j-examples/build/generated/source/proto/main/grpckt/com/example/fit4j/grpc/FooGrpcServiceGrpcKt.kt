package com.example.fit4j.grpc

import com.example.fit4j.grpc.FooServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for com.example.FooService.
 */
public object FooServiceGrpcKt {
  public const val SERVICE_NAME: String = FooServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getFooNameByIdMethod:
      MethodDescriptor<FooGrpcService.GetFooNameByIdRequest, FooGrpcService.GetFooNameByIdResponse>
    @JvmStatic
    get() = FooServiceGrpc.getGetFooNameByIdMethod()

  public val getFooByIdMethod:
      MethodDescriptor<FooGrpcService.GetFooByIdRequest, FooGrpcService.GetFooByIdResponse>
    @JvmStatic
    get() = FooServiceGrpc.getGetFooByIdMethod()

  /**
   * A stub for issuing RPCs to a(n) com.example.FooService service as suspending coroutines.
   */
  @StubFor(FooServiceGrpc::class)
  public class FooServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FooServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FooServiceCoroutineStub =
        FooServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getFooNameById(request: FooGrpcService.GetFooNameByIdRequest,
        headers: Metadata = Metadata()): FooGrpcService.GetFooNameByIdResponse = unaryRpc(
      channel,
      FooServiceGrpc.getGetFooNameByIdMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getFooById(request: FooGrpcService.GetFooByIdRequest, headers: Metadata =
        Metadata()): FooGrpcService.GetFooByIdResponse = unaryRpc(
      channel,
      FooServiceGrpc.getGetFooByIdMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the com.example.FooService service based on Kotlin coroutines.
   */
  public abstract class FooServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for com.example.FooService.getFooNameById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFooNameById(request: FooGrpcService.GetFooNameByIdRequest):
        FooGrpcService.GetFooNameByIdResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooService.getFooNameById is unimplemented"))

    /**
     * Returns the response to an RPC for com.example.FooService.getFooById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFooById(request: FooGrpcService.GetFooByIdRequest):
        FooGrpcService.GetFooByIdResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.example.FooService.getFooById is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooServiceGrpc.getGetFooNameByIdMethod(),
      implementation = ::getFooNameById
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FooServiceGrpc.getGetFooByIdMethod(),
      implementation = ::getFooById
    )).build()
  }
}
