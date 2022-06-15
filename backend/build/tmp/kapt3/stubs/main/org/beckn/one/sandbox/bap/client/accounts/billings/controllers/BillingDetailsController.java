package org.beckn.one.sandbox.bap.client.accounts.billings.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00040\u00040\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/billings/controllers/BillingDetailsController;", "", "responseStorageService", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/BillingDetailsResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDetailsDao;", "(Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "deliveryAddress", "Lorg/springframework/http/ResponseEntity;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/BillingDetailRequestDto;", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class BillingDetailsController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse, org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> responseStorageService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/billing_details"})
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse> deliveryAddress(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailRequestDto request) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public BillingDetailsController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse, org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> responseStorageService) {
        super();
    }
}