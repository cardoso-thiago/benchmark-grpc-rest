package br.com.cardoso.grpc

import br.com.cardoso.AlphabetReply
import br.com.cardoso.GrpcAlphabetServiceGrpc
import br.com.cardoso.config.BenchmarkConfig
import com.google.protobuf.Empty
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.TearDown

open class GrpcCall : BenchmarkConfig() {

    private lateinit var channel: ManagedChannel
    private lateinit var stub: GrpcAlphabetServiceGrpc.GrpcAlphabetServiceBlockingStub

    @Setup(Level.Trial)
    open fun doSetup() {
        println("Do Setup gRPC")
        channel = ManagedChannelBuilder.forAddress("localhost", 9999)
                .usePlaintext()
                .build()
        stub = GrpcAlphabetServiceGrpc.newBlockingStub(channel)
    }

    @TearDown
    open fun tearDown() {
        channel.shutdown()
    }

    @Benchmark
    fun callGrpcServer(): AlphabetReply? {
        return stub.send(Empty.getDefaultInstance())
    }
}