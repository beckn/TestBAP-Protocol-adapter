package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001@B\u009f\u0001\b\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\r\u0010*\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0011H\u00c6\u0003J\t\u0010.\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00af\u0001\u00109\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020>H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a\u00a8\u0006A"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "", "domain", "", "Lorg/beckn/one/sandbox/bap/message/entities/Domain;", "country", "city", "action", "Lorg/beckn/one/sandbox/bap/message/entities/ContextDao$Action;", "coreVersion", "bapId", "bapUri", "bppId", "bppUri", "transactionId", "messageId", "clock", "Ljava/time/Clock;", "timestamp", "Ljava/time/OffsetDateTime;", "key", "ttl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/ContextDao$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Clock;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Lorg/beckn/one/sandbox/bap/message/entities/ContextDao$Action;", "getBapId", "()Ljava/lang/String;", "getBapUri", "getBppId", "getBppUri", "getCity", "getClock", "()Ljava/time/Clock;", "getCoreVersion", "getCountry", "getDomain", "getKey", "getMessageId", "getTimestamp", "()Ljava/time/OffsetDateTime;", "getTransactionId", "getTtl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "sandbox_bap_client"})
public final class ContextDao {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String domain = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.entities.ContextDao.Action action = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coreVersion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bapId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bapUri = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bppId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bppUri = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String messageId = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final java.time.Clock clock = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime timestamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String key = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ttl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ContextDao.Action getAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoreVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBapId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBapUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBppId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBppUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock getClock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTtl() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public ContextDao(@org.jetbrains.annotations.NotNull()
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ContextDao.Action action, @org.jetbrains.annotations.NotNull()
    java.lang.String coreVersion, @org.jetbrains.annotations.Nullable()
    java.lang.String bapId, @org.jetbrains.annotations.Nullable()
    java.lang.String bapUri, @org.jetbrains.annotations.Nullable()
    java.lang.String bppId, @org.jetbrains.annotations.Nullable()
    java.lang.String bppUri, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String ttl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ContextDao.Action component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ContextDao copy(@org.jetbrains.annotations.NotNull()
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ContextDao.Action action, @org.jetbrains.annotations.NotNull()
    java.lang.String coreVersion, @org.jetbrains.annotations.Nullable()
    java.lang.String bapId, @org.jetbrains.annotations.Nullable()
    java.lang.String bapUri, @org.jetbrains.annotations.Nullable()
    java.lang.String bppId, @org.jetbrains.annotations.Nullable()
    java.lang.String bppUri, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String ttl) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/ContextDao$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SEARCH", "SELECT", "INIT", "CONFIRM", "UPDATE", "STATUS", "TRACK", "CANCEL", "RATING", "SUPPORT", "ON_SEARCH", "ON_SELECT", "ON_INIT", "ON_CONFIRM", "ON_UPDATE", "ON_STATUS", "ON_TRACK", "ON_CANCEL", "ON_RATING", "ON_SUPPORT", "sandbox_bap_client"})
    public static enum Action {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "search")
        /*public static final*/ SEARCH /* = new SEARCH(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "select")
        /*public static final*/ SELECT /* = new SELECT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "init")
        /*public static final*/ INIT /* = new INIT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "confirm")
        /*public static final*/ CONFIRM /* = new CONFIRM(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "update")
        /*public static final*/ UPDATE /* = new UPDATE(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "status")
        /*public static final*/ STATUS /* = new STATUS(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "track")
        /*public static final*/ TRACK /* = new TRACK(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "cancel")
        /*public static final*/ CANCEL /* = new CANCEL(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "rating")
        /*public static final*/ RATING /* = new RATING(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "support")
        /*public static final*/ SUPPORT /* = new SUPPORT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_search")
        /*public static final*/ ON_SEARCH /* = new ON_SEARCH(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_select")
        /*public static final*/ ON_SELECT /* = new ON_SELECT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_init")
        /*public static final*/ ON_INIT /* = new ON_INIT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_confirm")
        /*public static final*/ ON_CONFIRM /* = new ON_CONFIRM(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_update")
        /*public static final*/ ON_UPDATE /* = new ON_UPDATE(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_status")
        /*public static final*/ ON_STATUS /* = new ON_STATUS(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_track")
        /*public static final*/ ON_TRACK /* = new ON_TRACK(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_cancel")
        /*public static final*/ ON_CANCEL /* = new ON_CANCEL(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_rating")
        /*public static final*/ ON_RATING /* = new ON_RATING(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "on_support")
        /*public static final*/ ON_SUPPORT /* = new ON_SUPPORT(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Action(java.lang.String value) {
        }
    }
}