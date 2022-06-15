package org.beckn.one.sandbox.bap.client.accounts.address.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/address/controllers/AddressController;", "", "addressServices", "Lorg/beckn/one/sandbox/bap/client/accounts/address/services/AddressServices;", "(Lorg/beckn/one/sandbox/bap/client/accounts/address/services/AddressServices;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "deliveryAddress", "Lorg/springframework/http/ResponseEntity;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressResponse;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressRequestDto;", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "sandbox_bap_client"})
@org.springframework.web.bind.annotation.RestController()
public class AddressController {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.accounts.address.services.AddressServices addressServices = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/client/v1/delivery_address"})
    public org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse> deliveryAddress(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressRequestDto request) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public AddressController(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.accounts.address.services.AddressServices addressServices) {
        super();
    }
}