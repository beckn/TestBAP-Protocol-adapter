package org.beckn.one.sandbox.bap.client.accounts.user.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b0\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u001a\u001a\u00020\tH\u0012J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/user/services/AccountDetailsServices;", "", "addressServices", "Lorg/beckn/one/sandbox/bap/client/accounts/address/services/AddressServices;", "billingDetailService", "Lorg/beckn/one/sandbox/bap/client/accounts/billings/services/BillingDetailService;", "responseStorageService", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/AccountDetailsResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/AccountDetailsDao;", "(Lorg/beckn/one/sandbox/bap/client/accounts/address/services/AddressServices;Lorg/beckn/one/sandbox/bap/client/accounts/billings/services/BillingDetailService;Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "bindBillingAndAccount", "Lorg/springframework/http/ResponseEntity;", "accountResponse", "userId", "", "findAccountDetailForCurrentUser", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "updateAccountDetailInDb", "requestBody", "updateAccountDetails", "user", "Lorg/beckn/one/sandbox/bap/auth/model/User;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/AccountRequestDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class AccountDetailsServices {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.accounts.address.services.AddressServices addressServices = null;
    private final org.beckn.one.sandbox.bap.client.accounts.billings.services.BillingDetailService billingDetailService = null;
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse, org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao> responseStorageService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> findAccountDetailForCurrentUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> bindBillingAndAccount(org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse accountResponse, java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> updateAccountDetails(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.auth.model.User user, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.AccountRequestDto request) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> updateAccountDetailInDb(org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao requestBody) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public AccountDetailsServices(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.accounts.address.services.AddressServices addressServices, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.accounts.billings.services.BillingDetailService billingDetailService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse, org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao> responseStorageService) {
        super();
    }
}