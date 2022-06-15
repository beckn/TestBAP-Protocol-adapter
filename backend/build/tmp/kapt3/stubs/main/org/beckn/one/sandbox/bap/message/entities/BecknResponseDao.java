package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "", "context", "Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "getContext", "()Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "error", "Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "getError", "()Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "userId", "", "getUserId", "()Ljava/lang/String;", "sandbox_bap_client"})
public abstract interface BecknResponseDao {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.beckn.one.sandbox.bap.message.entities.ContextDao getContext();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.beckn.one.sandbox.bap.message.entities.ErrorDao getError();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUserId();
}