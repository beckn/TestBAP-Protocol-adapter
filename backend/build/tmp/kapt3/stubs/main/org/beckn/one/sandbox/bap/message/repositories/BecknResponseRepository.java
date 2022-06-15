package org.beckn.one.sandbox.bap.message.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;", "R", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "Lorg/beckn/one/sandbox/bap/message/repositories/GenericRepository;", "collection", "Lcom/mongodb/client/MongoCollection;", "(Lcom/mongodb/client/MongoCollection;)V", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "log", "Lorg/slf4j/Logger;", "findById", "id", "", "(Ljava/lang/String;)Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "findManyByUserId", "", "skip", "", "limit", "findOrdersById", "bson", "Lorg/bson/conversions/Bson;", "updateByIdQuery", "Lcom/mongodb/client/result/UpdateResult;", "requestData", "updateOptions", "Lcom/mongodb/client/model/UpdateOptions;", "(Lorg/bson/conversions/Bson;Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;Lcom/mongodb/client/model/UpdateOptions;)Lcom/mongodb/client/result/UpdateResult;", "updateManyById", "requestColumn", "sandbox_bap_client"})
public class BecknResponseRepository<R extends org.beckn.one.sandbox.bap.message.entities.BecknResponseDao> extends org.beckn.one.sandbox.bap.message.repositories.GenericRepository<R> {
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mongodb.client.MongoCollection<R> collection = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<R> findManyByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int skip, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public R findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.UpdateResult updateByIdQuery(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson id, @org.jetbrains.annotations.NotNull()
    R requestData, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.model.UpdateOptions updateOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<R> findOrdersById(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson bson, int skip, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.UpdateResult updateManyById(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson id, @org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson requestColumn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.MongoCollection<R> getCollection() {
        return null;
    }
    
    public BecknResponseRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoCollection<R> collection) {
        super(null);
    }
}