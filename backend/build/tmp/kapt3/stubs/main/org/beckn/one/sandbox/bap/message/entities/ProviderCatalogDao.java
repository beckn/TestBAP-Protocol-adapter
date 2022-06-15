package org.beckn.one.sandbox.bap.message.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u00c6\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u008c\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00062"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/entities/ProviderCatalogDao;", "", "id", "", "descriptor", "Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "locations", "", "Lorg/beckn/one/sandbox/bap/message/entities/LocationDao;", "categories", "Lorg/beckn/one/sandbox/bap/message/entities/CategoryDao;", "items", "Lorg/beckn/one/sandbox/bap/message/entities/ItemDao;", "tags", "", "exp", "Ljava/time/LocalDateTime;", "matched", "", "(Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/time/LocalDateTime;Ljava/lang/Boolean;)V", "getCategories", "()Ljava/util/List;", "getDescriptor", "()Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;", "getExp", "()Ljava/time/LocalDateTime;", "getId", "()Ljava/lang/String;", "getItems", "getLocations", "getMatched", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTags", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lorg/beckn/one/sandbox/bap/message/entities/DescriptorDao;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/time/LocalDateTime;Ljava/lang/Boolean;)Lorg/beckn/one/sandbox/bap/message/entities/ProviderCatalogDao;", "equals", "other", "hashCode", "", "toString", "sandbox_bap_client"})
public final class ProviderCatalogDao {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.LocationDao> locations = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> categories = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.beckn.one.sandbox.bap.message.entities.ItemDao> items = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.time.LocalDateTime exp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean matched = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.LocationDao> getLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.ItemDao> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getExp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getMatched() {
        return null;
    }
    
    @org.beckn.protocol.schemas.Default()
    public ProviderCatalogDao(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.LocationDao> locations, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> categories, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.ItemDao> items, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime exp, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean matched) {
        super();
    }
    
    @org.beckn.protocol.schemas.Default()
    public ProviderCatalogDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.beckn.one.sandbox.bap.message.entities.DescriptorDao component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.LocationDao> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.beckn.one.sandbox.bap.message.entities.ItemDao> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.beckn.one.sandbox.bap.message.entities.ProviderCatalogDao copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    org.beckn.one.sandbox.bap.message.entities.DescriptorDao descriptor, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.LocationDao> locations, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.CategoryDao> categories, @org.jetbrains.annotations.Nullable()
    java.util.List<org.beckn.one.sandbox.bap.message.entities.ItemDao> items, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime exp, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean matched) {
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