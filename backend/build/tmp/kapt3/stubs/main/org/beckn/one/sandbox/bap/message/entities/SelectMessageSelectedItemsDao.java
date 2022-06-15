package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0082\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedItemsDao;", "", "id", "", "quantity", "Lorg/beckn/one/sandbox/bap/message/entities/ItemQuantityAllocatedDao;", "ondcReturnable", "", "ondcCancellable", "ondcSellerPickupReturn", "ondcReturnWindow", "ondcTimeToShip", "ondcAvailableOnCod", "ondcStatutoryPackagedCommodities", "Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;", "ondcStatutoryPackagedFood", "Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;", "(Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/ItemQuantityAllocatedDao;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;)V", "getId", "()Ljava/lang/String;", "getOndcAvailableOnCod", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOndcCancellable", "getOndcReturnWindow", "getOndcReturnable", "getOndcSellerPickupReturn", "getOndcStatutoryPackagedCommodities", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;", "getOndcStatutoryPackagedFood", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;", "getOndcTimeToShip", "getQuantity", "()Lorg/beckn/one/sandbox/bap/message/entities/ItemQuantityAllocatedDao;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/ItemQuantityAllocatedDao;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedCommoditiesDao;Lorg/beckn/one/sandbox/bap/message/entities/OndcStatutoryPackagedFoodDao;)Lorg/beckn/one/sandbox/bap/message/entities/SelectMessageSelectedItemsDao;", "equals", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class SelectMessageSelectedItemsDao {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao quantity = null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao getQuantity() {
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
    public SelectMessageSelectedItemsDao(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcReturnable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcCancellable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcSellerPickupReturn, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcTimeToShip, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcAvailableOnCod, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFood) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcReturnable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcCancellable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcSellerPickupReturn, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcTimeToShip, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean ondcAvailableOnCod, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities, @org.jetbrains.annotations.Nullable()
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