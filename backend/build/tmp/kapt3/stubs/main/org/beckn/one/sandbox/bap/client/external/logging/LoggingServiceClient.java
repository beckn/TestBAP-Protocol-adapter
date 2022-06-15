package org.beckn.one.sandbox.bap.client.external.logging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingServiceClient;", "", "logging", "Lretrofit2/Call;", "Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingDto;", "request", "Lorg/beckn/one/sandbox/bap/client/external/logging/LoggingRequest;", "sandbox_bap_client"})
public abstract interface LoggingServiceClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "blip")
    public abstract retrofit2.Call<org.beckn.one.sandbox.bap.client.external.logging.LoggingDto> logging(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.one.sandbox.bap.client.external.logging.LoggingRequest request);
}