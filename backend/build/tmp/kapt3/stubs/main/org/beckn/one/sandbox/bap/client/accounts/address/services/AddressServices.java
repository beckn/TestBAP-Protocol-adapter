package org.beckn.one.sandbox.bap.client.accounts.address.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J*\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0015*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00110\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/accounts/address/services/AddressServices;", "", "addressRepository", "Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;", "Lorg/beckn/one/sandbox/bap/message/entities/AddDeliveryAddressDao;", "responseStorageService", "Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressResponse;", "mapper", "Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "(Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;Lorg/beckn/one/sandbox/bap/message/services/ResponseStorageService;Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;)V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "findAddressesForCurrentUser", "Lorg/springframework/http/ResponseEntity;", "", "userId", "", "mapToErrorResponse", "kotlin.jvm.PlatformType", "it", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "save", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/database/DatabaseError$OnWrite;", "requestDao", "updateAndSaveAddress", "address", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressRequestDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class AddressServices {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> addressRepository = null;
    private final org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse, org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> responseStorageService = null;
    private final org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse, org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> mapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse> updateAndSaveAddress(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressRequestDto address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.database.DatabaseError.OnWrite, org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse> save(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao requestDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse>> findAddressesForCurrentUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    private org.springframework.http.ResponseEntity<java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse>> mapToErrorResponse(org.beckn.one.sandbox.bap.errors.HttpError it) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public AddressServices(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> addressRepository, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.services.ResponseStorageService<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse, org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> responseStorageService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse, org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> mapper) {
        super();
    }
}