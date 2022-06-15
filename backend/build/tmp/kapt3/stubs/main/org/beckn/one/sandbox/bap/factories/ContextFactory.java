package org.beckn.one.sandbox.bap.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ4\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "", "domain", "", "city", "country", "bapId", "bapUrl", "uuidFactory", "Lorg/beckn/one/sandbox/bap/factories/UuidFactory;", "clock", "Ljava/time/Clock;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/factories/UuidFactory;Ljava/time/Clock;)V", "create", "Lorg/beckn/protocol/schemas/ProtocolContext;", "transactionId", "messageId", "action", "Lorg/beckn/protocol/schemas/ProtocolContext$Action;", "bppId", "sandbox_bap_client"})
@org.springframework.stereotype.Component()
public class ContextFactory {
    private final java.lang.String domain = null;
    private final java.lang.String city = null;
    private final java.lang.String country = null;
    private final java.lang.String bapId = null;
    private final java.lang.String bapUrl = null;
    private final org.beckn.one.sandbox.bap.factories.UuidFactory uuidFactory = null;
    private final java.time.Clock clock = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.protocol.schemas.ProtocolContext create(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext.Action action, @org.jetbrains.annotations.Nullable()
    java.lang.String bppId) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ContextFactory(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.domain}")
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.city}")
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.country}")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.bap_id}")
    java.lang.String bapId, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.bap_uri}")
    java.lang.String bapUrl, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.UuidFactory uuidFactory, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock) {
        super();
    }
}