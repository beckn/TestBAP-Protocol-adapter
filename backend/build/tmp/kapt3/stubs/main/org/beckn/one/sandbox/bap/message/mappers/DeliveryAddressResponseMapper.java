package org.beckn.one.sandbox.bap.message.mappers;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H&\u00a8\u0006\b"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/mappers/DeliveryAddressResponseMapper;", "Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/DeliveryAddressResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/AddDeliveryAddressDao;", "entityToProtocol", "entity", "protocolToEntity", "schema", "sandbox_bap_client"})
public abstract interface DeliveryAddressResponseMapper extends org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse, org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> {
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(ignore = true, target = "userId")
    @java.lang.Override()
    public abstract org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse entityToProtocol(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao entity);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao protocolToEntity(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse schema);
}