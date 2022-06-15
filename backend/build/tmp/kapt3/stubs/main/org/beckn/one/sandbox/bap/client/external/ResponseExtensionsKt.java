package org.beckn.one.sandbox.bap.client.external;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u00a8\u0006\u0007"}, d2 = {"hasBody", "", "T", "Lretrofit2/Response;", "isAckNegative", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "isInternalServerError", "sandbox_bap_client"})
public final class ResponseExtensionsKt {
    
    public static final <T extends java.lang.Object>boolean isInternalServerError(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$isInternalServerError) {
        return false;
    }
    
    public static final <T extends java.lang.Object>boolean hasBody(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$hasBody) {
        return false;
    }
    
    public static final boolean isAckNegative(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<org.beckn.protocol.schemas.ProtocolAckResponse> $this$isAckNegative) {
        return false;
    }
}