package org.beckn.one.sandbox.bap.client.shared.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u00020\u0005J*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollMapper;", "Protocol", "Lorg/beckn/protocol/schemas/ProtocolResponse;", "Output", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "", "transform", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "input", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "sandbox_bap_client"})
public abstract interface GenericOnPollMapper<Protocol extends org.beckn.protocol.schemas.ProtocolResponse, Output extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, Output> transform(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Protocol> input, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context);
}