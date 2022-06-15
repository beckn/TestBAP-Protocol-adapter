package org.beckn.one.sandbox.bap.client.support.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/support/mappers/SupportClientResponseMapper;", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollMapper;", "Lorg/beckn/protocol/schemas/ProtocolOnSupport;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientSupportResponse;", "()V", "transform", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "input", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "sandbox_bap_client"})
public final class SupportClientResponseMapper implements org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollMapper<org.beckn.protocol.schemas.ProtocolOnSupport, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSupportResponse> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSupportResponse> transform(@org.jetbrains.annotations.NotNull()
    java.util.List<org.beckn.protocol.schemas.ProtocolOnSupport> input, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    public SupportClientResponseMapper() {
        super();
    }
}