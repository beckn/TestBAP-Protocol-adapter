package org.beckn.one.sandbox.bap.client.order.status.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/status/services/OnOrderStatusService;", "", "repository", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/OrderDao;", "(Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "getRepository", "()Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "updateOrder", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "orderDao", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class OnOrderStatusService {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError, org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse> updateOrder(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.OrderDao orderDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> getRepository() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnOrderStatusService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> repository) {
        super();
    }
}