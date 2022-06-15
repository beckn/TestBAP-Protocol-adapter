package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u00041234Bs\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Ju\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013\u00a8\u00065"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao;", "", "settlementCounterParty", "Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementCounterParty;", "settlementPhase", "Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementPhase;", "settlementType", "Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementType;", "settlementBankAccountNo", "", "settlementIfscCode", "upiAddress", "settlementStatus", "Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementStatus;", "settlementReference", "settlementTimestamp", "Ljava/time/OffsetDateTime;", "(Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementCounterParty;Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementPhase;Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementStatus;Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "getSettlementBankAccountNo", "()Ljava/lang/String;", "getSettlementCounterParty", "()Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementCounterParty;", "getSettlementIfscCode", "getSettlementPhase", "()Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementPhase;", "getSettlementReference", "getSettlementStatus", "()Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementStatus;", "getSettlementTimestamp", "()Ljava/time/OffsetDateTime;", "getSettlementType", "()Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementType;", "getUpiAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "SettlementCounterParty", "SettlementPhase", "SettlementStatus", "SettlementType", "sandbox_bap_client"})
public final class SettlementDetailsDao {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementCounterParty settlementCounterParty = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementPhase settlementPhase = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementType settlementType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String settlementBankAccountNo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String settlementIfscCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String upiAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementStatus settlementStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String settlementReference = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime settlementTimestamp = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementCounterParty getSettlementCounterParty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementPhase getSettlementPhase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementType getSettlementType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSettlementBankAccountNo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSettlementIfscCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpiAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementStatus getSettlementStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSettlementReference() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getSettlementTimestamp() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public SettlementDetailsDao(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementCounterParty settlementCounterParty, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementPhase settlementPhase, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementType settlementType, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementBankAccountNo, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementIfscCode, @org.jetbrains.annotations.Nullable()
    java.lang.String upiAddress, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementStatus settlementStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementReference, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime settlementTimestamp) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public SettlementDetailsDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementCounterParty component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementPhase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
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
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementCounterParty settlementCounterParty, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementPhase settlementPhase, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementType settlementType, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementBankAccountNo, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementIfscCode, @org.jetbrains.annotations.Nullable()
    java.lang.String upiAddress, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao.SettlementStatus settlementStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String settlementReference, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime settlementTimestamp) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementCounterParty;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUYERAPP", "SELLERAPP", "LOGISTICSPROVIDER", "sandbox_bap_client"})
    public static enum SettlementCounterParty {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "buyer-app")
        /*public static final*/ BUYERAPP /* = new BUYERAPP(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "seller-app")
        /*public static final*/ SELLERAPP /* = new SELLERAPP(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "logistics-provider")
        /*public static final*/ LOGISTICSPROVIDER /* = new LOGISTICSPROVIDER(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        SettlementCounterParty(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementPhase;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SALEAMOUNT", "WITHHOLDINGAMOUNT", "sandbox_bap_client"})
    public static enum SettlementPhase {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "sale-amount")
        /*public static final*/ SALEAMOUNT /* = new SALEAMOUNT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "withholding-amount")
        /*public static final*/ WITHHOLDINGAMOUNT /* = new WITHHOLDINGAMOUNT(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        SettlementPhase(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NEFT", "RTGS", "UPI", "sandbox_bap_client"})
    public static enum SettlementType {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "neft")
        /*public static final*/ NEFT /* = new NEFT(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "rtgs")
        /*public static final*/ RTGS /* = new RTGS(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "upi")
        /*public static final*/ UPI /* = new UPI(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        SettlementType(java.lang.String value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/SettlementDetailsDao$SettlementStatus;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAID", "NOTPAID", "sandbox_bap_client"})
    public static enum SettlementStatus {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "PAID")
        /*public static final*/ PAID /* = new PAID(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "NOT-PAID")
        /*public static final*/ NOTPAID /* = new NOTPAID(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        SettlementStatus(java.lang.String value) {
        }
    }
}