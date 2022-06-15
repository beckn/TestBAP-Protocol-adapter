package org.beckn.one.sandbox.bap.client.external.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u001c\u001a\u00020\u001dH\u0012J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0012R\u000e\u0010\f\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000f\u001a\u00020\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\r\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/gateway/GatewayClientFactory;", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "maxAttempts", "", "initialIntervalInMillis", "", "intervalMultiplier", "", "enableSecurity", "", "connectionTimeoutInSeconds", "readTimeoutInSeconds", "writeTimeoutInSeconds", "interceptor", "Lorg/beckn/one/sandbox/bap/client/shared/security/SignRequestInterceptor;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;IJDZJJJLorg/beckn/one/sandbox/bap/client/shared/security/SignRequestInterceptor;)V", "getEnableSecurity", "()Z", "getInitialIntervalInMillis", "()J", "getIntervalMultiplier", "()D", "getMaxAttempts", "()I", "getObjectMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "buildHttpClient", "Lokhttp3/OkHttpClient;", "getClient", "Lorg/beckn/one/sandbox/bap/client/external/gateway/GatewayClient;", "gatewayUri", "", "getRetryConfig", "Lio/github/resilience4j/retry/Retry;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class GatewayClientFactory {
    @org.jetbrains.annotations.NotNull()
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private final int maxAttempts = 0;
    private final long initialIntervalInMillis = 0L;
    private final double intervalMultiplier = 0.0;
    private final boolean enableSecurity = false;
    private final long connectionTimeoutInSeconds = 0L;
    private final long readTimeoutInSeconds = 0L;
    private final long writeTimeoutInSeconds = 0L;
    private final org.beckn.one.sandbox.bap.client.shared.security.SignRequestInterceptor interceptor = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.Cacheable(value = {"gatewayClients"})
    public org.beckn.one.sandbox.bap.client.external.gateway.GatewayClient getClient(@org.jetbrains.annotations.NotNull()
    java.lang.String gatewayUri) {
        return null;
    }
    
    private okhttp3.OkHttpClient buildHttpClient() {
        return null;
    }
    
    private io.github.resilience4j.retry.Retry getRetryConfig(java.lang.String gatewayUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper() {
        return null;
    }
    
    public int getMaxAttempts() {
        return 0;
    }
    
    public long getInitialIntervalInMillis() {
        return 0L;
    }
    
    public double getIntervalMultiplier() {
        return 0.0;
    }
    
    public boolean getEnableSecurity() {
        return false;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public GatewayClientFactory(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.retry.max_attempts}")
    int maxAttempts, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.retry.initial_interval_in_millis}")
    long initialIntervalInMillis, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.retry.interval_multiplier}")
    double intervalMultiplier, @org.springframework.beans.factory.annotation.Value(value = "${beckn.security.enabled}")
    boolean enableSecurity, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.timeouts.connection_in_seconds}")
    long connectionTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.timeouts.read_in_seconds}")
    long readTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${gateway_service.timeouts.write_in_seconds}")
    long writeTimeoutInSeconds, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.security.SignRequestInterceptor interceptor) {
        super();
    }
}