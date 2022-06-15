package org.beckn.one.sandbox.bap.client.order.init.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0012J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0012J&\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/init/services/InitOrderService;", "", "bppInitService", "Lorg/beckn/one/sandbox/bap/client/order/init/services/BppInitService;", "registryService", "Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;", "log", "Lorg/slf4j/Logger;", "loggingService", "Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "loggingFactory", "Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;", "(Lorg/beckn/one/sandbox/bap/client/order/init/services/BppInitService;Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;Lorg/slf4j/Logger;Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;Lorg/beckn/one/sandbox/bap/factories/LoggingFactory;)V", "areMultipleBppItemsSelected", "", "items", "", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderItemDto;", "areMultipleProviderItemsSelected", "initOrder", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "order", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class InitOrderService {
    private final org.beckn.one.sandbox.bap.client.order.init.services.BppInitService bppInitService = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService = null;
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService = null;
    private final org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.protocol.schemas.ProtocolAckResponse> initOrder(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderDto order) {
        return null;
    }
    
    private boolean areMultipleProviderItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items) {
        return false;
    }
    
    private boolean areMultipleBppItemsSelected(java.util.List<org.beckn.one.sandbox.bap.client.shared.dtos.OrderItemDto> items) {
        return false;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public InitOrderService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.order.init.services.BppInitService bppInitService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService, @org.jetbrains.annotations.NotNull()
    org.slf4j.Logger log, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.LoggingService loggingService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.factories.LoggingFactory loggingFactory) {
        super();
    }
}