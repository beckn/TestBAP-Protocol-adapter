package org.beckn.one.sandbox.bap.client.external.logging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u00d5\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020BH\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a\u00a8\u0006D"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingRequest;", "", "context_domain", "", "context_country", "context_city", "context_action", "context_core_version", "context_bap_id", "context_key", "context_bap_uri", "context_transaction_id", "context_message_id", "clock", "Ljava/time/Clock;", "context_timestamp", "context_ttl", "subscriber_type", "subscriber_id", "logged_at", "error_code", "error_message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Clock;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClock", "()Ljava/time/Clock;", "getContext_action", "()Ljava/lang/String;", "getContext_bap_id", "getContext_bap_uri", "getContext_city", "getContext_core_version", "getContext_country", "getContext_domain", "getContext_key", "getContext_message_id", "getContext_timestamp", "getContext_transaction_id", "getContext_ttl", "getError_code", "getError_message", "getLogged_at", "getSubscriber_id", "getSubscriber_type", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sandbox_bap_client"})
@com.fasterxml.jackson.annotation.JsonInclude(value = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public final class LoggingRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String context_domain = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String context_country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String context_city = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_action = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_core_version = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_bap_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_key = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_bap_uri = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String context_transaction_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String context_message_id = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final java.time.Clock clock = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_timestamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String context_ttl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subscriber_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subscriber_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String logged_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error_code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error_message = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext_domain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext_country() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext_city() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_action() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_core_version() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_bap_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_key() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_bap_uri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext_transaction_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext_message_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock getClock() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_timestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContext_ttl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriber_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriber_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogged_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError_message() {
        return null;
    }
    
    public LoggingRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String context_domain, @org.jetbrains.annotations.NotNull()
    java.lang.String context_country, @org.jetbrains.annotations.NotNull()
    java.lang.String context_city, @org.jetbrains.annotations.Nullable()
    java.lang.String context_action, @org.jetbrains.annotations.Nullable()
    java.lang.String context_core_version, @org.jetbrains.annotations.Nullable()
    java.lang.String context_bap_id, @org.jetbrains.annotations.Nullable()
    java.lang.String context_key, @org.jetbrains.annotations.Nullable()
    java.lang.String context_bap_uri, @org.jetbrains.annotations.NotNull()
    java.lang.String context_transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String context_message_id, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.Nullable()
    java.lang.String context_timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String context_ttl, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriber_type, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriber_id, @org.jetbrains.annotations.Nullable()
    java.lang.String logged_at, @org.jetbrains.annotations.Nullable()
    java.lang.String error_code, @org.jetbrains.annotations.Nullable()
    java.lang.String error_message) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.external.logging.LoggingRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String context_domain, @org.jetbrains.annotations.NotNull()
    java.lang.String context_country, @org.jetbrains.annotations.NotNull()
    java.lang.String context_city, @org.jetbrains.annotations.Nullable()
    java.lang.String context_action, @org.jetbrains.annotations.Nullable()
    java.lang.String context_core_version, @org.jetbrains.annotations.Nullable()
    java.lang.String context_bap_id, @org.jetbrains.annotations.Nullable()
    java.lang.String context_key, @org.jetbrains.annotations.Nullable()
    java.lang.String context_bap_uri, @org.jetbrains.annotations.NotNull()
    java.lang.String context_transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String context_message_id, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.Nullable()
    java.lang.String context_timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String context_ttl, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriber_type, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriber_id, @org.jetbrains.annotations.Nullable()
    java.lang.String logged_at, @org.jetbrains.annotations.Nullable()
    java.lang.String error_code, @org.jetbrains.annotations.Nullable()
    java.lang.String error_message) {
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