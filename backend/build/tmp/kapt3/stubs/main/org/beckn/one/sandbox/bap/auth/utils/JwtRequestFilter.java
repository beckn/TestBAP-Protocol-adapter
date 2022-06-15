package org.beckn.one.sandbox.bap.auth.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lorg/beckn/one/sandbox/bap/auth/utils/JwtRequestFilter;", "Lorg/springframework/web/filter/OncePerRequestFilter;", "()V", "securityProps", "Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;", "getSecurityProps", "()Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;", "setSecurityProps", "(Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;)V", "securityService", "Lorg/beckn/one/sandbox/bap/auth/service/SecurityService;", "getSecurityService", "()Lorg/beckn/one/sandbox/bap/auth/service/SecurityService;", "setSecurityService", "(Lorg/beckn/one/sandbox/bap/auth/service/SecurityService;)V", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "firebaseTokenToUserDto", "Lorg/beckn/one/sandbox/bap/auth/model/User;", "decodedToken", "Lcom/google/firebase/auth/FirebaseToken;", "verifyToken", "sandbox_bap_client"})
@org.springframework.stereotype.Component()
public class JwtRequestFilter extends org.springframework.web.filter.OncePerRequestFilter {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Autowired()
    private org.beckn.one.sandbox.bap.auth.service.SecurityService securityService;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Autowired()
    private org.beckn.one.sandbox.bap.auth.model.SecurityProperties securityProps;
    
    @org.jetbrains.annotations.Nullable()
    public org.beckn.one.sandbox.bap.auth.service.SecurityService getSecurityService() {
        return null;
    }
    
    public void setSecurityService(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.service.SecurityService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.beckn.one.sandbox.bap.auth.model.SecurityProperties getSecurityProps() {
        return null;
    }
    
    public void setSecurityProps(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.SecurityProperties p0) {
    }
    
    @java.lang.Override()
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain) {
    }
    
    public void verifyToken(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.beckn.one.sandbox.bap.auth.model.User firebaseTokenToUserDto(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseToken decodedToken) {
        return null;
    }
    
    public JwtRequestFilter() {
        super();
    }
}