package org.beckn.one.sandbox.bap.client.order.quote.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012J\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012J&\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/quote/services/QuoteService;", "", "registryService", "Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;", "bppSelectService", "Lorg/beckn/one/sandbox/bap/client/order/quote/services/BppSelectService;", "selectedItemMapper", "Lorg/beckn/one/sandbox/bap/client/order/quote/mapper/SelectedItemMapper;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;Lorg/beckn/one/sandbox/bap/client/order/quote/services/BppSelectService;Lorg/beckn/one/sandbox/bap/client/order/quote/mapper/SelectedItemMapper;)V", "log", "Lorg/slf4j/Logger;", "areMultipleBppItemsSelected", "", "items", "", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/CartItemDto;", "areMultipleProviderItemsSelected", "getQuote", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "cart", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/CartDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class QuoteService {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService = null;
    private final org.beckn.one.sandbox.bap.client.order.quote.services.BppSelectService bppSelectService = null;
    private final org.beckn.one.sandbox.bap.client.order.quote.mapper.SelectedItemMapper selectedItemMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.protocol.schemas.ProtocolAckResponse> getQuote(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.CartDto cart) {
        return null;
    }
    
    private boolean areMultipleProviderItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.CartItemDto> items) {
        return false;
    }
    
    private boolean areMultipleBppItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.CartItemDto> items) {
        return false;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public QuoteService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.quote.services.BppSelectService bppSelectService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.quote.mapper.SelectedItemMapper selectedItemMapper) {
        super();
    }
}