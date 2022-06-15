package org.beckn.one.sandbox.bap.client.order.confirm.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\b\u0007\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J6\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \"*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!0!0 2\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0012J\u001a\u0010\'\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0 2\b\b\u0001\u0010)\u001a\u00020*H\u0017J \u0010+\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020(0!0 2\b\b\u0001\u0010,\u001a\u00020*H\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006-"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/confirm/controllers/OnConfirmOrderController;", "Lorg/beckn/one/sandbox/bap/client/shared/controllers/AbstractOnPollController;", "Lorg/beckn/protocol/schemas/ProtocolOnConfirm;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientConfirmResponse;", "onPollService", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "protocolClient", "Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "mapping", "Lorg/beckn/one/sandbox/bap/message/mappers/OnOrderProtocolToEntityOrder;", "onConfirmOrderService", "Lorg/beckn/one/sandbox/bap/client/order/confirm/services/OnConfirmOrderService;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;Lorg/beckn/one/sandbox/bap/message/mappers/OnOrderProtocolToEntityOrder;Lorg/beckn/one/sandbox/bap/client/order/confirm/services/OnConfirmOrderService;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;)V", "getContextFactory", "()Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getMapping", "()Lorg/beckn/one/sandbox/bap/message/mappers/OnOrderProtocolToEntityOrder;", "getOnConfirmOrderService", "()Lorg/beckn/one/sandbox/bap/client/order/confirm/services/OnConfirmOrderService;", "getProtocolClient", "()Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "mapToErrorResponse", "Lorg/springframework/http/ResponseEntity;", "", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "onConfirmOrderV1", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "messageId", "", "onConfirmOrderV2", "messageIds", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class OnConfirmOrderController extends org.beckn.one.sandbox.bap.client.shared.controllers.AbstractOnPollController<org.beckn.protocol.schemas.ProtocolOnConfirm, org.beckn.one.sandbox.bap.client.shared.dtos.ClientConfirmResponse> {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.mappers.OnOrderProtocolToEntityOrder mapping = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.order.confirm.services.OnConfirmOrderService onConfirmOrderService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v1/on_confirm_order"})
    public org.springframework.http.ResponseEntity<? extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> onConfirmOrderV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String messageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v2/on_confirm_order"})
    public org.springframework.http.ResponseEntity<? extends java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse>> onConfirmOrderV2(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String messageIds) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.ClientConfirmResponse>> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it, org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.factories.ContextFactory getContextFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient getProtocolClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.message.mappers.OnOrderProtocolToEntityOrder getMapping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.order.confirm.services.OnConfirmOrderService getOnConfirmOrderService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnConfirmOrderController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<org.beckn.protocol.schemas.ProtocolOnConfirm, org.beckn.one.sandbox.bap.client.shared.dtos.ClientConfirmResponse> onPollService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient protocolClient, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.mappers.OnOrderProtocolToEntityOrder mapping, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.confirm.services.OnConfirmOrderService onConfirmOrderService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService) {
        super(null, null, null, null);
    }
}