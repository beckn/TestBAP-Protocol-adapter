package org.beckn.one.sandbox.bap.auth.model;

import java.lang.System;

@lombok.AllArgsConstructor()
@lombok.Data()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lorg/beckn/one/sandbox/bap/auth/model/Credentials;", "", "type", "Lorg/beckn/one/sandbox/bap/auth/model/Credentials$CredentialType;", "decodedToken", "Lcom/google/firebase/auth/FirebaseToken;", "idToken", "", "session", "(Lorg/beckn/one/sandbox/bap/auth/model/Credentials$CredentialType;Lcom/google/firebase/auth/FirebaseToken;Ljava/lang/String;Ljava/lang/String;)V", "getDecodedToken", "()Lcom/google/firebase/auth/FirebaseToken;", "setDecodedToken", "(Lcom/google/firebase/auth/FirebaseToken;)V", "getIdToken", "()Ljava/lang/String;", "setIdToken", "(Ljava/lang/String;)V", "getSession", "setSession", "getType", "()Lorg/beckn/one/sandbox/bap/auth/model/Credentials$CredentialType;", "setType", "(Lorg/beckn/one/sandbox/bap/auth/model/Credentials$CredentialType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CredentialType", "sandbox_bap_client"})
public final class Credentials {
    @org.jetbrains.annotations.Nullable()
    private org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType type;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.auth.FirebaseToken decodedToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String idToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String session;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseToken getDecodedToken() {
        return null;
    }
    
    public final void setDecodedToken(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseToken p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdToken() {
        return null;
    }
    
    public final void setIdToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Credentials(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType type, @org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseToken decodedToken, @org.jetbrains.annotations.Nullable()
    java.lang.String idToken, @org.jetbrains.annotations.Nullable()
    java.lang.String session) {
        super();
    }
    
    public Credentials() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseToken component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.auth.model.Credentials copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.Credentials.CredentialType type, @org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseToken decodedToken, @org.jetbrains.annotations.Nullable()
    java.lang.String idToken, @org.jetbrains.annotations.Nullable()
    java.lang.String session) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/beckn/one/sandbox/bap/auth/model/Credentials$CredentialType;", "", "(Ljava/lang/String;I)V", "ID_TOKEN", "SESSION", "sandbox_bap_client"})
    public static enum CredentialType {
        /*public static final*/ ID_TOKEN /* = new ID_TOKEN() */,
        /*public static final*/ SESSION /* = new SESSION() */;
        
        CredentialType() {
        }
    }
}