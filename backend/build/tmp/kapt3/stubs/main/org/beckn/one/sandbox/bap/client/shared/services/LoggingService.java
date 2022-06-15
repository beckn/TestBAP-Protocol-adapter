package org.beckn.one.sandbox.bap.client.shared.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0012J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0012J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/services/LoggingService;", "", "loggingServiceClient", "Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingServiceClient;", "(Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingServiceClient;)V", "log", "Lorg/slf4j/Logger;", "logging", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/errors/HttpError;", "Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingDto;", "client", "request", "Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingRequest;", "noLoggingFound", "", "httpResponse", "Lretrofit2/Response;", "postLog", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class LoggingService {
    private final org.slf4j.Logger log = null;
    private final org.beckn.one.sandbox.bap.client.external.logging.LoggingServiceClient loggingServiceClient = null;
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.one.sandbox.bap.client.external.logging.LoggingDto> postLog(@org.jetbrains.annotations.NotNull()
    org.beckn.one.sandbox.bap.client.external.logging.LoggingRequest request) {
        return null;
    }
    
    private arrow.core.Either<org.beckn.one.sandbox.bap.errors.HttpError, org.beckn.one.sandbox.bap.client.external.logging.LoggingDto> logging(org.beckn.one.sandbox.bap.client.external.logging.LoggingServiceClient client, org.beckn.one.sandbox.bap.client.external.logging.LoggingRequest request) {
        return null;
    }
    
    private boolean noLoggingFound(retrofit2.Response<org.beckn.one.sandbox.bap.client.external.logging.LoggingDto> httpResponse) {
        return false;
    }
    
    public LoggingService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    org.beckn.one.sandbox.bap.client.external.logging.LoggingServiceClient loggingServiceClient) {
        super();
    }
}