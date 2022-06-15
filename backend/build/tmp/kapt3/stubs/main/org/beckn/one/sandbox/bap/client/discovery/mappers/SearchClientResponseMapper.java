package org.beckn.one.sandbox.bap.client.discovery.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/discovery/mappers/SearchClientResponseMapper;", "Lorg/beckn/one/sandbox/bap/client/shared/services/GenericOnPollMapper;", "Lorg/beckn/protocol/schemas/ProtocolOnSearch;", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientSearchResponse;", "clientCatalogMapper", "Lorg/beckn/one/sandbox/bap/client/discovery/mappers/ClientCatalogMapper;", "(Lorg/beckn/one/sandbox/bap/client/discovery/mappers/ClientCatalogMapper;)V", "transform", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "input", "", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "sandbox_bap_client"})
public final class SearchClientResponseMapper implements org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollMapper<org.beckn.protocol.schemas.ProtocolOnSearch, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSearchResponse> {
    private final org.beckn.one.sandbox.bap.client.discovery.mappers.ClientCatalogMapper clientCatalogMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.one.sandbox.bap.client.shared.dtos.ClientSearchResponse> transform(@org.jetbrains.annotations.NotNull()
    java.util.List<org.beckn.protocol.schemas.ProtocolOnSearch> input, @org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context) {
        return null;
    }
    
    public SearchClientResponseMapper(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.discovery.mappers.ClientCatalogMapper clientCatalogMapper) {
        super();
    }
}