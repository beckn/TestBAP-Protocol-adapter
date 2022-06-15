package org.beckn.one.sandbox.bap.client.order.init.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0017J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00190\u00142\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0017J&\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00150\u00150\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0012J$\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/init/controllers/InitOrderController;", "", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "initOrderService", "Lorg/beckn/one/sandbox/bap/client/order/init/services/InitOrderService;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "(Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/order/init/services/InitOrderService;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getContext", "Lorg/beckn/protocol/schemas/ProtocolContext;", "transactionId", "", "initiOrderV1", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "orderRequest", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderRequestDto;", "initializeOrderV2", "", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "context", "setLogging", "", "error", "protocolAckResponse", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class InitOrderController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    private final org.beckn.one.sandbox.bap.client.order.init.services.InitOrderService initOrderService = null;
    private final org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/initialize_order"})
    public org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> initiOrderV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderRequestDto orderRequest) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it, org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v2/initialize_order"})
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.protocol.schemas.ProtocolAckResponse>> initializeOrderV2(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderRequestDto> orderRequest) {
        return null;
    }
    
    private void setLogging(org.beckn.protocol.schemas.ProtocolContext context, org.beckn.one.sandbox.bap.errors.HttpError error, org.beckn.protocol.schemas.ProtocolAckResponse protocolAckResponse) {
    }
    
    private org.beckn.protocol.schemas.ProtocolContext getContext(java.lang.String transactionId) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public InitOrderController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.init.services.InitOrderService initOrderService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService) {
        super();
    }
}