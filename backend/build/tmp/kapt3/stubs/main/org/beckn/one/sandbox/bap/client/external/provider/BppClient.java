package org.beckn.one.sandbox.bap.client.external.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0011H\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0013H\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H\'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0017H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0019H\'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\'\u00a8\u0006\u001c"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/provider/BppClient;", "", "cancel", "Lretrofit2/Call;", "Lorg/beckn/protocol/schemas/ProtocolAckResponse;", "request", "Lorg/beckn/protocol/schemas/ProtocolCancelRequest;", "confirm", "Lorg/beckn/protocol/schemas/ProtocolConfirmRequest;", "getCancellationReasons", "Lorg/beckn/protocol/schemas/ProtocolGetPolicyRequest;", "getOrderStatus", "Lorg/beckn/protocol/schemas/ProtocolOrderStatusRequest;", "getRatingCategories", "", "Lorg/beckn/protocol/schemas/ProtocolRatingCategory;", "init", "Lorg/beckn/protocol/schemas/ProtocolInitRequest;", "rating", "Lorg/beckn/protocol/schemas/ProtocolRatingRequest;", "search", "Lorg/beckn/protocol/schemas/ProtocolSearchRequest;", "select", "Lorg/beckn/protocol/schemas/ProtocolSelectRequest;", "support", "Lorg/beckn/protocol/schemas/ProtocolSupportRequest;", "track", "Lorg/beckn/protocol/schemas/ProtocolTrackRequest;", "sandbox_bap_client"})
public abstract interface BppClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "search")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolSearchRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "select")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> select(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolSelectRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "init")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> init(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolInitRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "confirm")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> confirm(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolConfirmRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "track")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> track(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolTrackRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "support")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> support(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolSupportRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "rating")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> rating(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolRatingRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "get_cancellation_reasons")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> getCancellationReasons(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolGetPolicyRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cancel")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> cancel(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolCancelRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "status")
    public abstract retrofit2.Call<org.beckn.protocol.schemas.ProtocolAckResponse> getOrderStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolOrderStatusRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "get_rating_categories")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolRatingCategory>> getRatingCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.beckn.protocol.schemas.ProtocolGetPolicyRequest request);
}