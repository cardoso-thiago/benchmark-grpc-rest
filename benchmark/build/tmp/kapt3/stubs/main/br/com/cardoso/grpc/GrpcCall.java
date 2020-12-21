package br.com.cardoso.grpc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/cardoso/grpc/GrpcCall;", "Lbr/com/cardoso/config/BenchmarkConfig;", "()V", "channel", "Lio/grpc/ManagedChannel;", "stub", "Lbr/com/cardoso/GrpcAlphabetServiceGrpc$GrpcAlphabetServiceBlockingStub;", "callGrpcServer", "Lbr/com/cardoso/AlphabetReply;", "doSetup", "", "tearDown", "benchmark"})
public class GrpcCall extends br.com.cardoso.config.BenchmarkConfig {
    private io.grpc.ManagedChannel channel;
    private br.com.cardoso.GrpcAlphabetServiceGrpc.GrpcAlphabetServiceBlockingStub stub;
    
    @org.openjdk.jmh.annotations.Setup(value = org.openjdk.jmh.annotations.Level.Trial)
    public void doSetup() {
    }
    
    @org.openjdk.jmh.annotations.TearDown()
    public void tearDown() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.openjdk.jmh.annotations.Benchmark()
    public final br.com.cardoso.AlphabetReply callGrpcServer() {
        return null;
    }
    
    public GrpcCall() {
        super();
    }
}