package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "getContext", "()Lorg/beckn/protocol/schemas/ProtocolContext;", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "getError", "()Lorg/beckn/protocol/schemas/ProtocolError;", "sandbox_bap_client"})
public abstract interface ClientResponse {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.beckn.protocol.schemas.ProtocolContext getContext();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.beckn.protocol.schemas.ProtocolError getError();
}