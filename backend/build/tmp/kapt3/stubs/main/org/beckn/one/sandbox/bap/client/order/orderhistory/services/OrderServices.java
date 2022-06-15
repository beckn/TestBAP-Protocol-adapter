package org.beckn.one.sandbox.bap.client.order.orderhistory.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006JF\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/orderhistory/services/OrderServices;", "", "ordersResponseRepository", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/OrderDao;", "(Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getOrdersResponseRepository", "()Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "findAllOrders", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "", "user", "Lorg/beckn/one/sandbox/bap/auth/model/User;", "orderId", "", "parentOrderId", "skip", "", "limit", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class OrderServices {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> ordersResponseRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse>> findAllOrders(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.auth.model.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String parentOrderId, int skip, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> getOrdersResponseRepository() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OrderServices(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse, org.beckn.one.sandbox.bap.message.entities.OrderDao> ordersResponseRepository) {
        super();
    }
}