package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a3\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u00a5\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020?H\u00d6\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u00a8\u0006@"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedDao;", "", "provider", "Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderDao;", "providerLocation", "Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderLocationDao;", "items", "", "Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedItemsDao;", "addOns", "Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedAddOnsDao;", "offers", "Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedOffersDao;", "billing", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;", "fulfillment", "Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "quote", "Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;", "payment", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;", "ondcCancellation", "Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;", "ondcLinkedOrders", "Lorg/beckn/one/sandbox/bap/message/entities/OndcLinkedOrdersDao;", "(Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderDao;Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderLocationDao;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;Ljava/util/List;)V", "getAddOns", "()Ljava/util/List;", "getBilling", "()Lorg/beckn/one/sandbox/bap/message/entities/BillingDao;", "getFulfillment", "()Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "getItems", "getOffers", "getOndcCancellation", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;", "getOndcLinkedOrders", "getPayment", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;", "getProvider", "()Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderDao;", "getProviderLocation", "()Lorg/beckn/one/sandbox/bap/message/entities/OnInitMessageInitializedProviderLocationDao;", "getQuote", "()Lorg/beckn/one/sandbox/bap/message/entities/QuotationDao;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sandbox_bap_client"})
public final class OnInitMessageInitializedDao {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderDao provider = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderLocationDao providerLocation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedItemsDao> items = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedAddOnsDao> addOns = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedOffersDao> offers = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.BillingDao billing = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.QuotationDao quote = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao payment = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao ondcCancellation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> ondcLinkedOrders = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderDao getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderLocationDao getProviderLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedItemsDao> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedAddOnsDao> getAddOns() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedOffersDao> getOffers() {
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
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao getOndcCancellation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> getOndcLinkedOrders() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OnInitMessageInitializedDao(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderDao provider, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderLocationDao providerLocation, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedItemsDao> items, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedAddOnsDao> addOns, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedOffersDao> offers, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.BillingDao billing, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.QuotationDao quote, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao payment, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao ondcCancellation, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> ondcLinkedOrders) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public OnInitMessageInitializedDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderDao component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderLocationDao component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedItemsDao> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedAddOnsDao> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedOffersDao> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.BillingDao component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.QuotationDao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedDao copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderDao provider, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedProviderLocationDao providerLocation, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedItemsDao> items, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedAddOnsDao> addOns, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.OnInitMessageInitializedOffersDao> offers, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.BillingDao billing, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentDao fulfillment, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.QuotationDao quote, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao payment, @org.jetbrains.annotations.Nullable()
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