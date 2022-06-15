package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c2\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003JK\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006%"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/MessageDao;", "", "_id", "Lorg/litote/kmongo/Id;", "", "id", "type", "Lorg/beckn/one/sandbox/bap/message/entities/MessageDao$Type;", "clock", "Ljava/time/Clock;", "created", "Ljava/time/LocalDateTime;", "updated", "(Lorg/litote/kmongo/Id;Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/MessageDao$Type;Ljava/time/Clock;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getClock", "()Ljava/time/Clock;", "getCreated", "()Ljava/time/LocalDateTime;", "getId", "()Ljava/lang/String;", "getType", "()Lorg/beckn/one/sandbox/bap/message/entities/MessageDao$Type;", "getUpdated", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "sandbox_bap_client"})
public final class MessageDao {
    @org.bson.codecs.pojo.annotations.BsonId()
    private final org.litote.kmongo.Id<java.lang.String> _id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.entities.MessageDao.Type type = null;
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private final java.time.Clock clock = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime updated = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.MessageDao.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock getClock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getUpdated() {
        return null;
    }
    
    public MessageDao(@org.jetbrains.annotations.NotNull()
    org.litote.kmongo.Id<java.lang.String> _id, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.MessageDao.Type type, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime created, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime updated) {
        super();
    }
    
    private final org.litote.kmongo.Id<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.MessageDao.Type component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Clock component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.MessageDao copy(@org.jetbrains.annotations.NotNull()
    org.litote.kmongo.Id<java.lang.String> _id, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.MessageDao.Type type, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime created, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime updated) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/MessageDao$Type;", "", "(Ljava/lang/String;I)V", "Search", "Select", "Init", "Confirm", "Track", "Cancel", "Status", "sandbox_bap_client"})
    public static enum Type {
        /*public static final*/ Search /* = new Search() */,
        /*public static final*/ Select /* = new Select() */,
        /*public static final*/ Init /* = new Init() */,
        /*public static final*/ Confirm /* = new Confirm() */,
        /*public static final*/ Track /* = new Track() */,
        /*public static final*/ Cancel /* = new Cancel() */,
        /*public static final*/ Status /* = new Status() */;
        
        Type() {
        }
    }
}