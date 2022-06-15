package org.beckn.one.sandbox.bap.client.shared.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0006\u0010+\u001a\u00020\'J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR-\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\r\u00a8\u0006."}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/security/Authorization;", "", "keyId", "", "algorithm", "created", "", "expires", "headers", "signature", "Accept", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccept", "()Ljava/lang/String;", "getAlgorithm", "getCreated", "()J", "getExpires", "headerString", "getHeaderString", "headerString$delegate", "Lkotlin/Lazy;", "getHeaders", "getKeyId", "parseKey", "Lkotlin/Triple;", "getParseKey", "()Lkotlin/Triple;", "parseKey$delegate", "getSignature", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "isNotExpired", "toString", "Companion", "sandbox_bap_client"})
public final class Authorization {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy headerString$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy parseKey$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String keyId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String algorithm = null;
    private final long created = 0L;
    private final long expires = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String headers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signature = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Accept = null;
    private static final java.lang.String KEY_ID = "keyId";
    private static final java.lang.String ALGORITHM = "algorithm";
    private static final java.lang.String CREATED = "created";
    private static final java.lang.String EXPIRES = "expires";
    private static final java.lang.String HEADERS = "headers";
    private static final java.lang.String SIGNATURE = "signature";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT = "accept";
    private static final java.lang.String ED25519 = "ed25519";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_NAME = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final org.beckn.one.sandbox.bap.client.shared.security.Authorization.Companion Companion = null;
    
    public final boolean isNotExpired() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeaderString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Triple<java.lang.String, java.lang.String, java.lang.String> getParseKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlgorithm() {
        return null;
    }
    
    public final long getCreated() {
        return 0L;
    }
    
    public final long getExpires() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignature() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccept() {
        return null;
    }
    
    public Authorization(@org.jetbrains.annotations.NotNull()
    java.lang.String keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String algorithm, long created, long expires, @org.jetbrains.annotations.NotNull()
    java.lang.String headers, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Accept) {
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
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.security.Authorization copy(@org.jetbrains.annotations.NotNull()
    java.lang.String keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String algorithm, long created, long expires, @org.jetbrains.annotations.NotNull()
    java.lang.String headers, @org.jetbrains.annotations.NotNull()
    java.lang.String signature, @org.jetbrains.annotations.NotNull()
    java.lang.String Accept) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/security/Authorization$Companion;", "", "()V", "ACCEPT", "", "ALGORITHM", "CREATED", "ED25519", "EXPIRES", "HEADERS", "HEADER_NAME", "KEY_ID", "SIGNATURE", "create", "Lorg/beckn/one/sandbox/bap/client/shared/security/Authorization;", "subscriberId", "uniqueKeyId", "signature", "created", "", "expires", "parse", "auth", "sandbox_bap_client"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final org.beckn.one.sandbox.bap.client.shared.security.Authorization parse(@org.jetbrains.annotations.Nullable()
        java.lang.String auth) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.beckn.one.sandbox.bap.client.shared.security.Authorization create(@org.jetbrains.annotations.NotNull()
        java.lang.String subscriberId, @org.jetbrains.annotations.NotNull()
        java.lang.String uniqueKeyId, @org.jetbrains.annotations.NotNull()
        java.lang.String signature, long created, long expires) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}