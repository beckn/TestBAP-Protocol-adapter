package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jn\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d\u00a8\u00060"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressResponse;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "userId", "", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "id", "descriptor", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "gps", "defaultAddress", "", "address", "Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "(Lorg/beckn/protocol/schemas/ProtocolContext;Ljava/lang/String;Lorg/beckn/protocol/schemas/ProtocolError;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;)V", "getAddress", "()Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "getContext", "()Lorg/beckn/protocol/schemas/ProtocolContext;", "getDefaultAddress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescriptor", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getError", "()Lorg/beckn/protocol/schemas/ProtocolError;", "getGps", "()Ljava/lang/String;", "getId", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lorg/beckn/protocol/schemas/ProtocolContext;Ljava/lang/String;Lorg/beckn/protocol/schemas/ProtocolError;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;)Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressResponse;", "equals", "other", "", "hashCode", "", "toString", "sandbox_bap_client"})
public final class DeliveryAddressResponse implements org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.protocol.schemas.ProtocolContext context = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.protocol.schemas.ProtocolError error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String gps = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean defaultAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.AddressDao address = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.protocol.schemas.ProtocolContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.protocol.schemas.ProtocolError getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDefaultAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao getAddress() {
        return null;
    }
    
    public DeliveryAddressResponse(@org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolError error, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String gps, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean defaultAddress, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.AddressDao address) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolContext component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.protocol.schemas.ProtocolError component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse copy(@org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    org.beckn.protocol.schemas.ProtocolError error, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String gps, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean defaultAddress, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.AddressDao address) {
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