package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBs\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0018H\u0012J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0012J\b\u0010\u001c\u001a\u00020\u0016H\u0017R\u000e\u0010\n\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/RegistryClientConfiguration;", "", "registryServiceUrl", "", "maxAttempts", "", "initialIntervalInMillis", "", "intervalMultiplier", "", "bppRegistryServiceUrl", "enableSecurity", "", "connectionTimeoutInSeconds", "readTimeoutInSeconds", "writeTimeoutInSeconds", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "interceptor", "Lorg/beckn/one/sandbox/bap/client/shared/security/SignRequestInterceptor;", "(Ljava/lang/String;IJDLjava/lang/String;ZJJJLcom/fasterxml/jackson/databind/ObjectMapper;Lorg/beckn/one/sandbox/bap/client/shared/security/SignRequestInterceptor;)V", "bppRegistryServiceClient", "Lorg/beckn/one/sandbox/bap/client/external/registry/RegistryClient;", "buildHttpClient", "Lokhttp3/OkHttpClient;", "getRetryConfig", "Lio/github/resilience4j/retry/Retry;", "name", "registryServiceClient", "Companion", "sandbox_bap_client"})
@org.springframework.context.annotation.Configuration()
public class RegistryClientConfiguration {
    private final java.lang.String registryServiceUrl = null;
    private final int maxAttempts = 0;
    private final long initialIntervalInMillis = 0L;
    private final double intervalMultiplier = 0.0;
    private final java.lang.String bppRegistryServiceUrl = null;
    private final boolean enableSecurity = false;
    private final long connectionTimeoutInSeconds = 0L;
    private final long readTimeoutInSeconds = 0L;
    private final long writeTimeoutInSeconds = 0L;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private final org.beckn.one.sandbox.bap.client.shared.security.SignRequestInterceptor interceptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BPP_REGISTRY_SERVICE_CLIENT = "bppRegistryServiceClient";
    @org.jetbrains.annotations.NotNull()
    public static final org.beckn.one.sandbox.bap.configurations.RegistryClientConfiguration.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Primary()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.client.external.registry.RegistryClient registryServiceClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean(value = {"bppRegistryServiceClient"})
    public org.beckn.one.sandbox.bap.client.external.registry.RegistryClient bppRegistryServiceClient() {
        return null;
    }
    
    private okhttp3.OkHttpClient buildHttpClient() {
        return null;
    }
    
    private io.github.resilience4j.retry.Retry getRetryConfig(java.lang.String name) {
        return null;
    }
    
    public RegistryClientConfiguration(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${registry_service.url}")
    @org.springframework.beans.factory.annotation.Autowired()
    java.lang.String registryServiceUrl, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.retry.max_attempts}")
    int maxAttempts, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.retry.initial_interval_in_millis}")
    long initialIntervalInMillis, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.retry.interval_multiplier}")
    double intervalMultiplier, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${bpp_registry_service.url}")
    @org.springframework.beans.factory.annotation.Autowired()
    java.lang.String bppRegistryServiceUrl, @org.springframework.beans.factory.annotation.Value(value = "${beckn.security.enabled}")
    boolean enableSecurity, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.timeouts.connection_in_seconds}")
    long connectionTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.timeouts.read_in_seconds}")
    long readTimeoutInSeconds, @org.springframework.beans.factory.annotation.Value(value = "${registry_service.timeouts.write_in_seconds}")
    long writeTimeoutInSeconds, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    org.beckn.one.sandbox.bap.client.shared.security.SignRequestInterceptor interceptor) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/RegistryClientConfiguration$Companion;", "", "()V", "BPP_REGISTRY_SERVICE_CLIENT", "", "sandbox_bap_client"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}