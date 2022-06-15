package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0006Z[\\]^_B\u00fd\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u00a2\u0006\u0002\u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u00ff\u0001\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u00c6\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010W\u001a\u00020XH\u00d6\u0001J\t\u0010Y\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?\u00a8\u0006`"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao;", "", "uri", "Ljava/net/URI;", "tlMethod", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$TlMethod;", "params", "", "", "type", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Type;", "status", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Status;", "time", "Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;", "collectedBy", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedBy;", "ondcCollectedByStatus", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;", "ondcBuyerAppFinderFeeType", "Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$BuyerAppFinderFeeType;", "ondcBuyerAppFinderFeeAmount", "ondcWithHoldingAmount", "ondcWithHoldingAmountStatus", "ondcReturnWindow", "ondcReturnWindowStatus", "ondcSettlementBasis", "ondcSettlementBasisStatus", "ondcSettlementWindow", "ondcSettlementWindowStatus", "ondcSettlementDetails", "", "Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao;", "(Ljava/net/URI;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$TlMethod;Ljava/util/Map;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Type;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Status;Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedBy;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$BuyerAppFinderFeeType;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;Ljava/util/List;)V", "getCollectedBy", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedBy;", "getOndcBuyerAppFinderFeeAmount", "()Ljava/lang/String;", "getOndcBuyerAppFinderFeeType", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$BuyerAppFinderFeeType;", "getOndcCollectedByStatus", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;", "getOndcReturnWindow", "getOndcReturnWindowStatus", "getOndcSettlementBasis", "getOndcSettlementBasisStatus", "getOndcSettlementDetails", "()Ljava/util/List;", "getOndcSettlementWindow", "getOndcSettlementWindowStatus", "getOndcWithHoldingAmount", "getOndcWithHoldingAmountStatus", "getParams", "()Ljava/util/Map;", "getStatus", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Status;", "getTime", "()Lorg/beckn/one/sandbox/bap/message/entities/TimeDao;", "getTlMethod", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$TlMethod;", "getType", "()Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Type;", "getUri", "()Ljava/net/URI;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "BuyerAppFinderFeeType", "CollectedBy", "CollectedByStatus", "Status", "TlMethod", "Type", "sandbox_bap_client"})
public final class PaymentDao {
    @org.jetbrains.annotations.Nullable()
    private final java.net.URI uri = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> params = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.TimeDao time = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy collectedBy = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcCollectedByStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType ondcBuyerAppFinderFeeType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcBuyerAppFinderFeeAmount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcWithHoldingAmount = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcWithHoldingAmountStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcReturnWindow = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcReturnWindowStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcSettlementBasis = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementBasisStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ondcSettlementWindow = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementWindowStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao> ondcSettlementDetails = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.net.URI getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod getTlMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.TimeDao getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy getCollectedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus getOndcCollectedByStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType getOndcBuyerAppFinderFeeType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcBuyerAppFinderFeeAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcWithHoldingAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus getOndcWithHoldingAmountStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcReturnWindow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus getOndcReturnWindowStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcSettlementBasis() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus getOndcSettlementBasisStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOndcSettlementWindow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus getOndcSettlementWindowStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao> getOndcSettlementDetails() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public PaymentDao(@org.jetbrains.annotations.Nullable()
    java.net.URI uri, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.TimeDao time, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy collectedBy, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcCollectedByStatus, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType ondcBuyerAppFinderFeeType, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcBuyerAppFinderFeeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcWithHoldingAmount, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcWithHoldingAmountStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcReturnWindowStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcSettlementBasis, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementBasisStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcSettlementWindow, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementWindowStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao> ondcSettlementDetails) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public PaymentDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.net.URI component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.TimeDao component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.PaymentDao copy(@org.jetbrains.annotations.Nullable()
    java.net.URI uri, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.TimeDao time, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy collectedBy, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcCollectedByStatus, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType ondcBuyerAppFinderFeeType, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcBuyerAppFinderFeeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcWithHoldingAmount, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcWithHoldingAmountStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcReturnWindow, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcReturnWindowStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcSettlementBasis, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementBasisStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String ondcSettlementWindow, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementWindowStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao> ondcSettlementDetails) {
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
    
    /**
     * Values: get,post
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$TlMethod;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GET", "POST", "sandbox_bap_client"})
    public static enum TlMethod {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "http/get")
        /*public static final*/ GET /* = new GET(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "http/post")
        /*public static final*/ POST /* = new POST(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        TlMethod(java.lang.String value) {
        }
    }
    
    /**
     * Values: oNMinusORDER,pREMinusFULFILLMENT,oNMinusFULFILLMENT,pOSTMinusFULFILLMENT
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ONORDER", "PREFULFILLMENT", "ONFULFILLMENT", "POSTFULFILLMENT", "sandbox_bap_client"})
    public static enum Type {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "ON-ORDER")
        /*public static final*/ ONORDER /* = new ONORDER(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "PRE-FULFILLMENT")
        /*public static final*/ PREFULFILLMENT /* = new PREFULFILLMENT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "ON-FULFILLMENT")
        /*public static final*/ ONFULFILLMENT /* = new ONFULFILLMENT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "POST-FULFILLMENT")
        /*public static final*/ POSTFULFILLMENT /* = new POSTFULFILLMENT(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Type(java.lang.String value) {
        }
    }
    
    /**
     * Values: pAID,nOTMinusPATD
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAID", "NOTPAID", "sandbox_bap_client"})
    public static enum Status {
        /*public static final*/ PAID /* = new PAID(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "NOT-PAID")
        /*public static final*/ NOTPAID /* = new NOTPAID(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        Status(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedBy;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BAP", "BPP", "sandbox_bap_client"})
    public static enum CollectedBy {
        /*public static final*/ BAP /* = new BAP(null) */,
        /*public static final*/ BPP /* = new BPP(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        CollectedBy(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$CollectedByStatus;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ASSERT", "AGREE", "DISAGREE", "TERMINATE", "sandbox_bap_client"})
    public static enum CollectedByStatus {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Assert")
        /*public static final*/ ASSERT /* = new ASSERT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Agree")
        /*public static final*/ AGREE /* = new AGREE(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Disagree")
        /*public static final*/ DISAGREE /* = new DISAGREE(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Terminate")
        /*public static final*/ TERMINATE /* = new TERMINATE(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        CollectedByStatus(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/PaymentDao$BuyerAppFinderFeeType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AMOUNT", "PERCENT", "sandbox_bap_client"})
    public static enum BuyerAppFinderFeeType {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Amount")
        /*public static final*/ AMOUNT /* = new AMOUNT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "Percent")
        /*public static final*/ PERCENT /* = new PERCENT(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        BuyerAppFinderFeeType(java.lang.String value) {
        }
    }
}