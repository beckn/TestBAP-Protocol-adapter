package org.beckn.one.sandbox.bap.client.external.bap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J6\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u001e"}, d2 = {"Lorg/beckn/one/sandbox/bap/client/external/bap/ProtocolClient;", "", "getCancelResponsesCall", "Lretrofit2/Call;", "", "Lorg/beckn/protocol/schemas/ProtocolOnCancel;", "messageId", "", "getConfirmResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnConfirm;", "getInitResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnInit;", "getOnCancellationReasonsResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnCancellationReasons;", "getOrderByIdStatusResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnOrderStatus;", "orderId", "getOrderStatusResponsesCall", "getRatingResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnRating;", "getSearchResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnSearch;", "providerName", "categoryName", "getSelectResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnSelect;", "getSupportResponseCall", "Lorg/beckn/protocol/schemas/ProtocolOnSupport;", "getTrackResponsesCall", "Lorg/beckn/protocol/schemas/ProtocolOnTrack;", "sandbox_bap_client"})
public abstract interface ProtocolClient {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_search")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnSearch>> getSearchResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "providerName")
    java.lang.String providerName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "categoryName")
    java.lang.String categoryName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_select")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnSelect>> getSelectResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_init")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnInit>> getInitResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_confirm")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnConfirm>> getConfirmResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_track")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnTrack>> getTrackResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_support")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnSupport>> getSupportResponseCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_rating")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnRating>> getRatingResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_status")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnOrderStatus>> getOrderStatusResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_cancel")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnCancel>> getCancelResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_order_status")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnOrderStatus>> getOrderByIdStatusResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "orderId")
    java.lang.String orderId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "protocol/response/v1/on_cancellation_reasons")
    public abstract retrofit2.Call<java.util.List<org.beckn.protocol.schemas.ProtocolOnCancellationReasons>> getOnCancellationReasonsResponsesCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "messageId")
    java.lang.String messageId);
}