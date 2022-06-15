package org.beckn.one.sandbox.bap.client.accounts.billings.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0011*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r0\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/billings/services/BillingDetailService;", "", "responseStorageService", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/BillingDetailsResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDetailsDao;", "(Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "findBillingsForCurrentUser", "Lorg/springframework/http/ResponseEntity;", "", "userId", "", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class BillingDetailService {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse, org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> responseStorageService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse>> findBillingsForCurrentUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse>> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public BillingDetailService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse, org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> responseStorageService) {
        super();
    }
}