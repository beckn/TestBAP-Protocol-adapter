package org.beckn.one.sandbox.bap.client.order.quote.mapper;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.WARN, injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/quote/mapper/SelectedItemMapper;", "", "dtoToProtocol", "Lorg/beckn/protocol/schemas/ProtocolSelectedItem;", "dto", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/CartItemDto;", "sandbox_bap_client"})
public abstract interface SelectedItemMapper {
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(target = "quantity", source = "quantity")
    public abstract org.beckn.protocol.schemas.ProtocolSelectedItem dtoToProtocol(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.CartItemDto dto);
}