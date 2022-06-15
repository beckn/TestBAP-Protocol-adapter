package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressRequestDto;", "", "descriptor", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "gps", "", "default", "", "address", "Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "(Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;)V", "getAddress", "()Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescriptor", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getGps", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;)Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressRequestDto;", "equals", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class DeliveryAddressRequestDto {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String gps = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.AddressDao address = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGps() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao getAddress() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public DeliveryAddressRequestDto(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String gps, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean p2_772401952, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.AddressDao address) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public DeliveryAddressRequestDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressRequestDto copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.lang.String gps, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean p2_772401952, @org.jetbrains.annotations.Nullable()
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