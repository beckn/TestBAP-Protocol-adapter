package org.beckn.one.sandbox.bap.client.discovery.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0017R\u000e\u0010\u000f\u001a\u00020\u0010X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/discovery/controllers/OnSearchPollController;", "Lorg/beckn/one/sandbox/bap/client/shared/controllers/AbstractOnPollController;", "Lorg/beckn/protocol/schemas/ProtocolOnSearch;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientSearchResponse;", "onPollService", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "protocolClient", "Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;)V", "log", "Lorg/slf4j/Logger;", "getProtocolClient", "()Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "onSearchV1", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "messageId", "", "providerName", "categoryName", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class OnSearchPollController extends org.beckn.one.sandbox.bap.client.shared.controllers.AbstractOnPollController<org.beckn.protocol.schemas.ProtocolOnSearch, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSearchResponse> {
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v1/on_search"})
    public org.springframework.http.ResponseEntity<? extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> onSearchV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String providerName, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String categoryName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient getProtocolClient() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnSearchPollController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<org.beckn.protocol.schemas.ProtocolOnSearch, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSearchResponse> onPollService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService) {
        super(null, null, null, null);
    }
}