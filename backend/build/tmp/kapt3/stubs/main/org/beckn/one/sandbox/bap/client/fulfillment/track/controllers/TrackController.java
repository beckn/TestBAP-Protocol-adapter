package org.beckn.one.sandbox.bap.client.fulfillment.track.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0012J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0017J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001b0\u00102\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/fulfillment/track/controllers/TrackController;", "", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "trackService", "Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/TrackService;", "(Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/TrackService;)V", "getContextFactory", "()Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getTrackService", "()Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/TrackService;", "mapToErrorResponse", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "track", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/TrackRequestDto;", "trackV2", "", "trackRequestList", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class TrackController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.fulfillment.track.services.TrackService trackService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v1/track"})
    public org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> track(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.TrackRequestDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v2/track"})
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.protocol.schemas.ProtocolAckResponse>> trackV2(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.TrackRequestDto> trackRequestList) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it, org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.factories.ContextFactory getContextFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.fulfillment.track.services.TrackService getTrackService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public TrackController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.fulfillment.track.services.TrackService trackService) {
        super();
    }
}