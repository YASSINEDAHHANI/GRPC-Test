package org.xproce.labs;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: computer.proto")
public final class ComputerServiceGrpc {

  private ComputerServiceGrpc() {}

  public static final String SERVICE_NAME = "org.xproce.labs.ComputerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.xproce.labs.Computer.ComputerRequest,
      org.xproce.labs.Computer.ComputerResponse> getAddComputerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addComputer",
      requestType = org.xproce.labs.Computer.ComputerRequest.class,
      responseType = org.xproce.labs.Computer.ComputerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.xproce.labs.Computer.ComputerRequest,
      org.xproce.labs.Computer.ComputerResponse> getAddComputerMethod() {
    io.grpc.MethodDescriptor<org.xproce.labs.Computer.ComputerRequest, org.xproce.labs.Computer.ComputerResponse> getAddComputerMethod;
    if ((getAddComputerMethod = ComputerServiceGrpc.getAddComputerMethod) == null) {
      synchronized (ComputerServiceGrpc.class) {
        if ((getAddComputerMethod = ComputerServiceGrpc.getAddComputerMethod) == null) {
          ComputerServiceGrpc.getAddComputerMethod = getAddComputerMethod = 
              io.grpc.MethodDescriptor.<org.xproce.labs.Computer.ComputerRequest, org.xproce.labs.Computer.ComputerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.xproce.labs.ComputerService", "addComputer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.labs.Computer.ComputerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.xproce.labs.Computer.ComputerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ComputerServiceMethodDescriptorSupplier("addComputer"))
                  .build();
          }
        }
     }
     return getAddComputerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputerServiceStub newStub(io.grpc.Channel channel) {
    return new ComputerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ComputerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ComputerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ComputerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addComputer(org.xproce.labs.Computer.ComputerRequest request,
        io.grpc.stub.StreamObserver<org.xproce.labs.Computer.ComputerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddComputerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddComputerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.xproce.labs.Computer.ComputerRequest,
                org.xproce.labs.Computer.ComputerResponse>(
                  this, METHODID_ADD_COMPUTER)))
          .build();
    }
  }

  /**
   */
  public static final class ComputerServiceStub extends io.grpc.stub.AbstractStub<ComputerServiceStub> {
    private ComputerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerServiceStub(channel, callOptions);
    }

    /**
     */
    public void addComputer(org.xproce.labs.Computer.ComputerRequest request,
        io.grpc.stub.StreamObserver<org.xproce.labs.Computer.ComputerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddComputerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ComputerServiceBlockingStub extends io.grpc.stub.AbstractStub<ComputerServiceBlockingStub> {
    private ComputerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.xproce.labs.Computer.ComputerResponse addComputer(org.xproce.labs.Computer.ComputerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddComputerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ComputerServiceFutureStub extends io.grpc.stub.AbstractStub<ComputerServiceFutureStub> {
    private ComputerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ComputerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ComputerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.xproce.labs.Computer.ComputerResponse> addComputer(
        org.xproce.labs.Computer.ComputerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddComputerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_COMPUTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ComputerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ComputerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_COMPUTER:
          serviceImpl.addComputer((org.xproce.labs.Computer.ComputerRequest) request,
              (io.grpc.stub.StreamObserver<org.xproce.labs.Computer.ComputerResponse>) responseObserver);
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

  private static abstract class ComputerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.xproce.labs.Computer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputerService");
    }
  }

  private static final class ComputerServiceFileDescriptorSupplier
      extends ComputerServiceBaseDescriptorSupplier {
    ComputerServiceFileDescriptorSupplier() {}
  }

  private static final class ComputerServiceMethodDescriptorSupplier
      extends ComputerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ComputerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ComputerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputerServiceFileDescriptorSupplier())
              .addMethod(getAddComputerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
