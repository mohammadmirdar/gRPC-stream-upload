package com.example.samplegrpcapp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The uploader0 service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UploadServiceGrpc {

  private UploadServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.samplegrpcapp.UploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RequestOuterClass.Request,
      ResponseOuterClass.Response> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = RequestOuterClass.Request.class,
      responseType = ResponseOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<RequestOuterClass.Request,
      ResponseOuterClass.Response> getUploadMethod() {
    io.grpc.MethodDescriptor<RequestOuterClass.Request, ResponseOuterClass.Response> getUploadMethod;
    if ((getUploadMethod = UploadServiceGrpc.getUploadMethod) == null) {
      synchronized (UploadServiceGrpc.class) {
        if ((getUploadMethod = UploadServiceGrpc.getUploadMethod) == null) {
          UploadServiceGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<RequestOuterClass.Request, ResponseOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RequestOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ResponseOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UploadServiceMethodDescriptorSupplier("upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RequestOuterClass.Request,
      ResponseOuterClass.Response> getUploadChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload_chunk",
      requestType = RequestOuterClass.Request.class,
      responseType = ResponseOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RequestOuterClass.Request,
      ResponseOuterClass.Response> getUploadChunkMethod() {
    io.grpc.MethodDescriptor<RequestOuterClass.Request, ResponseOuterClass.Response> getUploadChunkMethod;
    if ((getUploadChunkMethod = UploadServiceGrpc.getUploadChunkMethod) == null) {
      synchronized (UploadServiceGrpc.class) {
        if ((getUploadChunkMethod = UploadServiceGrpc.getUploadChunkMethod) == null) {
          UploadServiceGrpc.getUploadChunkMethod = getUploadChunkMethod =
              io.grpc.MethodDescriptor.<RequestOuterClass.Request, ResponseOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "upload_chunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RequestOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ResponseOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UploadServiceMethodDescriptorSupplier("upload_chunk"))
              .build();
        }
      }
    }
    return getUploadChunkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceStub>() {
        @Override
        public UploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceStub(channel, callOptions);
        }
      };
    return UploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceBlockingStub>() {
        @Override
        public UploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceBlockingStub(channel, callOptions);
        }
      };
    return UploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UploadServiceFutureStub>() {
        @Override
        public UploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UploadServiceFutureStub(channel, callOptions);
        }
      };
    return UploadServiceFutureStub.newStub(factory, channel);
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
    default io.grpc.stub.StreamObserver<RequestOuterClass.Request> upload(
        io.grpc.stub.StreamObserver<ResponseOuterClass.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    default void uploadChunk(RequestOuterClass.Request request,
                             io.grpc.stub.StreamObserver<ResponseOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadChunkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UploadService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static abstract class UploadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return UploadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UploadService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UploadServiceStub> {
    private UploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a upload
     * </pre>
     */
    public io.grpc.stub.StreamObserver<RequestOuterClass.Request> upload(
        io.grpc.stub.StreamObserver<ResponseOuterClass.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void uploadChunk(RequestOuterClass.Request request,
                            io.grpc.stub.StreamObserver<ResponseOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadChunkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UploadService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UploadServiceBlockingStub> {
    private UploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ResponseOuterClass.Response uploadChunk(RequestOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadChunkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UploadService.
   * <pre>
   * The uploader0 service definition.
   * </pre>
   */
  public static final class UploadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UploadServiceFutureStub> {
    private UploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UploadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResponseOuterClass.Response> uploadChunk(
        RequestOuterClass.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadChunkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_CHUNK = 0;
  private static final int METHODID_UPLOAD = 1;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_CHUNK:
          serviceImpl.uploadChunk((RequestOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<ResponseOuterClass.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.upload(
              (io.grpc.stub.StreamObserver<ResponseOuterClass.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              RequestOuterClass.Request,
              ResponseOuterClass.Response>(
                service, METHODID_UPLOAD)))
        .addMethod(
          getUploadChunkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              RequestOuterClass.Request,
              ResponseOuterClass.Response>(
                service, METHODID_UPLOAD_CHUNK)))
        .build();
  }

  private static abstract class UploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UploadServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return FileUpload.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UploadService");
    }
  }

  private static final class UploadServiceFileDescriptorSupplier
      extends UploadServiceBaseDescriptorSupplier {
    UploadServiceFileDescriptorSupplier() {}
  }

  private static final class UploadServiceMethodDescriptorSupplier
      extends UploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UploadServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UploadServiceFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getUploadChunkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
