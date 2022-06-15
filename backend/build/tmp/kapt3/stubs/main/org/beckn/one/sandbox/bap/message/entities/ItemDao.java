package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00f7\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010>\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010?\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u0010C\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010L\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u00fe\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00c6\u0001\u00a2\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Q\u001a\u00020RH\u00d6\u0001J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b\'\u0010%R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b+\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b4\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\b5\u0010%R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109\u00a8\u0006T"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/ItemDao;", "", "id", "", "parentItemId", "descriptor", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "price", "Lorg/beckn/one/sandbox/bap/message/entities/PriceDao;", "categoryId", "locationId", "time", "Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;", "matched", "", "related", "recommended", "tags", "", "ondcReturnable", "ondcCancellable", "ondcSellerPickupReturn", "ondcReturnWindow", "ondcTimeToShip", "ondcAvailableOnCod", "ondcStatutoryPackagedCommodities", "Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;", "ondcStatutoryPackagedFood", "Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Lorg/beckn/one/sandbox/bap/message/entities/PriceDao;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;)V", "getCategoryId", "()Ljava/lang/String;", "getDescriptor", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getId", "getLocationId", "getMatched", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOndcAvailableOnCod", "getOndcCancellable", "getOndcReturnWindow", "getOndcReturnable", "getOndcSellerPickupReturn", "getOndcStatutoryPackagedCommodities", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;", "getOndcStatutoryPackagedFood", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;", "getOndcTimeToShip", "getParentItemId", "getPrice", "()Lorg/beckn/one/sandbox/bap/message/entities/PriceDao;", "getRecommended", "getRelated", "getTags", "()Ljava/util/Map;", "getTime", "()Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Lorg/beckn/one/sandbox/bap/message/entities/PriceDao;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;)Lorg/beckn/one/sandbox/bap/message/entities/ItemDao;", "equals", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class ItemDao {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String parentItemId = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PriceDao price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String categoryId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String locationId = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.TimeDao time = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean matched = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean related = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean recommended = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean ondcReturnable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean ondcCancellable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean ondcSellerPickupReturn = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcReturnWindow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcTimeToShip = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean ondcAvailableOnCod = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFood = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParentItemId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PriceDao getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.TimeDao getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getMatched() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRelated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRecommended() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOndcReturnable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOndcCancellable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOndcSellerPickupReturn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcReturnWindow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcTimeToShip() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOndcAvailableOnCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao getOndcStatutoryPackagedCommodities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao getOndcStatutoryPackagedFood() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public ItemDao(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String parentItemId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PriceDao price, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryId, @org.jetbrains.annotations.Nullable()
    java.lang.String locationId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.TimeDao time, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean matched, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean related, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recommended, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-returnable")
    java.lang.Boolean ondcReturnable, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-cancellable")
    java.lang.Boolean ondcCancellable, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-seller_pickup_return")
    java.lang.Boolean ondcSellerPickupReturn, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-return_window")
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-time_to_ship")
    java.lang.String ondcTimeToShip, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-available_on_cod")
    java.lang.Boolean ondcAvailableOnCod, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-statutory_reqs_packaged_commodities")
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-statutory_reqs_prepackaged_food")
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFood) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PriceDao component4() {
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
    public final org.beckn.one.sandbox.bap.message.entities.TimeDao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
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
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ItemDao copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String parentItemId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PriceDao price, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryId, @org.jetbrains.annotations.Nullable()
    java.lang.String locationId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.TimeDao time, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean matched, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean related, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recommended, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-returnable")
    java.lang.Boolean ondcReturnable, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-cancellable")
    java.lang.Boolean ondcCancellable, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-seller_pickup_return")
    java.lang.Boolean ondcSellerPickupReturn, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-return_window")
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-time_to_ship")
    java.lang.String ondcTimeToShip, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-available_on_cod")
    java.lang.Boolean ondcAvailableOnCod, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-statutory_reqs_packaged_commodities")
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "./ondc-statutory_reqs_prepackaged_food")
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFood) {
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