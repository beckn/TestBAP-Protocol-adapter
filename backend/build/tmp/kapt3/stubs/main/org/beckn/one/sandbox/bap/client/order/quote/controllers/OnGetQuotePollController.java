package org.beckn.one.sandbox.bap.client.order.quote.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ*\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u001a*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00190\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u001a\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u00182\b\b\u0001\u0010\u001f\u001a\u00020 H\u0017J \u0010!\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00182\b\b\u0001\u0010\"\u001a\u00020 H\u0017J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u001cH\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/quote/controllers/OnGetQuotePollController;", "Lorg/beckn/one/sandbox/bap/client/shared/controllers/AbstractOnPollController;", "Lorg/beckn/protocol/schemas/ProtocolOnSelect;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientQuoteResponse;", "onPollService", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "protocolClient", "Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;)V", "getContextFactory", "()Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getOnPollService", "()Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "mapToErrorResponse", "Lorg/springframework/http/ResponseEntity;", "", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "onGetQuoteV1", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "messageId", "", "onGetQuoteV2", "messageIds", "setLogging", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "error", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class OnGetQuotePollController extends org.beckn.one.sandbox.bap.client.shared.controllers.AbstractOnPollController<org.beckn.protocol.schemas.ProtocolOnSelect, org.beckn.one.sandbox.bap.client.shared.dtos.ClientQuoteResponse> {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<org.beckn.protocol.schemas.ProtocolOnSelect, org.beckn.one.sandbox.bap.client.shared.dtos.ClientQuoteResponse> onPollService = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    private final org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient = null;
    private final org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v1/on_get_quote"})
    public org.springframework.http.ResponseEntity<? extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> onGetQuoteV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String messageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v2/on_get_quote"})
    public org.springframework.http.ResponseEntity<? extends java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse>> onGetQuoteV2(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String messageIds) {
        return null;
    }
    
    private void setLogging(org.beckn.protocol.schemas.ProtocolContext context, org.beckn.one.sandbox.bap.errors.HttpError error) {
    }
    
    private org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.ClientQuoteResponse>> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<org.beckn.protocol.schemas.ProtocolOnSelect, org.beckn.one.sandbox.bap.client.shared.dtos.ClientQuoteResponse> getOnPollService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.factories.ContextFactory getContextFactory() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnGetQuotePollController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<org.beckn.protocol.schemas.ProtocolOnSelect, org.beckn.one.sandbox.bap.client.shared.dtos.ClientQuoteResponse> onPollService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService) {
        super(null, null, null, null);
    }
}