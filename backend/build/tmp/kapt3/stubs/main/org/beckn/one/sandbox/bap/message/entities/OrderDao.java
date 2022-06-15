package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0005\u00a2\u0006\u0002\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0091\u0002\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010bH\u00d6\u0003J\t\u0010c\u001a\u00020dH\u00d6\u0001J\t\u0010e\u001a\u00020\u0014H\u00d6\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\'R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00103\"\u0004\b6\u00107R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\'R\u0013\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\'R\u001c\u0010 \u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00103\"\u0004\b=\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00103\"\u0004\bF\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00103\"\u0004\bI\u00107\u00a8\u0006f"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OrderDao;", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "provider", "Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedProviderDao;", "items", "", "Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedItemsDao;", "addOns", "Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedAddOnsDao;", "offers", "Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedOffersDao;", "billing", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;", "fulfillment", "Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "quote", "Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;", "payment", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;", "id", "", "state", "createdAt", "Ljava/time/OffsetDateTime;", "updatedAt", "context", "Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "error", "Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "userId", "transactionId", "messageId", "parentOrderId", "ondcCancellation", "Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;", "ondcLinkedOrders", "Lorg/beckn/one/sandbox/bap/message/entities/OndcLinkedOrdersDao;", "(Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedProviderDao;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;Ljava/util/List;)V", "getAddOns", "()Ljava/util/List;", "getBilling", "()Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;", "getContext", "()Lorg/beckn/one/sandbox/bap/message/entities/ContextDao;", "getCreatedAt", "()Ljava/time/OffsetDateTime;", "getError", "()Lorg/beckn/one/sandbox/bap/message/entities/ErrorDao;", "getFulfillment", "()Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "getId", "()Ljava/lang/String;", "getItems", "getMessageId", "setMessageId", "(Ljava/lang/String;)V", "getOffers", "getOndcCancellation", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;", "getOndcLinkedOrders", "getParentOrderId", "setParentOrderId", "getPayment", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;", "getProvider", "()Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedProviderDao;", "getQuote", "()Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;", "getState", "getTransactionId", "setTransactionId", "getUpdatedAt", "getUserId", "setUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sandbox_bap_client"})
public final class OrderDao implements org.beckn.one.sandbox.bap.message.entities.BecknResponseDao {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao provider = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao> items = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao> addOns = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao> offers = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.BillingDao billing = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.QuotationDao quote = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao payment = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final org.beckn.one.sandbox.bap.message.entities.ContextDao context = null;
    @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final org.beckn.one.sandbox.bap.message.entities.ErrorDao error = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String transactionId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String messageId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String parentOrderId;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao ondcCancellation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> ondcLinkedOrders = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao> getAddOns() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao> getOffers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.BillingDao getBilling() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao getFulfillment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.QuotationDao getQuote() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao getPayment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
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
    @java.lang.Override()
    public org.beckn.one.sandbox.bap.message.entities.ContextDao getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.beckn.one.sandbox.bap.message.entities.ErrorDao getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    public void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTransactionId() {
        return null;
    }
    
    public final void setTransactionId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageId() {
        return null;
    }
    
    public final void setMessageId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParentOrderId() {
        return null;
    }
    
    public final void setParentOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao getOndcCancellation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> getOndcLinkedOrders() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OrderDao(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao provider, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao> items, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao> addOns, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao> offers, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.BillingDao billing, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.QuotationDao quote, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao payment, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime createdAt, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime updatedAt, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ContextDao context, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ErrorDao error, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    java.lang.String parentOrderId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao ondcCancellation, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> ondcLinkedOrders) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.BillingDao component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.QuotationDao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.ContextDao component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.ErrorDao component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.OrderDao copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao provider, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao> items, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao> addOns, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao> offers, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.BillingDao billing, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.QuotationDao quote, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao payment, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime createdAt, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime updatedAt, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ContextDao context, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.ErrorDao error, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId, @org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    java.lang.String parentOrderId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao ondcCancellation, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> ondcLinkedOrders) {
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