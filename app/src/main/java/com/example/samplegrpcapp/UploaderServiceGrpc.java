package com.example.samplegrpcapp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The uploader0 service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UploaderServiceGrpc {

  private UploaderServiceGrpc() {}

  public static final String SERVICE_NAME = "samplegrpcapp.UploaderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request,
      com.example.samplegrpcapp.ProtoReply.Reply> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = com.example.samplegrpcapp.ProtoRequest.Request.class,
      responseType = com.example.samplegrpcapp.ProtoReply.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request,
      com.example.samplegrpcapp.ProtoReply.Reply> getUploadMethod() {
    io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request, com.example.samplegrpcapp.ProtoReply.Reply> getUploadMethod;
    if ((getUploadMethod = UploaderServiceGrpc.getUploadMethod) == null) {
      synchronized (UploaderServiceGrpc.class) {
        if ((getUploadMethod = UploaderServiceGrpc.getUploadMethod) == null) {
          UploaderServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<com.example.samplegrpcapp.ProtoRequest.Request, com.example.samplegrpcapp.ProtoReply.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.samplegrpcapp.ProtoRequest.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.samplegrpcapp.ProtoReply.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new UploaderServiceMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request,
      com.example.samplegrpcapp.ProtoReply.Reply> getUploadStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadStream",
      requestType = com.example.samplegrpcapp.ProtoRequest.Request.class,
      responseType = com.example.samplegrpcapp.ProtoReply.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request,
      com.example.samplegrpcapp.ProtoReply.Reply> getUploadStreamMethod() {
    io.grpc.MethodDescriptor<com.example.samplegrpcapp.ProtoRequest.Request, com.example.samplegrpcapp.ProtoReply.Reply> getUploadStreamMethod;
    if ((getUploadStreamMethod = UploaderServiceGrpc.getUploadStreamMethod) == null) {
      synchronized (UploaderServiceGrpc.class) {
        if ((getUploadStreamMethod = UploaderServiceGrpc.getUploadStreamMethod) == null) {
          UploaderServiceGrpc.getUploadStreamMethod = getUploadStreamMethod =
              io.grpc.MethodDescriptor.<com.example.samplegrpcapp.ProtoRequest.Request, com.example.samplegrpcapp.ProtoReply.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.samplegrpcapp.ProtoRequest.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.samplegrpcapp.ProtoReply.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new UploaderServiceMethodDescriptorSupplier("UploadStream"))
              .build();
        }
      }
    }
    return getUploadStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploaderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploaderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploaderServiceStub>() {
        @java.lang.Override
        public UploaderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploaderServiceStub(channel, callOptions);
        }
      };
    return UploaderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploaderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploaderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploaderServiceBlockingStub>() {
        @java.lang.Override
        public UploaderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploaderServiceBlockingStub(channel, callOptions);
        }
      };
    return UploaderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploaderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploaderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploaderServiceFutureStub>() {
        @java.lang.Override
        public UploaderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploaderServiceFutureStub(channel, callOptions);
        }
      };
    return UploaderServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a upload
     * </pre>
     */
    default void upload(com.example.samplegrpcapp.ProtoRequest.Request request,
        io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoRequest.Request> uploadStream(
        io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UploaderService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static abstract class UploaderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UploaderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UploaderService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploaderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UploaderServiceStub> {
    private UploaderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploaderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploaderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a upload
     * </pre>
     */
    public void upload(com.example.samplegrpcapp.ProtoRequest.Request request,
        io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoRequest.Request> uploadStream(
        io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UploaderService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploaderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UploaderServiceBlockingStub> {
    private UploaderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploaderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploaderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a upload
     * </pre>
     */
    public com.example.samplegrpcapp.ProtoReply.Reply upload(com.example.samplegrpcapp.ProtoRequest.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UploaderService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploaderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UploaderServiceFutureStub> {
    private UploaderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UploaderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploaderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a upload
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.samplegrpcapp.ProtoReply.Reply> upload(
        com.example.samplegrpcapp.ProtoRequest.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_UPLOAD_STREAM = 1;

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
        case METHODID_UPLOAD:
          serviceImpl.upload((com.example.samplegrpcapp.ProtoRequest.Request) request,
              (io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply>) responseObserver);
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
        case METHODID_UPLOAD_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadStream(
              (io.grpc.stub.StreamObserver<com.example.samplegrpcapp.ProtoReply.Reply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.samplegrpcapp.ProtoRequest.Request,
              com.example.samplegrpcapp.ProtoReply.Reply>(
                service, METHODID_UPLOAD)))
        .addMethod(
          getUploadStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.example.samplegrpcapp.ProtoRequest.Request,
              com.example.samplegrpcapp.ProtoReply.Reply>(
                service, METHODID_UPLOAD_STREAM)))
        .build();
  }

  private static abstract class UploaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploaderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
//      return com.example.samplegrpcapp.UploaderServiceGrpc.getDescriptor();
      return null;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploaderService");
    }
  }

  private static final class UploaderServiceFileDescriptorSupplier
      extends UploaderServiceBaseDescriptorSupplier {
    UploaderServiceFileDescriptorSupplier() {}
  }

  private static final class UploaderServiceMethodDescriptorSupplier
      extends UploaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploaderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UploaderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploaderServiceFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getUploadStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
