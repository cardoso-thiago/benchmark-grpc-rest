package br.com.cardoso;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: alphabet.proto")
public final class GrpcAlphabetServiceGrpc {

  private GrpcAlphabetServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.cardoso.GrpcAlphabetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      br.com.cardoso.AlphabetReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.google.protobuf.Empty.class,
      responseType = br.com.cardoso.AlphabetReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      br.com.cardoso.AlphabetReply> getSendMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, br.com.cardoso.AlphabetReply> getSendMethod;
    if ((getSendMethod = GrpcAlphabetServiceGrpc.getSendMethod) == null) {
      synchronized (GrpcAlphabetServiceGrpc.class) {
        if ((getSendMethod = GrpcAlphabetServiceGrpc.getSendMethod) == null) {
          GrpcAlphabetServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, br.com.cardoso.AlphabetReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.cardoso.AlphabetReply.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcAlphabetServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcAlphabetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceStub>() {
        @java.lang.Override
        public GrpcAlphabetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcAlphabetServiceStub(channel, callOptions);
        }
      };
    return GrpcAlphabetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcAlphabetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceBlockingStub>() {
        @java.lang.Override
        public GrpcAlphabetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcAlphabetServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcAlphabetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcAlphabetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcAlphabetServiceFutureStub>() {
        @java.lang.Override
        public GrpcAlphabetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcAlphabetServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcAlphabetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcAlphabetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<br.com.cardoso.AlphabetReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                br.com.cardoso.AlphabetReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcAlphabetServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcAlphabetServiceStub> {
    private GrpcAlphabetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcAlphabetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcAlphabetServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<br.com.cardoso.AlphabetReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcAlphabetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcAlphabetServiceBlockingStub> {
    private GrpcAlphabetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcAlphabetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcAlphabetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.cardoso.AlphabetReply send(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcAlphabetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcAlphabetServiceFutureStub> {
    private GrpcAlphabetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcAlphabetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcAlphabetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.cardoso.AlphabetReply> send(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcAlphabetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcAlphabetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<br.com.cardoso.AlphabetReply>) responseObserver);
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

  private static abstract class GrpcAlphabetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcAlphabetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.cardoso.AlphabetService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcAlphabetService");
    }
  }

  private static final class GrpcAlphabetServiceFileDescriptorSupplier
      extends GrpcAlphabetServiceBaseDescriptorSupplier {
    GrpcAlphabetServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcAlphabetServiceMethodDescriptorSupplier
      extends GrpcAlphabetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcAlphabetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrpcAlphabetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcAlphabetServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
