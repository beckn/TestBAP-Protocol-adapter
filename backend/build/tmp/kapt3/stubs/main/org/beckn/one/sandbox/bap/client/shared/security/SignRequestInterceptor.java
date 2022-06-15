package org.beckn.one.sandbox.bap.client.shared.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0012J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\rH\u0012J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/security/SignRequestInterceptor;", "Lokhttp3/Interceptor;", "b64PrivateKey", "", "uniqueKeyId", "subscriberId", "ttlInSeconds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "createAuthorization", "Lorg/beckn/one/sandbox/bap/client/shared/security/Authorization;", "request", "Lokhttp3/Request;", "getBodyContent", "Lokhttp3/RequestBody;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "sandbox_bap_client"})
@org.springframework.stereotype.Component()
public class SignRequestInterceptor implements okhttp3.Interceptor {
    private final java.lang.String b64PrivateKey = null;
    private final java.lang.String uniqueKeyId = null;
    private final java.lang.String subscriberId = null;
    private final java.lang.String ttlInSeconds = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private java.lang.String getBodyContent(okhttp3.RequestBody request) {
        return null;
    }
    
    private org.beckn.one.sandbox.bap.client.shared.security.Authorization createAuthorization(okhttp3.Request request) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public SignRequestInterceptor(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${security.self.private_key}")
    java.lang.String b64PrivateKey, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${security.self.unique_key_id}")
    java.lang.String uniqueKeyId, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.bap_id}")
    java.lang.String subscriberId, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${context.ttl_seconds}")
    java.lang.String ttlInSeconds) {
        super();
    }
}