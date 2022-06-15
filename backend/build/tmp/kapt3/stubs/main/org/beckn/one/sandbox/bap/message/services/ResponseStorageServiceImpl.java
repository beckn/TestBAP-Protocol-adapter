package org.beckn.one.sandbox.bap.message.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\'\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J2\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J2\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J!\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\"\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010#J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J)\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010)R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageServiceImpl;", "Proto", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "Entity", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "responseRepository", "Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;", "mapper", "Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "(Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;)V", "log", "Lorg/slf4j/Logger;", "getMapper", "()Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "deleteOneById", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError;", "Lcom/mongodb/client/result/DeleteResult;", "id", "", "findById", "userId", "findManyByUserId", "", "skip", "", "limit", "findOrderId", "bson", "Lorg/bson/conversions/Bson;", "findOrdersById", "save", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError$OnWrite;", "requestDao", "(Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;)Larrow/core/Either;", "toSchema", "allResponses", "updateDocByQuery", "query", "requestData", "(Lorg/bson/conversions/Bson;Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;)Larrow/core/Either;", "sandbox_bap_client"})
public final class ResponseStorageServiceImpl<Proto extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse, Entity extends org.beckn.one.sandbox.bap.message.entities.BecknResponseDao> implements org.beckn.one.sandbox.bap.message.services.ResponseStorageService<Proto, Entity> {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<Entity> responseRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<Proto, Entity> mapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError.OnWrite, Proto> save(@org.jetbrains.annotations.NotNull()
    Entity requestDao) {
        return null;
    }
    
    private final java.util.List<Proto> toSchema(java.util.List<? extends Entity> allResponses) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, java.util.List<Proto>> findManyByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int skip, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Proto> findById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Proto> updateDocByQuery(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query, @org.jetbrains.annotations.NotNull()
    Entity requestData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, com.mongodb.client.result.DeleteResult> deleteOneById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, java.util.List<Proto>> findOrdersById(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson bson, int skip, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Entity> findOrderId(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson bson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<Proto, Entity> getMapper() {
        return null;
    }
    
    public ResponseStorageServiceImpl(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<Entity> responseRepository, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<Proto, Entity> mapper) {
        super();
    }
}