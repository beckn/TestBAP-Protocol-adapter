package org.beckn.one.sandbox.bap.configurations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\b\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/beckn/one/sandbox/bap/configurations/DatabaseConfiguration;", "", "connectionString", "", "databaseName", "(Ljava/lang/String;Ljava/lang/String;)V", "createAccountDetailDb", "Lorg/beckn/one/sandbox/bap/message/repositories/BecknResponseRepository;", "Lorg/beckn/one/sandbox/bap/message/entities/AccountDetailsDao;", "database", "Lcom/mongodb/client/MongoDatabase;", "createBillingResponseDb", "Lorg/beckn/one/sandbox/bap/message/entities/BillingDetailsDao;", "createDeliverAddressResponseDb", "Lorg/beckn/one/sandbox/bap/message/entities/AddDeliveryAddressDao;", "createOrderDb", "Lorg/beckn/one/sandbox/bap/message/entities/OrderDao;", "sandbox_bap_client"})
@org.springframework.context.annotation.Configuration()
public class DatabaseConfiguration {
    private final java.lang.String connectionString = null;
    private final java.lang.String databaseName = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.mongodb.client.MongoDatabase database() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.OrderDao> createOrderDb(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.mongodb.client.MongoDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.AddDeliveryAddressDao> createDeliverAddressResponseDb(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.mongodb.client.MongoDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao> createBillingResponseDb(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.mongodb.client.MongoDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.beckn.one.sandbox.bap.message.repositories.BecknResponseRepository<org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao> createAccountDetailDb(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    com.mongodb.client.MongoDatabase database) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${database.mongo.url}")
    java.lang.String connectionString, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${database.mongo.name}")
    java.lang.String databaseName) {
        super();
    }
}