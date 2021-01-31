package br.com.cardoso.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/cardoso/rest/RestHttp2Call;", "Lbr/com/cardoso/config/BenchmarkConfig;", "()V", "httpClient", "Ljava/net/http/HttpClient;", "callRestApi", "Ljava/net/http/HttpResponse;", "", "state", "Lbr/com/cardoso/rest/RestHttp2Call$InitialState;", "doSetup", "", "InitialState", "benchmark"})
public class RestHttp2Call extends br.com.cardoso.config.BenchmarkConfig {
    private java.net.http.HttpClient httpClient;
    
    @org.openjdk.jmh.annotations.Setup(value = org.openjdk.jmh.annotations.Level.Trial)
    public void doSetup() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.openjdk.jmh.annotations.Benchmark()
    public final java.net.http.HttpResponse<java.lang.String> callRestApi(@org.jetbrains.annotations.NotNull()
    br.com.cardoso.rest.RestHttp2Call.InitialState state) {
        return null;
    }
    
    public RestHttp2Call() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbr/com/cardoso/rest/RestHttp2Call$InitialState;", "", "()V", "request", "Ljava/net/http/HttpRequest;", "getRequest", "()Ljava/net/http/HttpRequest;", "benchmark"})
    @org.openjdk.jmh.annotations.State(value = org.openjdk.jmh.annotations.Scope.Thread)
    public static class InitialState {
        @org.jetbrains.annotations.NotNull()
        private final java.net.http.HttpRequest request = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.net.http.HttpRequest getRequest() {
            return null;
        }
        
        public InitialState() {
            super();
        }
    }
}