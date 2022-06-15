package org.beckn.one.sandbox.bap.client.order.init.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/init/services/BppInitService;", "", "bppServiceClientFactory", "Lorg/beckn/one/sandbox/bap/client/external/provider/BppClientFactory;", "(Lorg/beckn/one/sandbox/bap/client/external/provider/BppClientFactory;)V", "log", "Lorg/slf4j/Logger;", "init", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "bppUri", "", "order", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/OrderDto;", "invokeBppInitApi", "Lretrofit2/Response;", "bppServiceClient", "Lorg/beckn/one/sandbox/bap/client/external/provider/BppClient;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class BppInitService {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.external.provider.BppClientFactory bppServiceClientFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError, org.beckn.protocol.schemas.ProtocolAckResponse> init(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    java.lang.String bppUri, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.OrderDto order) {
        return null;
    }
    
    private retrofit2.Response<org.beckn.protocol.schemas.ProtocolAckResponse> invokeBppInitApi(org.beckn.one.sandbox.bap.client.external.provider.BppClient bppServiceClient, org.beckn.protocol.schemas.ProtocolContext context, org.beckn.one.sandbox.bap.client.shared.dtos.OrderDto order) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public BppInitService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.provider.BppClientFactory bppServiceClientFactory) {
        super();
    }
}