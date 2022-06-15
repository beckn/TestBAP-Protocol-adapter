package org.beckn.one.sandbox.bap.client.shared.errors.bpp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0007\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "()V", "autheticationError", "Lorg/beckn/protocol/schemas/ProtocolError;", "getAutheticationError", "()Lorg/beckn/protocol/schemas/ProtocolError;", "badRequestError", "getBadRequestError", "bppError", "getBppError", "bppIdNotPresent", "getBppIdNotPresent", "nackError", "getNackError", "nullError", "getNullError", "pendingPaymentError", "getPendingPaymentError", "AuthenticationError", "BadRequestError", "BppIdNotPresent", "Internal", "Nack", "NullResponse", "PendingPayment", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$Internal;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$Nack;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$NullResponse;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$PendingPayment;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$BppIdNotPresent;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$AuthenticationError;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$BadRequestError;", "sandbox_bap_client"})
public abstract class BppError implements org.beckn.one.sandbox.bap.errors.HttpError {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError bppError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError nullError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError nackError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError pendingPaymentError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError bppIdNotPresent = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError autheticationError = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolError badRequestError = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getBppError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getNullError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getNackError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getPendingPaymentError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getBppIdNotPresent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getAutheticationError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolError getBadRequestError() {
        return null;
    }
    
    private BppError() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$Internal;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class Internal extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.Internal INSTANCE = null;
        
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$Nack;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class Nack extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.Nack INSTANCE = null;
        
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
        
        private Nack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$NullResponse;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class NullResponse extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.NullResponse INSTANCE = null;
        
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
        
        private NullResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$PendingPayment;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class PendingPayment extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.PendingPayment INSTANCE = null;
        
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
        
        private PendingPayment() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$BppIdNotPresent;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class BppIdNotPresent extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.BppIdNotPresent INSTANCE = null;
        
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
        
        private BppIdNotPresent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$AuthenticationError;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class AuthenticationError extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.AuthenticationError INSTANCE = null;
        
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
        
        private AuthenticationError() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError$BadRequestError;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "()V", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
    public static final class BadRequestError extends org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError {
        @org.jetbrains.annotations.NotNull()
        public static final org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError.BadRequestError INSTANCE = null;
        
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
        
        private BadRequestError() {
            super();
        }
    }
}