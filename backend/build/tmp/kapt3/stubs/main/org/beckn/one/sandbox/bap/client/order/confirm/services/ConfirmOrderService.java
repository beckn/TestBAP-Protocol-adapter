package org.beckn.one.sandbox.bap.client.order.confirm.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0012J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0012J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0012J&\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/confirm/services/ConfirmOrderService;", "", "bppConfirmService", "Lorg/beckn/one/sandbox/bap/client/order/confirm/services/BppConfirmService;", "registryService", "Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;", "log", "Lorg/slf4j/Logger;", "(Lorg/beckn/one/sandbox/bap/client/order/confirm/services/BppConfirmService;Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;Lorg/slf4j/Logger;)V", "areMultipleBppItemsSelected", "", "items", "", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderItemDto;", "areMultipleProviderItemsSelected", "arePaymentsPending", "payment", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderPayment;", "confirmOrder", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "order", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class ConfirmOrderService {
    private final org.beckn.one.sandbox.bap.client.order.confirm.services.BppConfirmService bppConfirmService = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService = null;
    private final org.slf4j.Logger log = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.protocol.schemas.ProtocolAckResponse> confirmOrder(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderDto order) {
        return null;
    }
    
    private boolean arePaymentsPending(org.beckn.one.sandbox.bap.client.shared.dtos.OrderPayment payment) {
        return false;
    }
    
    private boolean areMultipleProviderItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items) {
        return false;
    }
    
    private boolean areMultipleBppItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items) {
        return false;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ConfirmOrderService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.confirm.services.BppConfirmService bppConfirmService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService, @org.jetbrains.annotations.NotNull()
    org.slf4j.Logger log) {
        super();
    }
}