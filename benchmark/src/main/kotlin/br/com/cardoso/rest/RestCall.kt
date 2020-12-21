package br.com.cardoso.rest

import br.com.cardoso.config.BenchmarkConfig
import org.openjdk.jmh.annotations.*
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration

open class RestCall : BenchmarkConfig() {

    private lateinit var httpClient: HttpClient

    @State(Scope.Thread)
    open class InitialState {
        val request: HttpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:9998/alphabet"))
                .build()
    }

    @Setup(Level.Trial)
    open fun doSetup() {
        println("Do Setup Rest")
        httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build()

    }

    @Benchmark
    fun callRestApi(state: InitialState): HttpResponse<String>? {
        return httpClient.send(state.request, HttpResponse.BodyHandlers.ofString())
    }
}