package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006%"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OnConfirmDao;", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "context", "Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "transactionId", "", "messageId", "message", "Lorg/beckn/one/sandbox/bap/message/entities/OnConfirmMessageDao;", "error", "Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "userId", "(Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/OnConfirmMessageDao;Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;Ljava/lang/String;)V", "getContext", "()Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "getError", "()Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "getMessage", "()Lorg/beckn/one/sandbox/bap/message/entities/OnConfirmMessageDao;", "getMessageId", "()Ljava/lang/String;", "getTransactionId", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sandbox_bap_client"})
public final class OnConfirmDao implements org.beckn.one.sandbox.bap.message.entities.BecknResponseDao {
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final org.beckn.one.sandbox.bap.message.entities.ContextDao context = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String transactionId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String messageId = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao message = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final org.beckn.one.sandbox.bap.message.entities.ErrorDao error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.beckn.one.sandbox.bap.message.entities.ContextDao getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTransactionId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.one.sandbox.bap.message.entities.ErrorDao getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OnConfirmDao(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ContextDao context, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao message, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ErrorDao error, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ContextDao component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.ErrorDao component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.OnConfirmDao copy(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ContextDao context, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao message, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ErrorDao error, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
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