package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OnTrackMessageTrackingDao;", "", "url", "", "status", "Lorg/beckn/one/sandbox/bap/message/entities/OnTrackMessageTrackingDao$TrackingStatusDao;", "(Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/OnTrackMessageTrackingDao$TrackingStatusDao;)V", "getStatus", "()Lorg/beckn/one/sandbox/bap/message/entities/OnTrackMessageTrackingDao$TrackingStatusDao;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TrackingStatusDao", "sandbox_bap_client"})
public final class OnTrackMessageTrackingDao {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao.TrackingStatusDao status = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao.TrackingStatusDao getStatus() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public OnTrackMessageTrackingDao(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao.TrackingStatusDao status) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public OnTrackMessageTrackingDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao.TrackingStatusDao component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao copy(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.OnTrackMessageTrackingDao.TrackingStatusDao status) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/OnTrackMessageTrackingDao$TrackingStatusDao;", "", "(Ljava/lang/String;I)V", "Active", "Inactive", "sandbox_bap_client"})
    public static enum TrackingStatusDao {
        @com.fasterxml.jackson.annotation.JsonProperty(value = "active")
        /*public static final*/ Active /* = new Active() */,
        @com.fasterxml.jackson.annotation.JsonProperty(value = "inactive")
        /*public static final*/ Inactive /* = new Inactive() */;
        
        TrackingStatusDao() {
        }
    }
}