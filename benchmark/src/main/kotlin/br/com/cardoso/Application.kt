package br.com.cardoso

import br.com.cardoso.grpc.GrpcCall
import br.com.cardoso.rest.RestCall
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.Options
import org.openjdk.jmh.runner.options.OptionsBuilder


class Application
fun main() {
    val opt: Options = OptionsBuilder()
            .include(GrpcCall::class.java.simpleName)
            .include(RestCall::class.java.simpleName)
            .forks(1)
            .output("results/All")
            .build()
    Runner(opt).run()
}