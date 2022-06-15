package org.beckn.one.sandbox.bap.message.repositories;

import java.lang.System;

@org.beckn.one.sandbox.bap.Open()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001#B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00018\u00008\u00000\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00018\u00008\u00000\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J%\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010\"R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/repositories/GenericRepository;", "R", "", "collection", "Lcom/mongodb/client/MongoCollection;", "(Lcom/mongodb/client/MongoCollection;)V", "all", "", "kotlin.jvm.PlatformType", "clear", "Lcom/mongodb/client/result/DeleteResult;", "deleteOneById", "id", "", "findAll", "query", "Lorg/bson/conversions/Bson;", "findOne", "(Lorg/bson/conversions/Bson;)Ljava/lang/Object;", "insertMany", "Lcom/mongodb/client/result/InsertManyResult;", "documents", "insertOne", "document", "(Ljava/lang/Object;)Ljava/lang/Object;", "size", "", "updateManyColumnById", "Lcom/mongodb/client/result/UpdateResult;", "column", "updateOneByQuery", "entity", "options", "Lcom/mongodb/client/model/UpdateOptions;", "(Lorg/bson/conversions/Bson;Ljava/lang/Object;Lcom/mongodb/client/model/UpdateOptions;)Lcom/mongodb/client/result/UpdateResult;", "Companion", "sandbox_bap_client"})
public class GenericRepository<R extends java.lang.Object> {
    private final com.mongodb.client.MongoCollection<R> collection = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.beckn.one.sandbox.bap.message.repositories.GenericRepository.Companion Companion = null;
    
    public long size() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.InsertManyResult insertMany(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends R> documents) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public R insertOne(@org.jetbrains.annotations.NotNull()
    R document) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<R> findAll(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public R findOne(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<R> all() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.DeleteResult clear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.UpdateResult updateOneByQuery(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query, @org.jetbrains.annotations.NotNull()
    R entity, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.model.UpdateOptions options) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.DeleteResult deleteOneById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.mongodb.client.result.UpdateResult updateManyColumnById(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query, @org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson column) {
        return null;
    }
    
    public GenericRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoCollection<R> collection) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\n\b\u0001\u0010\u0005\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\bJ+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\n\b\u0001\u0010\u0005\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\b\u00a8\u0006\n"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/repositories/GenericRepository$Companion;", "", "()V", "create", "Lorg/beckn/one/sandbox/bap/message/repositories/GenericRepository;", "T", "database", "Lcom/mongodb/client/MongoDatabase;", "collectionName", "", "sandbox_bap_client"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}