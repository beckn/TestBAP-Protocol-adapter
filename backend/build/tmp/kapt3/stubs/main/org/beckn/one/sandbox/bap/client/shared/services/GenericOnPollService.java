package org.beckn.one.sandbox.bap.client.shared.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\'\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\u0002\u0010\nJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u0015H\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollService;", "Protocol", "Lorg/beckn/protocol/schemas/ProtocolResponse;", "Output", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "", "protocolService", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericProtocolClientService;", "transformer", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollMapper;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/GenericProtocolClientService;Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollMapper;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "onPoll", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "call", "Lretrofit2/Call;", "", "sandbox_bap_client"})
public class GenericOnPollService<Protocol extends org.beckn.protocol.schemas.ProtocolResponse, Output extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.GenericProtocolClientService<Protocol> protocolService = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollMapper<Protocol, Output> transformer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, Output> onPoll(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    retrofit2.Call<java.util.List<Protocol>> call) {
        return null;
    }
    
    public GenericOnPollService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericProtocolClientService<Protocol> protocolService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollMapper<? super Protocol, ? extends Output> transformer) {
        super();
    }
}