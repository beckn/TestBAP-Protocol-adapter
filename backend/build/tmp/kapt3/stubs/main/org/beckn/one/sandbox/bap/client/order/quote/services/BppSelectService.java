package org.beckn.one.sandbox.bap.client.order.quote.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J<\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0012JB\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/order/quote/services/BppSelectService;", "", "bppServiceClientFactory", "Lorg/beckn/one/sandbox/bap/client/external/provider/BppClientFactory;", "(Lorg/beckn/one/sandbox/bap/client/external/provider/BppClientFactory;)V", "log", "Lorg/slf4j/Logger;", "invokeBppSelectApi", "Lretrofit2/Response;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "bppServiceClient", "Lorg/beckn/one/sandbox/bap/client/external/provider/BppClient;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "providerId", "", "providerLocation", "Lorg/beckn/protocol/schemas/ProtocolLocation;", "items", "", "Lorg/beckn/protocol/schemas/ProtocolSelectedItem;", "select", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bpp/BppError;", "bppUri", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class BppSelectService {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.external.provider.BppClientFactory bppServiceClientFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.bpp.BppError, org.beckn.protocol.schemas.ProtocolAckResponse> select(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    java.lang.String bppUri, @org.jetbrains.annotations.NotNull()
    java.lang.String providerId, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolLocation providerLocation, @org.jetbrains.annotations.NotNull()
    java.util.List<org.beckn.protocol.schemas.ProtocolSelectedItem> items) {
        return null;
    }
    
    private retrofit2.Response<org.beckn.protocol.schemas.ProtocolAckResponse> invokeBppSelectApi(org.beckn.one.sandbox.bap.client.external.provider.BppClient bppServiceClient, org.beckn.protocol.schemas.ProtocolContext context, java.lang.String providerId, org.beckn.protocol.schemas.ProtocolLocation providerLocation, java.util.List<org.beckn.protocol.schemas.ProtocolSelectedItem> items) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public BppSelectService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.provider.BppClientFactory bppServiceClientFactory) {
        super();
    }
}