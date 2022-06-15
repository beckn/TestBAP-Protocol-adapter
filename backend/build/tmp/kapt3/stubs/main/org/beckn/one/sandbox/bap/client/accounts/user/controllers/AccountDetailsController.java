package org.beckn.one.sandbox.bap.client.accounts.user.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/user/controllers/AccountDetailsController;", "", "accountDetailsServices", "Lorg/beckn/one/sandbox/bap/client/accounts/user/services/AccountDetailsServices;", "responseStorageService", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/AccountDetailsResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/AccountDetailsDao;", "(Lorg/beckn/one/sandbox/bap/client/accounts/user/services/AccountDetailsServices;Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "updateAccountDetails", "Lorg/springframework/http/ResponseEntity;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/AccountRequestDto;", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class AccountDetailsController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.accounts.user.services.AccountDetailsServices accountDetailsServices = null;
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse, org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao> responseStorageService = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/account_details"})
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse> updateAccountDetails(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.AccountRequestDto request) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public AccountDetailsController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.accounts.user.services.AccountDetailsServices accountDetailsServices, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse, org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao> responseStorageService) {
        super();
    }
}