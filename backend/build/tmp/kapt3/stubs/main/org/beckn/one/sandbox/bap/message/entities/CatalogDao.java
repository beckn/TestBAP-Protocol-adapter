package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u00c6\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\fH\u00d6\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/CatalogDao;", "", "bppDescriptor", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "bppProviders", "", "Lorg/beckn/one/sandbox/bap/message/entities/ProviderCatalogDao;", "bppCategories", "Lorg/beckn/one/sandbox/bap/message/entities/CategoryDao;", "exp", "Ljava/time/LocalDateTime;", "bppId", "", "(Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/util/List;Ljava/util/List;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "getBppCategories", "()Ljava/util/List;", "getBppDescriptor", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getBppId", "()Ljava/lang/String;", "getBppProviders", "getExp", "()Ljava/time/LocalDateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class CatalogDao {
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao bppDescriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao> bppProviders = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> bppCategories = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.LocalDateTime exp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bppId = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getBppDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao> getBppProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> getBppCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getExp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBppId() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public CatalogDao(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao bppDescriptor, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao> bppProviders, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> bppCategories, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime exp, @org.jetbrains.annotations.Nullable()
    java.lang.String bppId) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public CatalogDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.CatalogDao copy(@org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao bppDescriptor, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao> bppProviders, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> bppCategories, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime exp, @org.jetbrains.annotations.Nullable()
    java.lang.String bppId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}