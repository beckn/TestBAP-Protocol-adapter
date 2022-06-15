package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u0013H\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/BapClientConfiguration;", "", "bapServiceUrl", "", "maxAttempts", "", "initialIntervalInMillis", "", "intervalMultiplier", "", "connectionTimeoutInSeconds", "readTimeoutInSeconds", "writeTimeoutInSeconds", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Ljava/lang/String;IJDJJJLcom/fasterxml/jackson/databind/ObjectMapper;)V", "bapClient", "Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "buildHttpClient", "Lokhttp3/OkHttpClient;", "getRetryConfig", "Lio/github/resilience4j/retry/Retry;", "sandbox_bap_client"})
@org.springframework.context.annotation.Configuration()
public class BapClientConfiguration {
    private final java.lang.String bapServiceUrl = null;
    private final int maxAttempts = 0;
    private final long initialIntervalInMillis = 0L;
    private final double intervalMultiplier = 0.0;
    private final long connectionTimeoutInSeconds = 0L;
    private final long readTimeoutInSeconds = 0L;
    private final long writeTimeoutInSeconds = 0L;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient bapClient() {
        return null;
    }
    
    private okhttp3.OkHttpClient buildHttpClient() {
        return null;
    }
    
    private io.github.resilience4j.retry.Retry getRetryConfig() {
        return null;
    }
    
    public BapClientConfiguration(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.url}")
    @org.springframework.beans.factory.annotation.Autowired()
    java.lang.String bapServiceUrl, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.retry.max_attempts}")
    int maxAttempts, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.retry.initial_interval_in_millis}")
    long initialIntervalInMillis, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.retry.interval_multiplier}")
    double intervalMultiplier, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.timeouts.connection_in_seconds}")
    long connectionTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.timeouts.read_in_seconds}")
    long readTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${protocol_service.timeouts.write_in_seconds}")
    long writeTimeoutInSeconds, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
}