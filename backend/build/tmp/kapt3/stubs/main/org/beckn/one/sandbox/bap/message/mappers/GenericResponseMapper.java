package org.beckn.one.sandbox.bap.message.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/beckn/one/sandbox/bap/message/mappers/GenericResponseMapper;", "Protocol", "Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "Entity", "Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "", "entityToProtocol", "entity", "(Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;)Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;", "protocolToEntity", "schema", "(Lorg/beckn/one/sandbox/bap/client/shared/dtos/ClientResponse;)Lorg/beckn/one/sandbox/bap/message/entities/BecknResponseDao;", "sandbox_bap_client"})
public abstract interface GenericResponseMapper<Protocol extends org.beckn.one.sandbox.bap.client.shared.dtos.ClientResponse, Entity extends org.beckn.one.sandbox.bap.message.entities.BecknResponseDao> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract Protocol entityToProtocol(@org.jetbrains.annotations.NotNull()
    Entity entity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract Entity protocolToEntity(@org.jetbrains.annotations.NotNull()
    Protocol schema);
}