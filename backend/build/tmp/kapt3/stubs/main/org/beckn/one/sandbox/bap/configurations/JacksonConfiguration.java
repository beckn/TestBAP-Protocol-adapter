package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/JacksonConfiguration;", "", "()V", "rfc3339", "Ljava/text/SimpleDateFormat;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "sandbox_bap_client"})
@org.springframework.context.annotation.Configuration()
public class JacksonConfiguration {
    private final java.text.SimpleDateFormat rfc3339 = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
        return null;
    }
    
    public JacksonConfiguration() {
        super();
    }
}