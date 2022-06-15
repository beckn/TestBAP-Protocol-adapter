package org.beckn.one.sandbox.bap.client.support.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00102\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0017J&\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00110\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/support/controllers/SupportController;", "", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "supportService", "Lorg/beckn/one/sandbox/bap/client/support/services/SupportService;", "(Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/support/services/SupportService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getContext", "Lorg/beckn/protocol/schemas/ProtocolContext;", "transactionId", "", "getSupportV1", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "supportRequest", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/SupportRequestDto;", "getSupportV2", "", "supportRequestList", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "context", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class SupportController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    private final org.beckn.one.sandbox.bap.client.support.services.SupportService supportService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/get_support"})
    public org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> getSupportV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.SupportRequestDto supportRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v2/get_support"})
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.protocol.schemas.ProtocolAckResponse>> getSupportV2(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.SupportRequestDto> supportRequestList) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it, org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    private org.beckn.protocol.schemas.ProtocolContext getContext(java.lang.String transactionId) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public SupportController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.support.services.SupportService supportService) {
        super();
    }
}