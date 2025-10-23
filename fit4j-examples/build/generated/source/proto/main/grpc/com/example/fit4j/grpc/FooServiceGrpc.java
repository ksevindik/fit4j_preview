package com.example.fit4j.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: foo_grpc_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FooServiceGrpc {

  private FooServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.FooService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest,
      com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> getGetFooNameByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFooNameById",
      requestType = com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest.class,
      responseType = com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest,
      com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> getGetFooNameByIdMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest, com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> getGetFooNameByIdMethod;
    if ((getGetFooNameByIdMethod = FooServiceGrpc.getGetFooNameByIdMethod) == null) {
      synchronized (FooServiceGrpc.class) {
        if ((getGetFooNameByIdMethod = FooServiceGrpc.getGetFooNameByIdMethod) == null) {
          FooServiceGrpc.getGetFooNameByIdMethod = getGetFooNameByIdMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest, com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFooNameById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooServiceMethodDescriptorSupplier("getFooNameById"))
              .build();
        }
      }
    }
    return getGetFooNameByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest,
      com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> getGetFooByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFooById",
      requestType = com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest.class,
      responseType = com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest,
      com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> getGetFooByIdMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest, com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> getGetFooByIdMethod;
    if ((getGetFooByIdMethod = FooServiceGrpc.getGetFooByIdMethod) == null) {
      synchronized (FooServiceGrpc.class) {
        if ((getGetFooByIdMethod = FooServiceGrpc.getGetFooByIdMethod) == null) {
          FooServiceGrpc.getGetFooByIdMethod = getGetFooByIdMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest, com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFooById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooServiceMethodDescriptorSupplier("getFooById"))
              .build();
        }
      }
    }
    return getGetFooByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FooServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooServiceStub>() {
        @java.lang.Override
        public FooServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooServiceStub(channel, callOptions);
        }
      };
    return FooServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FooServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooServiceBlockingStub>() {
        @java.lang.Override
        public FooServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooServiceBlockingStub(channel, callOptions);
        }
      };
    return FooServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FooServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooServiceFutureStub>() {
        @java.lang.Override
        public FooServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooServiceFutureStub(channel, callOptions);
        }
      };
    return FooServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFooNameById(com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFooNameByIdMethod(), responseObserver);
    }

    /**
     */
    default void getFooById(com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFooByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FooService.
   */
  public static abstract class FooServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FooServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FooService.
   */
  public static final class FooServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FooServiceStub> {
    private FooServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFooNameById(com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFooNameByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFooById(com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFooByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FooService.
   */
  public static final class FooServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FooServiceBlockingStub> {
    private FooServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse getFooNameById(com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFooNameByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse getFooById(com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFooByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FooService.
   */
  public static final class FooServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FooServiceFutureStub> {
    private FooServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse> getFooNameById(
        com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFooNameByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse> getFooById(
        com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFooByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FOO_NAME_BY_ID = 0;
  private static final int METHODID_GET_FOO_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FOO_NAME_BY_ID:
          serviceImpl.getFooNameById((com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse>) responseObserver);
          break;
        case METHODID_GET_FOO_BY_ID:
          serviceImpl.getFooById((com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetFooNameByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdRequest,
              com.example.fit4j.grpc.FooGrpcService.GetFooNameByIdResponse>(
                service, METHODID_GET_FOO_NAME_BY_ID)))
        .addMethod(
          getGetFooByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.fit4j.grpc.FooGrpcService.GetFooByIdRequest,
              com.example.fit4j.grpc.FooGrpcService.GetFooByIdResponse>(
                service, METHODID_GET_FOO_BY_ID)))
        .build();
  }

  private static abstract class FooServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FooServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.fit4j.grpc.FooGrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FooService");
    }
  }

  private static final class FooServiceFileDescriptorSupplier
      extends FooServiceBaseDescriptorSupplier {
    FooServiceFileDescriptorSupplier() {}
  }

  private static final class FooServiceMethodDescriptorSupplier
      extends FooServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FooServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FooServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FooServiceFileDescriptorSupplier())
              .addMethod(getGetFooNameByIdMethod())
              .addMethod(getGetFooByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
