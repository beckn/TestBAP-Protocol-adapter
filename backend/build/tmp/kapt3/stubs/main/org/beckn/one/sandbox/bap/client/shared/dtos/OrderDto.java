package org.beckn.one.sandbox.bap.client.shared.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderDto;", "", "id", "", "items", "", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderItemDto;", "deliveryInfo", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryDto;", "billingInfo", "Lorg/beckn/protocol/schemas/ProtocolBilling;", "payment", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderPayment;", "(Ljava/lang/String;Ljava/util/List;Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryDto;Lorg/beckn/protocol/schemas/ProtocolBilling;Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderPayment;)V", "getBillingInfo", "()Lorg/beckn/protocol/schemas/ProtocolBilling;", "getDeliveryInfo", "()Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryDto;", "getId", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getPayment", "()Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderPayment;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class OrderDto {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryDto deliveryInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.protocol.schemas.ProtocolBilling billingInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment payment = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryDto getDeliveryInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolBilling getBillingInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment getPayment() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OrderDto(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryDto deliveryInfo, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolBilling billingInfo, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment payment) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.protocol.schemas.ProtocolBilling component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.client.shared.dtos.OrderDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryDto deliveryInfo, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolBilling billingInfo, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment payment) {
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