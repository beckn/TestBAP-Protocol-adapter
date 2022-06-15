package org.beckn.one.sandbox.bap.client.shared.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B1\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ4\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/controllers/AbstractOnPollController;", "Protocol", "Lorg/beckn/protocol/schemas/ProtocolResponse;", "Output", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "", "onPollService", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;)V", "log", "Lorg/slf4j/Logger;", "onPoll", "Lorg/springframework/http/ResponseEntity;", "messageId", "", "call", "Lretrofit2/Call;", "", "action", "Lorg/beckn/protocol/schemas/ProtocolContext$Action;", "sandbox_bap_client"})
public class AbstractOnPollController<Protocol extends org.beckn.protocol.schemas.ProtocolResponse, Output extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<Protocol, Output> onPollService = null;
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    private final org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.http.ResponseEntity<? extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> onPoll(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    retrofit2.Call<java.util.List<Protocol>> call, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext.Action action) {
        return null;
    }
    
    public AbstractOnPollController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService<Protocol, Output> onPollService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService) {
        super();
    }
}