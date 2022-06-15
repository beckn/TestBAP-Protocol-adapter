package org.beckn.one.sandbox.bap.client.shared.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0010\u001a\u00020\u000fH\u0017J*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00122\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0017J\u001a\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012H\u0017J\u001c\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0012J\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140#H\u0012R\u000e\u0010\u0006\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;", "", "cacheManager", "Lorg/springframework/cache/CacheManager;", "registryServiceClient", "Lorg/beckn/one/sandbox/bap/client/external/registry/RegistryClient;", "bppRegistryServiceClient", "domain", "", "city", "country", "(Lorg/springframework/cache/CacheManager;Lorg/beckn/one/sandbox/bap/client/external/registry/RegistryClient;Lorg/beckn/one/sandbox/bap/client/external/registry/RegistryClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "log", "Lorg/slf4j/Logger;", "clearBppsByIdCache", "", "clearGatewayCache", "lookup", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError;", "", "Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto;", "client", "request", "Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberLookupRequest;", "lookupBppById", "id", "lookupGateways", "lookupRequest", "subscriberType", "Lorg/beckn/one/sandbox/bap/client/external/domains/Subscriber$Type;", "subscriberId", "noSubscribersFound", "", "httpResponse", "Lretrofit2/Response;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class RegistryService {
    private final org.slf4j.Logger log = null;
    private final org.springframework.cache.CacheManager cacheManager = null;
    private final org.beckn.one.sandbox.bap.client.external.registry.RegistryClient registryServiceClient = null;
    private final org.beckn.one.sandbox.bap.client.external.registry.RegistryClient bppRegistryServiceClient = null;
    private final java.lang.String domain = null;
    private final java.lang.String city = null;
    private final java.lang.String country = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.Cacheable(value = {"gateways"})
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError, java.util.List<org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto>> lookupGateways() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.Cacheable(value = {"bppsById"})
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError, java.util.List<org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto>> lookupBppById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.springframework.scheduling.annotation.Scheduled(cron = "${registry_service.cache.expiry_cron_schedule}")
    public void clearGatewayCache() {
    }
    
    @org.springframework.scheduling.annotation.Scheduled(cron = "${registry_service.cache.expiry_cron_schedule}")
    public void clearBppsByIdCache() {
    }
    
    private arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError, java.util.List<org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto>> lookup(org.beckn.one.sandbox.bap.client.external.registry.RegistryClient client, org.beckn.one.sandbox.bap.client.external.registry.SubscriberLookupRequest request) {
        return null;
    }
    
    private org.beckn.one.sandbox.bap.client.external.registry.SubscriberLookupRequest lookupRequest(org.beckn.one.sandbox.bap.client.external.domains.Subscriber.Type subscriberType, java.lang.String subscriberId) {
        return null;
    }
    
    private boolean noSubscribersFound(retrofit2.Response<java.util.List<org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto>> httpResponse) {
        return false;
    }
    
    public RegistryService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    org.springframework.cache.CacheManager cacheManager, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    org.beckn.one.sandbox.bap.client.external.registry.RegistryClient registryServiceClient, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    @org.springframework.beans.factory.annotation.Qualifier(value = "bppRegistryServiceClient")
    org.beckn.one.sandbox.bap.client.external.registry.RegistryClient bppRegistryServiceClient, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.domain}")
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.city}")
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.country}")
    java.lang.String country) {
        super();
    }
}