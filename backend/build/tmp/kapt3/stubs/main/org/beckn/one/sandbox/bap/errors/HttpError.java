package org.beckn.one.sandbox.bap.errors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/beckn/one/sandbox/bap/errors/HttpError;", "", "error", "Lorg/beckn/protocol/schemas/ProtocolError;", "message", "Lorg/beckn/protocol/schemas/ResponseMessage;", "status", "Lorg/springframework/http/HttpStatus;", "sandbox_bap_client"})
public abstract interface HttpError {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.http.HttpStatus status();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.beckn.protocol.schemas.ResponseMessage message();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.beckn.protocol.schemas.ProtocolError error();
}