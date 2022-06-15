package org.beckn.one.sandbox.bap.client.shared.errors.registry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\u000b\f\u00a8\u0006\r"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "()V", "noSubscribersFoundError", "Lorg/beckn/protocol/schemas/ProtocolError;", "getNoSubscribersFoundError", "()Lorg/beckn/protocol/schemas/ProtocolError;", "registryError", "getRegistryError", "Internal", "NoSubscriberFound", "Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError$Internal;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError$NoSubscriberFound;", "sandbox_bap_client"})
public abstract class RegistryLookupError implements org.beckn.one.sandbox.bap.errors.HttpError {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError registryError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError noSubscribersFoundError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getRegistryError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getNoSubscribersFoundError() {
        return null;
    }
    
    private RegistryLookupError() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError$Internal;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class Internal extends org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError.Internal INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.springframework.http.HttpStatus status() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.beckn.protocol.schemas.ResponseMessage message() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.beckn.protocol.schemas.ProtocolError error() {
            return null;
        }
        
        private Internal() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError$NoSubscriberFound;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/registry/RegistryLookupError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class NoSubscriberFound extends org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.registry.RegistryLookupError.NoSubscriberFound INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.springframework.http.HttpStatus status() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.beckn.protocol.schemas.ResponseMessage message() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.beckn.protocol.schemas.ProtocolError error() {
            return null;
        }
        
        private NoSubscriberFound() {
            super();
        }
    }
}