package org.beckn.one.sandbox.bap.client.order.orderhistory.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0012JI\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/orderhistory/controllers/OnOrderHistoryController;", "", "orderServices", "Lorg/beckn/one/sandbox/bap/client/order/orderhistory/services/OrderServices;", "(Lorg/beckn/one/sandbox/bap/client/order/orderhistory/services/OrderServices;)V", "getOrderServices", "()Lorg/beckn/one/sandbox/bap/client/order/orderhistory/services/OrderServices;", "mapToErrorResponse", "Lorg/springframework/http/ResponseEntity;", "", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderResponse;", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "onOrdersList", "orderId", "", "parentOrderId", "skip", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/springframework/http/ResponseEntity;", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class OnOrderHistoryController {
    @org.jetbrains.annotations.NotNull()
    private final org.beckn.one.sandbox.bap.client.order.orderhistory.services.OrderServices orderServices = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/client/v1/orders"})
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse>> onOrdersList(@org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String parentOrderId, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.Integer skip, @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.Integer limit) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderResponse>> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.beckn.one.sandbox.bap.client.order.orderhistory.services.OrderServices getOrderServices() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public OnOrderHistoryController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.orderhistory.services.OrderServices orderServices) {
        super();
    }
}