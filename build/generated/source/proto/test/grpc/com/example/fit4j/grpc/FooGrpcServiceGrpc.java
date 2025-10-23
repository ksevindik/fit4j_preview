package com.example.fit4j.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: test_grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FooGrpcServiceGrpc {

  private FooGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.FooGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest,
      com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> getGetFooListResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFooListResponse",
      requestType = com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest.class,
      responseType = com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest,
      com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> getGetFooListResponseMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest, com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> getGetFooListResponseMethod;
    if ((getGetFooListResponseMethod = FooGrpcServiceGrpc.getGetFooListResponseMethod) == null) {
      synchronized (FooGrpcServiceGrpc.class) {
        if ((getGetFooListResponseMethod = FooGrpcServiceGrpc.getGetFooListResponseMethod) == null) {
          FooGrpcServiceGrpc.getGetFooListResponseMethod = getGetFooListResponseMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest, com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFooListResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooGrpcServiceMethodDescriptorSupplier("getFooListResponse"))
              .build();
        }
      }
    }
    return getGetFooListResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest,
      com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> getGetFooByIdResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFooByIdResponse",
      requestType = com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest.class,
      responseType = com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest,
      com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> getGetFooByIdResponseMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest, com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> getGetFooByIdResponseMethod;
    if ((getGetFooByIdResponseMethod = FooGrpcServiceGrpc.getGetFooByIdResponseMethod) == null) {
      synchronized (FooGrpcServiceGrpc.class) {
        if ((getGetFooByIdResponseMethod = FooGrpcServiceGrpc.getGetFooByIdResponseMethod) == null) {
          FooGrpcServiceGrpc.getGetFooByIdResponseMethod = getGetFooByIdResponseMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest, com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFooByIdResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooGrpcServiceMethodDescriptorSupplier("getFooByIdResponse"))
              .build();
        }
      }
    }
    return getGetFooByIdResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAgeRequest,
      com.example.fit4j.grpc.TestGrpc.GetAgeResponse> getGetAgeRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAgeRequest",
      requestType = com.example.fit4j.grpc.TestGrpc.GetAgeRequest.class,
      responseType = com.example.fit4j.grpc.TestGrpc.GetAgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAgeRequest,
      com.example.fit4j.grpc.TestGrpc.GetAgeResponse> getGetAgeRequestMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAgeRequest, com.example.fit4j.grpc.TestGrpc.GetAgeResponse> getGetAgeRequestMethod;
    if ((getGetAgeRequestMethod = FooGrpcServiceGrpc.getGetAgeRequestMethod) == null) {
      synchronized (FooGrpcServiceGrpc.class) {
        if ((getGetAgeRequestMethod = FooGrpcServiceGrpc.getGetAgeRequestMethod) == null) {
          FooGrpcServiceGrpc.getGetAgeRequestMethod = getGetAgeRequestMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.TestGrpc.GetAgeRequest, com.example.fit4j.grpc.TestGrpc.GetAgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAgeRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetAgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetAgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooGrpcServiceMethodDescriptorSupplier("getAgeRequest"))
              .build();
        }
      }
    }
    return getGetAgeRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.PingRequest,
      com.example.fit4j.grpc.TestGrpc.PingResponse> getPingRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pingRequest",
      requestType = com.example.fit4j.grpc.TestGrpc.PingRequest.class,
      responseType = com.example.fit4j.grpc.TestGrpc.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.PingRequest,
      com.example.fit4j.grpc.TestGrpc.PingResponse> getPingRequestMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.PingRequest, com.example.fit4j.grpc.TestGrpc.PingResponse> getPingRequestMethod;
    if ((getPingRequestMethod = FooGrpcServiceGrpc.getPingRequestMethod) == null) {
      synchronized (FooGrpcServiceGrpc.class) {
        if ((getPingRequestMethod = FooGrpcServiceGrpc.getPingRequestMethod) == null) {
          FooGrpcServiceGrpc.getPingRequestMethod = getPingRequestMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.TestGrpc.PingRequest, com.example.fit4j.grpc.TestGrpc.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pingRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooGrpcServiceMethodDescriptorSupplier("pingRequest"))
              .build();
        }
      }
    }
    return getPingRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAllRequest,
      com.example.fit4j.grpc.TestGrpc.GetAllResponse> getGetAllRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRequest",
      requestType = com.example.fit4j.grpc.TestGrpc.GetAllRequest.class,
      responseType = com.example.fit4j.grpc.TestGrpc.GetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAllRequest,
      com.example.fit4j.grpc.TestGrpc.GetAllResponse> getGetAllRequestMethod() {
    io.grpc.MethodDescriptor<com.example.fit4j.grpc.TestGrpc.GetAllRequest, com.example.fit4j.grpc.TestGrpc.GetAllResponse> getGetAllRequestMethod;
    if ((getGetAllRequestMethod = FooGrpcServiceGrpc.getGetAllRequestMethod) == null) {
      synchronized (FooGrpcServiceGrpc.class) {
        if ((getGetAllRequestMethod = FooGrpcServiceGrpc.getGetAllRequestMethod) == null) {
          FooGrpcServiceGrpc.getGetAllRequestMethod = getGetAllRequestMethod =
              io.grpc.MethodDescriptor.<com.example.fit4j.grpc.TestGrpc.GetAllRequest, com.example.fit4j.grpc.TestGrpc.GetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.fit4j.grpc.TestGrpc.GetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FooGrpcServiceMethodDescriptorSupplier("getAllRequest"))
              .build();
        }
      }
    }
    return getGetAllRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FooGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceStub>() {
        @java.lang.Override
        public FooGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooGrpcServiceStub(channel, callOptions);
        }
      };
    return FooGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FooGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceBlockingStub>() {
        @java.lang.Override
        public FooGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return FooGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FooGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FooGrpcServiceFutureStub>() {
        @java.lang.Override
        public FooGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FooGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return FooGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FooGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFooListResponse(com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFooListResponseMethod(), responseObserver);
    }

    /**
     */
    public void getFooByIdResponse(com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFooByIdResponseMethod(), responseObserver);
    }

    /**
     */
    public void getAgeRequest(com.example.fit4j.grpc.TestGrpc.GetAgeRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgeRequestMethod(), responseObserver);
    }

    /**
     */
    public void pingRequest(com.example.fit4j.grpc.TestGrpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.PingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingRequestMethod(), responseObserver);
    }

    /**
     */
    public void getAllRequest(com.example.fit4j.grpc.TestGrpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFooListResponseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest,
                com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse>(
                  this, METHODID_GET_FOO_LIST_RESPONSE)))
          .addMethod(
            getGetFooByIdResponseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest,
                com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse>(
                  this, METHODID_GET_FOO_BY_ID_RESPONSE)))
          .addMethod(
            getGetAgeRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.fit4j.grpc.TestGrpc.GetAgeRequest,
                com.example.fit4j.grpc.TestGrpc.GetAgeResponse>(
                  this, METHODID_GET_AGE_REQUEST)))
          .addMethod(
            getPingRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.fit4j.grpc.TestGrpc.PingRequest,
                com.example.fit4j.grpc.TestGrpc.PingResponse>(
                  this, METHODID_PING_REQUEST)))
          .addMethod(
            getGetAllRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.fit4j.grpc.TestGrpc.GetAllRequest,
                com.example.fit4j.grpc.TestGrpc.GetAllResponse>(
                  this, METHODID_GET_ALL_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class FooGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<FooGrpcServiceStub> {
    private FooGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFooListResponse(com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFooListResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFooByIdResponse(com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFooByIdResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgeRequest(com.example.fit4j.grpc.TestGrpc.GetAgeRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgeRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pingRequest(com.example.fit4j.grpc.TestGrpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.PingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRequest(com.example.fit4j.grpc.TestGrpc.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FooGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FooGrpcServiceBlockingStub> {
    private FooGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse getFooListResponse(com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFooListResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse getFooByIdResponse(com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFooByIdResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.fit4j.grpc.TestGrpc.GetAgeResponse getAgeRequest(com.example.fit4j.grpc.TestGrpc.GetAgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgeRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.fit4j.grpc.TestGrpc.PingResponse pingRequest(com.example.fit4j.grpc.TestGrpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.fit4j.grpc.TestGrpc.GetAllResponse getAllRequest(com.example.fit4j.grpc.TestGrpc.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FooGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FooGrpcServiceFutureStub> {
    private FooGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FooGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse> getFooListResponse(
        com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFooListResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse> getFooByIdResponse(
        com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFooByIdResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.TestGrpc.GetAgeResponse> getAgeRequest(
        com.example.fit4j.grpc.TestGrpc.GetAgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgeRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.TestGrpc.PingResponse> pingRequest(
        com.example.fit4j.grpc.TestGrpc.PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.fit4j.grpc.TestGrpc.GetAllResponse> getAllRequest(
        com.example.fit4j.grpc.TestGrpc.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FOO_LIST_RESPONSE = 0;
  private static final int METHODID_GET_FOO_BY_ID_RESPONSE = 1;
  private static final int METHODID_GET_AGE_REQUEST = 2;
  private static final int METHODID_PING_REQUEST = 3;
  private static final int METHODID_GET_ALL_REQUEST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FooGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FooGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FOO_LIST_RESPONSE:
          serviceImpl.getFooListResponse((com.example.fit4j.grpc.TestGrpc.GetFooListGrpcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooListGrpcResponse>) responseObserver);
          break;
        case METHODID_GET_FOO_BY_ID_RESPONSE:
          serviceImpl.getFooByIdResponse((com.example.fit4j.grpc.TestGrpc.GetFooByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetFooByIdResponse>) responseObserver);
          break;
        case METHODID_GET_AGE_REQUEST:
          serviceImpl.getAgeRequest((com.example.fit4j.grpc.TestGrpc.GetAgeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAgeResponse>) responseObserver);
          break;
        case METHODID_PING_REQUEST:
          serviceImpl.pingRequest((com.example.fit4j.grpc.TestGrpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.PingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_REQUEST:
          serviceImpl.getAllRequest((com.example.fit4j.grpc.TestGrpc.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.example.fit4j.grpc.TestGrpc.GetAllResponse>) responseObserver);
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

  private static abstract class FooGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FooGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.fit4j.grpc.TestGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FooGrpcService");
    }
  }

  private static final class FooGrpcServiceFileDescriptorSupplier
      extends FooGrpcServiceBaseDescriptorSupplier {
    FooGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class FooGrpcServiceMethodDescriptorSupplier
      extends FooGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FooGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FooGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FooGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetFooListResponseMethod())
              .addMethod(getGetFooByIdResponseMethod())
              .addMethod(getGetAgeRequestMethod())
              .addMethod(getPingRequestMethod())
              .addMethod(getGetAllRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
