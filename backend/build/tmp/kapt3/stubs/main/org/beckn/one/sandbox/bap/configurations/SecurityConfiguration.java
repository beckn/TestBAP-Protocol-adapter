package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u001cH\u0017R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/SecurityConfiguration;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getObjectMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "setObjectMapper", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "restSecProps", "Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;", "getRestSecProps", "()Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;", "setRestSecProps", "(Lorg/beckn/one/sandbox/bap/auth/model/SecurityProperties;)V", "tokenAuthenticationFilter", "Lorg/beckn/one/sandbox/bap/auth/utils/JwtRequestFilter;", "getTokenAuthenticationFilter", "()Lorg/beckn/one/sandbox/bap/auth/utils/JwtRequestFilter;", "setTokenAuthenticationFilter", "(Lorg/beckn/one/sandbox/bap/auth/utils/JwtRequestFilter;)V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "restAuthenticationEntryPoint", "Lorg/springframework/security/web/AuthenticationEntryPoint;", "sandbox_bap_client"})
@org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.context.annotation.Configuration()
public class SecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Autowired()
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Autowired()
    private org.beckn.one.sandbox.bap.auth.model.SecurityProperties restSecProps;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Autowired()
    private org.beckn.one.sandbox.bap.auth.utils.JwtRequestFilter tokenAuthenticationFilter;
    
    @org.jetbrains.annotations.Nullable()
    public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper() {
        return null;
    }
    
    public void setObjectMapper(@org.jetbrains.annotations.Nullable()
    com.fasterxml.jackson.databind.ObjectMapper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.beckn.one.sandbox.bap.auth.model.SecurityProperties getRestSecProps() {
        return null;
    }
    
    public void setRestSecProps(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.SecurityProperties p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.beckn.one.sandbox.bap.auth.utils.JwtRequestFilter getTokenAuthenticationFilter() {
        return null;
    }
    
    public void setTokenAuthenticationFilter(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.utils.JwtRequestFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.web.AuthenticationEntryPoint restAuthenticationEntryPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    }
    
    public SecurityConfiguration() {
        super();
    }
}