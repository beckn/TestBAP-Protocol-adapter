package org.beckn.one.sandbox.bap.client.order.policy.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0012J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0010\u001a\u00020\nH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/policy/controllers/MockGetOrderPolicyController;", "", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "(Lorg/beckn/one/sandbox/bap/factories/ContextFactory;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "cancellationPolicy", "Lorg/beckn/protocol/schemas/ProtocolDescriptor;", "getOrderPolicy", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponse;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/GetOrderPolicyDto;", "returnPolicy", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class MockGetOrderPolicyController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v0/get_order_policy"})
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponse> getOrderPolicy(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.GetOrderPolicyDto request) {
        return null;
    }
    
    private org.beckn.protocol.schemas.ProtocolDescriptor cancellationPolicy() {
        return null;
    }
    
    private org.beckn.protocol.schemas.ProtocolDescriptor returnPolicy() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public MockGetOrderPolicyController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory) {
        super();
    }
}