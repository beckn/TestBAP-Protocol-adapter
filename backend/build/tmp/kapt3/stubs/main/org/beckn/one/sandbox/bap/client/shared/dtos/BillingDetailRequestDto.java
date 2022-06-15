package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006-"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/BillingDetailRequestDto;", "", "name", "", "phone", "organization", "Lorg/beckn/one/sandbox/bap/message/entities/OrganizationDao;", "address", "Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "email", "taxNumber", "createdAt", "Ljava/time/OffsetDateTime;", "updatedAt", "locationId", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/OrganizationDao;Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "getAddress", "()Lorg/beckn/one/sandbox/bap/message/entities/AddressDao;", "getCreatedAt", "()Ljava/time/OffsetDateTime;", "getEmail", "()Ljava/lang/String;", "getLocationId", "getName", "getOrganization", "()Lorg/beckn/one/sandbox/bap/message/entities/OrganizationDao;", "getPhone", "getTaxNumber", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class BillingDetailRequestDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OrganizationDao organization = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.AddressDao address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String taxNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String locationId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OrganizationDao getOrganization() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaxNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationId() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public BillingDetailRequestDto(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OrganizationDao organization, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.AddressDao address, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String taxNumber, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime createdAt, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String locationId) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OrganizationDao component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.AddressDao component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailRequestDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OrganizationDao organization, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.AddressDao address, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String taxNumber, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime createdAt, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String locationId) {
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