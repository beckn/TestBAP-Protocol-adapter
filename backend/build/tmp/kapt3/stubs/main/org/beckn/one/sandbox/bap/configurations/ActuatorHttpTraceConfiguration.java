package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/ActuatorHttpTraceConfiguration;", "", "()V", "httpTraceRepository", "Lorg/springframework/boot/actuate/trace/http/HttpTraceRepository;", "sandbox_bap_client"})
@org.springframework.context.annotation.Configuration()
public class ActuatorHttpTraceConfiguration {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.boot.actuate.trace.http.HttpTraceRepository httpTraceRepository() {
        return null;
    }
    
    public ActuatorHttpTraceConfiguration() {
        super();
    }
}