package br.com.cardoso.service

import br.com.cardoso.AlphabetReply
import br.com.cardoso.GrpcAlphabetServiceGrpc
import com.google.protobuf.Empty
import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@GrpcService
class AlphabetService : GrpcAlphabetServiceGrpc.GrpcAlphabetServiceImplBase() {

    private val logger: Logger = LoggerFactory.getLogger(AlphabetService::class.java)

    override fun send(request: Empty?, responseObserver: StreamObserver<AlphabetReply>) {
        logger.info("Requisição para obter o Alphabet gRPC")
        responseObserver.onNext(AlphabetReply.newBuilder().setA("a").setB("b").setC("c").setD("d").setE("e").setF("f")
                .setG("g").setH("h").setI("i").setJ("j").setK("k").setL("l").setM("m").setN("n").setO("o").setP("p")
                .setQ("q").setR("r").setS("s").setT("t").setU("u").setV("v").setW("w").setX("x").setY("y").setZ("z")
                .build())
        responseObserver.onCompleted()
    }
}