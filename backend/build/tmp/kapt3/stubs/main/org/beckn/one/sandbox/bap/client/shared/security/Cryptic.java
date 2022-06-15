package org.beckn.one.sandbox.bap.client.shared.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J&\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/security/Cryptic;", "", "()V", "log", "Lorg/slf4j/Logger;", "blakeHash", "", "requestBody", "formatBodyForSigning", "created", "", "expires", "getEd25519SignerForSigning", "Lorg/bouncycastle/crypto/Signer;", "b64PrivateKey", "getEd25519SignerForVerification", "b64PublicKey", "sign", "verify", "", "authorization", "Lorg/beckn/one/sandbox/bap/client/shared/security/Authorization;", "sandbox_bap_client"})
public final class Cryptic {
    private static final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.beckn.one.sandbox.bap.client.shared.security.Cryptic INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sign(@org.jetbrains.annotations.NotNull()
    java.lang.String b64PrivateKey, @org.jetbrains.annotations.NotNull()
    java.lang.String requestBody, long created, long expires) {
        return null;
    }
    
    public final boolean verify(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.security.Authorization authorization, @org.jetbrains.annotations.NotNull()
    java.lang.String b64PublicKey, @org.jetbrains.annotations.NotNull()
    java.lang.String requestBody) {
        return false;
    }
    
    private final org.bouncycastle.crypto.Signer getEd25519SignerForVerification(java.lang.String b64PublicKey) {
        return null;
    }
    
    private final org.bouncycastle.crypto.Signer getEd25519SignerForSigning(java.lang.String b64PrivateKey) {
        return null;
    }
    
    private final java.lang.String formatBodyForSigning(long created, long expires, java.lang.String requestBody) {
        return null;
    }
    
    private final java.lang.String blakeHash(java.lang.String requestBody) {
        return null;
    }
    
    private Cryptic() {
        super();
    }
}