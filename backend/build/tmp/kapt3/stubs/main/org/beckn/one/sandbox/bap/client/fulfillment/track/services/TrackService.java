package org.beckn.one.sandbox.bap.client.fulfillment.track.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/TrackService;", "", "registryService", "Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;", "bppTrackService", "Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/BppTrackService;", "(Lorg/beckn/one/sandbox/bap/client/shared/services/RegistryService;Lorg/beckn/one/sandbox/bap/client/fulfillment/track/services/BppTrackService;)V", "log", "Lorg/slf4j/Logger;", "track", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "context", "Lorg/beckn/protocol/schemas/ProtocolContext;", "request", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/TrackRequestDto;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class TrackService {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService = null;
    private final org.beckn.one.sandbox.bap.client.fulfillment.track.services.BppTrackService bppTrackService = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.protocol.schemas.ProtocolAckResponse> track(@org.jetbrains.annotations.NotNull()
    org.beckn.protocol.schemas.ProtocolContext context, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.dtos.TrackRequestDto request) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public TrackService(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.shared.services.RegistryService registryService, @org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.fulfillment.track.services.BppTrackService bppTrackService) {
        super();
    }
}