package org.beckn.one.sandbox.bap.client.discovery.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0012J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/discovery/services/GatewayService;", "", "gatewayServiceClientFactory", "Lorg/beckn/one/sandbox/bap/client/external/gateway/GatewayClientFactory;", "(Lorg/beckn/one/sandbox/bap/client/external/gateway/GatewayClientFactory;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "buildProtocolSearchRequest", "Lorg/beckn/protocol/schemas/ProtocolSearchRequest;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "criteria", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/SearchCriteria;", "search", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/gateway/GatewaySearchError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "gateway", "Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class GatewayService {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.external.gateway.GatewayClientFactory gatewayServiceClientFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.gateway.GatewaySearchError, org.beckn.protocol.schemas.ProtocolAckResponse> search(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto gateway, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.SearchCriteria criteria) {
        return null;
    }
    
    private org.beckn.protocol.schemas.ProtocolSearchRequest buildProtocolSearchRequest(org.beckn.protocol.schemas.ProtocolContext context, org.beckn.one.sandbox.bap.client.shared.dtos.SearchCriteria criteria) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public GatewayService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.gateway.GatewayClientFactory gatewayServiceClientFactory) {
        super();
    }
}