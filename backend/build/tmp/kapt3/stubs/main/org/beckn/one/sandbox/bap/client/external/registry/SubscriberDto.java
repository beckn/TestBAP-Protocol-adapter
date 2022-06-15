package org.beckn.one.sandbox.bap.client.external.registry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002>?B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000fH\u00c6\u0003J\t\u0010+\u001a\u00020\u0011H\u00c6\u0003J\t\u0010,\u001a\u00020\u0011H\u00c6\u0003J\t\u0010-\u001a\u00020\u0011H\u00c6\u0003J\t\u0010.\u001a\u00020\u0011H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\rH\u00c6\u0003J\u009b\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001c\u00a8\u0006@"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto;", "", "subscriber_id", "", "subscriber_url", "type", "Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Type;", "domain", "city", "country", "signing_public_key", "encr_public_key", "status", "Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Status;", "clock", "Ljava/time/Clock;", "valid_from", "Ljava/time/OffsetDateTime;", "valid_until", "created", "updated", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Status;Ljava/time/Clock;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "getCity", "()Ljava/lang/String;", "getClock", "()Ljava/time/Clock;", "getCountry", "getCreated", "()Ljava/time/OffsetDateTime;", "getDomain", "getEncr_public_key", "getSigning_public_key", "getStatus", "()Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Status;", "getSubscriber_id", "getSubscriber_url", "getType", "()Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Type;", "getUpdated", "getValid_from", "getValid_until", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "Type", "sandbox_bap_client"})
public final class SubscriberDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subscriber_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subscriber_url = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Type type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String domain = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signing_public_key = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String encr_public_key = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Status status = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final java.time.Clock clock = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime valid_from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime valid_until = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.OffsetDateTime updated = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriber_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriber_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSigning_public_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncr_public_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock getClock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getValid_from() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getValid_until() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime getUpdated() {
        return null;
    }
    
    public SubscriberDto(@org.jetbrains.annotations.NotNull()
    java.lang.String subscriber_id, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriber_url, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.String domain, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String signing_public_key, @org.jetbrains.annotations.NotNull()
    java.lang.String encr_public_key, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Status status, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime valid_from, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime valid_until, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime created, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime updated) {
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
    public final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Type component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Status component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.OffsetDateTime component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String subscriber_id, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriber_url, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.String domain, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String signing_public_key, @org.jetbrains.annotations.NotNull()
    java.lang.String encr_public_key, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.registry.SubscriberDto.Status status, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime valid_from, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime valid_until, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime created, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime updated) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Type;", "", "(Ljava/lang/String;I)V", "BAP", "BPP", "BG", "LREG", "CREG", "RREG", "sandbox_bap_client"})
    public static enum Type {
        /*public static final*/ BAP /* = new BAP() */,
        /*public static final*/ BPP /* = new BPP() */,
        /*public static final*/ BG /* = new BG() */,
        /*public static final*/ LREG /* = new LREG() */,
        /*public static final*/ CREG /* = new CREG() */,
        /*public static final*/ RREG /* = new RREG() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/registry/SubscriberDto$Status;", "", "(Ljava/lang/String;I)V", "INITIATED", "UNDER_SUBSCRIPTION", "SUBSCRIBED", "EXPIRED", "UNSUBSCRIBED", "INVALID_SSL", "sandbox_bap_client"})
    public static enum Status {
        /*public static final*/ INITIATED /* = new INITIATED() */,
        /*public static final*/ UNDER_SUBSCRIPTION /* = new UNDER_SUBSCRIPTION() */,
        /*public static final*/ SUBSCRIBED /* = new SUBSCRIBED() */,
        /*public static final*/ EXPIRED /* = new EXPIRED() */,
        /*public static final*/ UNSUBSCRIBED /* = new UNSUBSCRIBED() */,
        /*public static final*/ INVALID_SSL /* = new INVALID_SSL() */;
        
        Status() {
        }
    }
}