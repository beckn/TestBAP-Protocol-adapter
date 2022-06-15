package org.beckn.one.sandbox.bap.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/beckn/one/sandbox/bap/factories/RetryFactory;", "", "()V", "Companion", "sandbox_bap_client"})
public final class RetryFactory {
    @org.jetbrains.annotations.NotNull()
    public static final org.beckn.one.sandbox.bap.factories.RetryFactory.Companion Companion = null;
    
    public RetryFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lorg/beckn/one/sandbox/bap/factories/RetryFactory$Companion;", "", "()V", "create", "Lio/github/resilience4j/retry/Retry;", "name", "", "maxAttempts", "", "initialIntervalInMillis", "", "intervalMultiplier", "", "sandbox_bap_client"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.github.resilience4j.retry.Retry create(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int maxAttempts, long initialIntervalInMillis, double intervalMultiplier) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}