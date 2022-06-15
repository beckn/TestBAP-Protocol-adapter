package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Bg\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Ji\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00061"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao;", "", "type", "Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao$OndcCancellationType;", "refId", "", "policies", "Lorg/beckn/one/sandbox/bap/message/entities/PolicyDao;", "time", "Ljava/time/OffsetDateTime;", "cancelledBy", "reasons", "Lorg/beckn/one/sandbox/bap/message/entities/OptionDao;", "selectedReason", "Lorg/beckn/one/sandbox/bap/message/entities/SelectedReasonDao;", "additionalDescription", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "(Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao$OndcCancellationType;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/PolicyDao;Ljava/time/OffsetDateTime;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/OptionDao;Lorg/beckn/one/sandbox/bap/message/entities/SelectedReasonDao;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;)V", "getAdditionalDescription", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getCancelledBy", "()Ljava/lang/String;", "getPolicies", "()Lorg/beckn/one/sandbox/bap/message/entities/PolicyDao;", "getReasons", "()Lorg/beckn/one/sandbox/bap/message/entities/OptionDao;", "getRefId", "getSelectedReason", "()Lorg/beckn/one/sandbox/bap/message/entities/SelectedReasonDao;", "getTime", "()Ljava/time/OffsetDateTime;", "getType", "()Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao$OndcCancellationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "OndcCancellationType", "sandbox_bap_client"})
public final class OndcOrderCancellationDao {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String refId = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PolicyDao policies = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.OffsetDateTime time = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cancelledBy = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OptionDao reasons = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao selectedReason = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao additionalDescription = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PolicyDao getPolicies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCancelledBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OptionDao getReasons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao getSelectedReason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getAdditionalDescription() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OndcOrderCancellationDao(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType type, @org.jetbrains.annotations.Nullable()
    java.lang.String refId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PolicyDao policies, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime time, @org.jetbrains.annotations.Nullable()
    java.lang.String cancelledBy, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OptionDao reasons, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao selectedReason, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao additionalDescription) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public OndcOrderCancellationDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PolicyDao component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.OffsetDateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OptionDao component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType type, @org.jetbrains.annotations.Nullable()
    java.lang.String refId, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PolicyDao policies, @org.jetbrains.annotations.Nullable()
    java.time.OffsetDateTime time, @org.jetbrains.annotations.Nullable()
    java.lang.String cancelledBy, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OptionDao reasons, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao selectedReason, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao additionalDescription) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OndcOrderCancellationDao$OndcCancellationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FULL", "PARTIAL", "sandbox_bap_client"})
    public static enum OndcCancellationType {
        @com.fasterxml.jackson.annotation.JsonProperty(value = " full")
        /*public static final*/ FULL /* = new FULL(null) */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "partial")
        /*public static final*/ PARTIAL /* = new PARTIAL(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        OndcCancellationType(java.lang.String value) {
        }
    }
}