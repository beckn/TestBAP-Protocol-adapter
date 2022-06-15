package org.beckn.one.sandbox.bap.message.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\u0006\u0010\r\u001a\u00020\u000bH&J2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J2\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0019\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u001aJ)\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Proto", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "Entity", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "", "deleteOneById", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError;", "Lcom/mongodb/client/result/DeleteResult;", "id", "", "findById", "userId", "findManyByUserId", "", "skip", "", "limit", "findOrderId", "bson", "Lorg/bson/conversions/Bson;", "findOrdersById", "save", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError$OnWrite;", "protoResponse", "(Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;)Larrow/core/Either;", "updateDocByQuery", "query", "requestData", "(Lorg/bson/conversions/Bson;Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;)Larrow/core/Either;", "sandbox_bap_client"})
public abstract interface ResponseStorageService<Proto extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse, Entity extends org.beckn.one.sandbox.bap.message.entities.BecknResponseDao> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError.OnWrite, Proto> save(@org.jetbrains.annotations.NotNull()
    Entity protoResponse);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, java.util.List<Proto>> findManyByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int skip, int limit);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Proto> findById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, java.util.List<Proto>> findOrdersById(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson bson, int skip, int limit);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Proto> updateDocByQuery(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson query, @org.jetbrains.annotations.NotNull()
    Entity requestData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, com.mongodb.client.result.DeleteResult> deleteOneById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, Entity> findOrderId(@org.jetbrains.annotations.NotNull()
    org.bson.conversions.Bson bson);
}