package org.beckn.one.sandbox.bap.client.order.confirm.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/confirm/services/OnConfirmOrderService;", "", "repository", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/OrderDao;", "mapper", "Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "log", "Lorg/slf4j/Logger;", "(Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;Lorg/slf4j/Logger;)V", "getMapper", "()Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "getRepository", "()Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "findById", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError;", "messageId", "", "updateOrder", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "orderDao", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class OnConfirmOrderService {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> repository = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> mapper = null;
    private final org.slf4j.Logger log = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> updateOrder(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.OrderDao orderDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, org.beckn.one.sandbox.bap.message.entities.OrderDao> findById(@org.jetbrains.annotations.Nullable()
    java.lang.String messageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> getMapper() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnConfirmOrderService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> repository, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> mapper, @org.jetbrains.annotations.NotNull()
    org.slf4j.Logger log) {
        super();
    }
}