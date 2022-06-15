package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009e\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006>"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "", "id", "", "type", "state", "Lorg/beckn/one/sandbox/bap/message/entities/StateDao;", "tracking", "", "agent", "Lorg/beckn/one/sandbox/bap/message/entities/PersonDao;", "vehicle", "Lorg/beckn/one/sandbox/bap/message/entities/VehicleDao;", "start", "Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentStartDao;", "end", "Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentEndDao;", "purpose", "customer", "Lorg/beckn/one/sandbox/bap/message/entities/CustomerDao;", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/StateDao;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/PersonDao;Lorg/beckn/one/sandbox/bap/message/entities/VehicleDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentStartDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentEndDao;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/CustomerDao;Ljava/util/Map;)V", "getAgent", "()Lorg/beckn/one/sandbox/bap/message/entities/PersonDao;", "getCustomer", "()Lorg/beckn/one/sandbox/bap/message/entities/CustomerDao;", "getEnd", "()Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentEndDao;", "getId", "()Ljava/lang/String;", "getPurpose", "getStart", "()Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentStartDao;", "getState", "()Lorg/beckn/one/sandbox/bap/message/entities/StateDao;", "getTags", "()Ljava/util/Map;", "getTracking", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "getVehicle", "()Lorg/beckn/one/sandbox/bap/message/entities/VehicleDao;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/StateDao;Ljava/lang/Boolean;Lorg/beckn/one/sandbox/bap/message/entities/PersonDao;Lorg/beckn/one/sandbox/bap/message/entities/VehicleDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentStartDao;Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentEndDao;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/CustomerDao;Ljava/util/Map;)Lorg/beckn/one/sandbox/bap/message/entities/FulfillmentDao;", "equals", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class FulfillmentDao {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.StateDao state = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean tracking = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.PersonDao agent = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.VehicleDao vehicle = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao start = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao end = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String purpose = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.CustomerDao customer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> tags = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.StateDao getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getTracking() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PersonDao getAgent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.VehicleDao getVehicle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao getStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao getEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurpose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.CustomerDao getCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public FulfillmentDao(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.StateDao state, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean tracking, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PersonDao agent, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.VehicleDao vehicle, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao start, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao end, @org.jetbrains.annotations.Nullable()
    java.lang.String purpose, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.CustomerDao customer, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public FulfillmentDao() {
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
    public final org.beckn.one.sandbox.bap.message.entities.StateDao component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.PersonDao component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.VehicleDao component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.CustomerDao component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.FulfillmentDao copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.StateDao state, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean tracking, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.PersonDao agent, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.VehicleDao vehicle, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao start, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao end, @org.jetbrains.annotations.Nullable()
    java.lang.String purpose, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.CustomerDao customer, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags) {
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