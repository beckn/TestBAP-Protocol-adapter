package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyMultipleResponse;", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "message", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponseMessage;", "error", "", "Lorg/beckn/protocol/schemas/ProtocolError;", "(Lorg/beckn/protocol/schemas/ProtocolContext;Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponseMessage;Ljava/util/List;)V", "getContext", "()Lorg/beckn/protocol/schemas/ProtocolContext;", "getError", "()Ljava/util/List;", "setError", "(Ljava/util/List;)V", "getMessage", "()Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponseMessage;", "setMessage", "(Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponseMessage;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sandbox_bap_client"})
public final class ClientOrderPolicyMultipleResponse {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolContext context = null;
    @org.jetbrains.annotations.Nullable()
    private org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage message;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<org.beckn.protocol.schemas.ProtocolError> error;
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.protocol.schemas.ProtocolError> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.protocol.schemas.ProtocolError> p0) {
    }
    
    @org.beckn.protocol.schemas.Default()
    public ClientOrderPolicyMultipleResponse(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage message, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.protocol.schemas.ProtocolError> error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolContext component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.protocol.schemas.ProtocolError> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyMultipleResponse copy(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponseMessage message, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.protocol.schemas.ProtocolError> error) {
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