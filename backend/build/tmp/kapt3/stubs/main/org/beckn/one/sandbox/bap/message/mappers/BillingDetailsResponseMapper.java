package org.beckn.one.sandbox.bap.message.mappers;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR, uses = {org.beckn.one.sandbox.bap.message.mappers.DateMapper.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H&\u00a8\u0006\b"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/mappers/BillingDetailsResponseMapper;", "Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/BillingDetailsResponse;", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDetailsDao;", "entityToProtocol", "entity", "protocolToEntity", "schema", "sandbox_bap_client"})
public abstract interface BillingDetailsResponseMapper extends org.beckn.one.sandbox.bap.message.mappers.GenericResponseMapper<org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse, org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> {
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(ignore = true, target = "userId")
    @java.lang.Override()
    public abstract org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse entityToProtocol(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao entity);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao protocolToEntity(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse schema);
}