package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientConfirmResponse;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "message", "Lorg/beckn/protocol/schemas/ProtocolOnConfirmMessage;", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "parentOrderId", "", "(Lorg/beckn/protocol/schemas/ProtocolContext;Lorg/beckn/protocol/schemas/ProtocolOnConfirmMessage;Lorg/beckn/protocol/schemas/ProtocolError;Ljava/lang/String;)V", "getContext", "()Lorg/beckn/protocol/schemas/ProtocolContext;", "getError", "()Lorg/beckn/protocol/schemas/ProtocolError;", "getMessage", "()Lorg/beckn/protocol/schemas/ProtocolOnConfirmMessage;", "getParentOrderId", "()Ljava/lang/String;", "setParentOrderId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sandbox_bap_client"})
public final class ClientConfirmResponse implements org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.protocol.schemas.ProtocolContext context = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.protocol.schemas.ProtocolOnConfirmMessage message = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.protocol.schemas.ProtocolError error = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String parentOrderId;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.protocol.schemas.ProtocolContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolOnConfirmMessage getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.protocol.schemas.ProtocolError getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParentOrderId() {
        return null;
    }
    
    public final void setParentOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ClientConfirmResponse(@org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolOnConfirmMessage message, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolError error, @org.jetbrains.annotations.Nullable()
    java.lang.String parentOrderId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolContext component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolOnConfirmMessage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolError component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.ClientConfirmResponse copy(@org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolOnConfirmMessage message, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolError error, @org.jetbrains.annotations.Nullable()
    java.lang.String parentOrderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}