package org.beckn.one.sandbox.bap.client.shared.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\n2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/shared/services/GenericProtocolClientService;", "Proto", "Lorg/beckn/protocol/schemas/ProtocolResponse;", "", "()V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getResponse", "Larrow/core/Either;", "Lorg/beckn/one/sandbox/bap/client/shared/errors/bap/ProtocolClientError;", "", "call", "Lretrofit2/Call;", "sandbox_bap_client"})
@org.springframework.stereotype.Service()
public class GenericProtocolClientService<Proto extends org.beckn.protocol.schemas.ProtocolResponse> {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<org.beckn.one.sandbox.bap.client.shared.errors.bap.ProtocolClientError, java.util.List<Proto>> getResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<java.util.List<Proto>> call) {
        return null;
    }
    
    public GenericProtocolClientService() {
        super();
    }
}