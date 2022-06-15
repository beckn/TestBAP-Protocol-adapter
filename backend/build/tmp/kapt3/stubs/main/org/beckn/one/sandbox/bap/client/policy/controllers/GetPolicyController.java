package org.beckn.one.sandbox.bap.client.policy.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/policy/controllers/GetPolicyController;", "", "contextFactory", "Lorg/beckn/one/sandbox/bap/factories/ContextFactory;", "getPolicyService", "Lorg/beckn/one/sandbox/bap/client/policy/services/GetPolicyService;", "(Lorg/beckn/one/sandbox/bap/factories/ContextFactory;Lorg/beckn/one/sandbox/bap/client/policy/services/GetPolicyService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getCancellationPolicyV1", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/GetOrderPolicyDto;", "getContext", "Lorg/beckn/protocol/schemas/ProtocolContext;", "transactionId", "", "bppId", "action", "Lorg/beckn/protocol/schemas/ProtocolContext$Action;", "getRatingCategoriesV1", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientOrderPolicyResponse;", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class GetPolicyController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory = null;
    private final org.beckn.one.sandbox.bap.client.policy.services.GetPolicyService getPolicyService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/get_cancellation_policy"})
    public org.springframework.http.ResponseEntity<org.beckn.protocol.schemas.ProtocolAckResponse> getCancellationPolicyV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.GetOrderPolicyDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/get_rating_category"})
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.ClientOrderPolicyResponse> getRatingCategoriesV1(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.GetOrderPolicyDto request) {
        return null;
    }
    
    private org.beckn.protocol.schemas.ProtocolContext getContext(java.lang.String transactionId, java.lang.String bppId, org.beckn.protocol.schemas.ProtocolContext.Action action) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public GetPolicyController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.ContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.policy.services.GetPolicyService getPolicyService) {
        super();
    }
}