package org.beckn.one.sandbox.bap.message.mappers;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.beckn.one.sandbox.bap.client.shared.dtos.AccountDetailsResponse;
import org.beckn.one.sandbox.bap.client.shared.dtos.BillingDetailsResponse;
import org.beckn.one.sandbox.bap.client.shared.dtos.DeliveryAddressResponse;
import org.beckn.one.sandbox.bap.message.entities.AccountDetailsDao;
import org.beckn.one.sandbox.bap.message.entities.AddressDao;
import org.beckn.one.sandbox.bap.message.entities.BillingDetailsDao;
import org.beckn.one.sandbox.bap.message.entities.ContextDao;
import org.beckn.one.sandbox.bap.message.entities.ContextDao.Action;
import org.beckn.one.sandbox.bap.message.entities.DeliveryAddressDao;
import org.beckn.one.sandbox.bap.message.entities.DescriptorDao;
import org.beckn.one.sandbox.bap.message.entities.ErrorDao;
import org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type;
import org.beckn.one.sandbox.bap.message.entities.OrganizationDao;
import org.beckn.one.sandbox.bap.message.entities.TimeDao;
import org.beckn.protocol.schemas.ProtocolContext;
import org.beckn.protocol.schemas.ProtocolError;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T15:45:11+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class AccountDetailsResponseMapperImpl implements AccountDetailsResponseMapper {

    @Override
    public AccountDetailsResponse entityToProtocol(AccountDetailsDao entity) {
        if ( entity == null ) {
            return null;
        }

        List<DeliveryAddressResponse> address = null;
        List<BillingDetailsResponse> billing = null;
        ProtocolContext context = null;
        ProtocolError error = null;
        String phone = null;
        String email = null;
        String name = null;

        address = deliveryAddressDaoListToDeliveryAddressResponseList( entity.getAddress() );
        billing = billingDetailsDaoListToBillingDetailsResponseList( entity.getBilling() );
        context = contextDaoToProtocolContext( entity.getContext() );
        error = errorDaoToProtocolError( entity.getError() );
        phone = entity.getPhone();
        email = entity.getEmail();
        name = entity.getName();

        String userId = null;

        AccountDetailsResponse accountDetailsResponse = new AccountDetailsResponse( context, userId, error, phone, email, name, address, billing );

        return accountDetailsResponse;
    }

    @Override
    public AccountDetailsDao protocolToEntity(AccountDetailsResponse schema) {
        if ( schema == null ) {
            return null;
        }

        String userId = null;
        List<DeliveryAddressDao> address = null;
        List<BillingDetailsDao> billing = null;
        ContextDao context = null;
        String phone = null;
        String email = null;
        String name = null;
        ErrorDao error = null;

        userId = schema.getUserId();
        address = deliveryAddressResponseListToDeliveryAddressDaoList( schema.getAddress() );
        billing = billingDetailsResponseListToBillingDetailsDaoList( schema.getBilling() );
        context = protocolContextToContextDao( schema.getContext() );
        phone = schema.getPhone();
        email = schema.getEmail();
        name = schema.getName();
        error = protocolErrorToErrorDao( schema.getError() );

        Clock clock = null;
        OffsetDateTime createdAt = null;

        AccountDetailsDao accountDetailsDao = new AccountDetailsDao( context, phone, email, name, address, billing, error, userId, clock, createdAt );

        return accountDetailsDao;
    }

    protected DeliveryAddressResponse deliveryAddressDaoToDeliveryAddressResponse(DeliveryAddressDao deliveryAddressDao) {
        if ( deliveryAddressDao == null ) {
            return null;
        }

        String id = null;
        DescriptorDao descriptor = null;
        String gps = null;
        AddressDao address = null;

        id = deliveryAddressDao.getId();
        descriptor = deliveryAddressDao.getDescriptor();
        gps = deliveryAddressDao.getGps();
        address = deliveryAddressDao.getAddress();

        ProtocolContext context = null;
        String userId = null;
        ProtocolError error = null;
        Boolean defaultAddress = null;

        DeliveryAddressResponse deliveryAddressResponse = new DeliveryAddressResponse( context, userId, error, id, descriptor, gps, defaultAddress, address );

        return deliveryAddressResponse;
    }

    protected List<DeliveryAddressResponse> deliveryAddressDaoListToDeliveryAddressResponseList(List<DeliveryAddressDao> list) {
        if ( list == null ) {
            return null;
        }

        List<DeliveryAddressResponse> list1 = new ArrayList<DeliveryAddressResponse>( list.size() );
        for ( DeliveryAddressDao deliveryAddressDao : list ) {
            list1.add( deliveryAddressDaoToDeliveryAddressResponse( deliveryAddressDao ) );
        }

        return list1;
    }

    protected org.beckn.protocol.schemas.ProtocolContext.Action actionToAction(Action action) {
        if ( action == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolContext.Action action1;

        switch ( action ) {
            case SEARCH: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.SEARCH;
            break;
            case SELECT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.SELECT;
            break;
            case INIT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.INIT;
            break;
            case CONFIRM: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.CONFIRM;
            break;
            case UPDATE: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.UPDATE;
            break;
            case STATUS: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.STATUS;
            break;
            case TRACK: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.TRACK;
            break;
            case CANCEL: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.CANCEL;
            break;
            case RATING: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.RATING;
            break;
            case SUPPORT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.SUPPORT;
            break;
            case ON_SEARCH: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_SEARCH;
            break;
            case ON_SELECT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_SELECT;
            break;
            case ON_INIT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_INIT;
            break;
            case ON_CONFIRM: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_CONFIRM;
            break;
            case ON_UPDATE: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_UPDATE;
            break;
            case ON_STATUS: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_STATUS;
            break;
            case ON_TRACK: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_TRACK;
            break;
            case ON_CANCEL: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_CANCEL;
            break;
            case ON_RATING: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_RATING;
            break;
            case ON_SUPPORT: action1 = org.beckn.protocol.schemas.ProtocolContext.Action.ON_SUPPORT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + action );
        }

        return action1;
    }

    protected ProtocolContext contextDaoToProtocolContext(ContextDao contextDao) {
        if ( contextDao == null ) {
            return null;
        }

        String domain = null;
        String country = null;
        String city = null;
        org.beckn.protocol.schemas.ProtocolContext.Action action = null;
        String coreVersion = null;
        String bapId = null;
        String bapUri = null;
        String bppId = null;
        String bppUri = null;
        String transactionId = null;
        String messageId = null;
        Clock clock = null;
        OffsetDateTime timestamp = null;
        String key = null;
        String ttl = null;

        domain = contextDao.getDomain();
        country = contextDao.getCountry();
        city = contextDao.getCity();
        action = actionToAction( contextDao.getAction() );
        coreVersion = contextDao.getCoreVersion();
        bapId = contextDao.getBapId();
        bapUri = contextDao.getBapUri();
        bppId = contextDao.getBppId();
        bppUri = contextDao.getBppUri();
        transactionId = contextDao.getTransactionId();
        messageId = contextDao.getMessageId();
        clock = contextDao.getClock();
        timestamp = contextDao.getTimestamp();
        key = contextDao.getKey();
        ttl = contextDao.getTtl();

        ProtocolContext protocolContext = new ProtocolContext( domain, country, city, action, coreVersion, bapId, bapUri, bppId, bppUri, transactionId, messageId, clock, timestamp, key, ttl );

        return protocolContext;
    }

    protected org.beckn.protocol.schemas.ProtocolError.Type typeToType(Type type) {
        if ( type == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolError.Type type1;

        switch ( type ) {
            case CONTEXTERROR: type1 = org.beckn.protocol.schemas.ProtocolError.Type.CONTEXTERROR;
            break;
            case COREERROR: type1 = org.beckn.protocol.schemas.ProtocolError.Type.COREERROR;
            break;
            case DOMAINERROR: type1 = org.beckn.protocol.schemas.ProtocolError.Type.DOMAINERROR;
            break;
            case POLICYERROR: type1 = org.beckn.protocol.schemas.ProtocolError.Type.POLICYERROR;
            break;
            case JSONSCHEMAERROR: type1 = org.beckn.protocol.schemas.ProtocolError.Type.JSONSCHEMAERROR;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected ProtocolError errorDaoToProtocolError(ErrorDao errorDao) {
        if ( errorDao == null ) {
            return null;
        }

        String code = null;
        String message = null;
        org.beckn.protocol.schemas.ProtocolError.Type type = null;
        String path = null;

        code = errorDao.getCode();
        message = errorDao.getMessage();
        type = typeToType( errorDao.getType() );
        path = errorDao.getPath();

        ProtocolError protocolError = new ProtocolError( code, message, type, path );

        return protocolError;
    }

    protected BillingDetailsResponse billingDetailsDaoToBillingDetailsResponse(BillingDetailsDao billingDetailsDao) {
        if ( billingDetailsDao == null ) {
            return null;
        }

        ProtocolContext context = null;
        String id = null;
        String name = null;
        String phone = null;
        OrganizationDao organization = null;
        AddressDao address = null;
        String email = null;
        TimeDao time = null;
        String taxNumber = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;
        String locationId = null;
        String userId = null;
        ProtocolError error = null;

        context = contextDaoToProtocolContext( billingDetailsDao.getContext() );
        id = billingDetailsDao.getId();
        name = billingDetailsDao.getName();
        phone = billingDetailsDao.getPhone();
        organization = billingDetailsDao.getOrganization();
        address = billingDetailsDao.getAddress();
        email = billingDetailsDao.getEmail();
        time = billingDetailsDao.getTime();
        taxNumber = billingDetailsDao.getTaxNumber();
        createdAt = billingDetailsDao.getCreatedAt();
        updatedAt = billingDetailsDao.getUpdatedAt();
        locationId = billingDetailsDao.getLocationId();
        userId = billingDetailsDao.getUserId();
        error = errorDaoToProtocolError( billingDetailsDao.getError() );

        BillingDetailsResponse billingDetailsResponse = new BillingDetailsResponse( context, id, name, phone, organization, address, email, time, taxNumber, createdAt, updatedAt, locationId, userId, error );

        return billingDetailsResponse;
    }

    protected List<BillingDetailsResponse> billingDetailsDaoListToBillingDetailsResponseList(List<BillingDetailsDao> list) {
        if ( list == null ) {
            return null;
        }

        List<BillingDetailsResponse> list1 = new ArrayList<BillingDetailsResponse>( list.size() );
        for ( BillingDetailsDao billingDetailsDao : list ) {
            list1.add( billingDetailsDaoToBillingDetailsResponse( billingDetailsDao ) );
        }

        return list1;
    }

    protected DeliveryAddressDao deliveryAddressResponseToDeliveryAddressDao(DeliveryAddressResponse deliveryAddressResponse) {
        if ( deliveryAddressResponse == null ) {
            return null;
        }

        String id = null;
        DescriptorDao descriptor = null;
        String gps = null;
        AddressDao address = null;

        id = deliveryAddressResponse.getId();
        descriptor = deliveryAddressResponse.getDescriptor();
        gps = deliveryAddressResponse.getGps();
        address = deliveryAddressResponse.getAddress();

        Boolean p3_772401952 = null;

        DeliveryAddressDao deliveryAddressDao = new DeliveryAddressDao( id, descriptor, gps, p3_772401952, address );

        return deliveryAddressDao;
    }

    protected List<DeliveryAddressDao> deliveryAddressResponseListToDeliveryAddressDaoList(List<DeliveryAddressResponse> list) {
        if ( list == null ) {
            return null;
        }

        List<DeliveryAddressDao> list1 = new ArrayList<DeliveryAddressDao>( list.size() );
        for ( DeliveryAddressResponse deliveryAddressResponse : list ) {
            list1.add( deliveryAddressResponseToDeliveryAddressDao( deliveryAddressResponse ) );
        }

        return list1;
    }

    protected Action actionToAction1(org.beckn.protocol.schemas.ProtocolContext.Action action) {
        if ( action == null ) {
            return null;
        }

        Action action1;

        switch ( action ) {
            case SEARCH: action1 = Action.SEARCH;
            break;
            case SELECT: action1 = Action.SELECT;
            break;
            case INIT: action1 = Action.INIT;
            break;
            case CONFIRM: action1 = Action.CONFIRM;
            break;
            case UPDATE: action1 = Action.UPDATE;
            break;
            case STATUS: action1 = Action.STATUS;
            break;
            case TRACK: action1 = Action.TRACK;
            break;
            case CANCEL: action1 = Action.CANCEL;
            break;
            case RATING: action1 = Action.RATING;
            break;
            case SUPPORT: action1 = Action.SUPPORT;
            break;
            case ON_SEARCH: action1 = Action.ON_SEARCH;
            break;
            case ON_SELECT: action1 = Action.ON_SELECT;
            break;
            case ON_INIT: action1 = Action.ON_INIT;
            break;
            case ON_CONFIRM: action1 = Action.ON_CONFIRM;
            break;
            case ON_UPDATE: action1 = Action.ON_UPDATE;
            break;
            case ON_STATUS: action1 = Action.ON_STATUS;
            break;
            case ON_TRACK: action1 = Action.ON_TRACK;
            break;
            case ON_CANCEL: action1 = Action.ON_CANCEL;
            break;
            case ON_RATING: action1 = Action.ON_RATING;
            break;
            case ON_SUPPORT: action1 = Action.ON_SUPPORT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + action );
        }

        return action1;
    }

    protected ContextDao protocolContextToContextDao(ProtocolContext protocolContext) {
        if ( protocolContext == null ) {
            return null;
        }

        String domain = null;
        String country = null;
        String city = null;
        Action action = null;
        String coreVersion = null;
        String bapId = null;
        String bapUri = null;
        String bppId = null;
        String bppUri = null;
        String transactionId = null;
        String messageId = null;
        Clock clock = null;
        OffsetDateTime timestamp = null;
        String key = null;
        String ttl = null;

        domain = protocolContext.getDomain();
        country = protocolContext.getCountry();
        city = protocolContext.getCity();
        action = actionToAction1( protocolContext.getAction() );
        coreVersion = protocolContext.getCoreVersion();
        bapId = protocolContext.getBapId();
        bapUri = protocolContext.getBapUri();
        bppId = protocolContext.getBppId();
        bppUri = protocolContext.getBppUri();
        transactionId = protocolContext.getTransactionId();
        messageId = protocolContext.getMessageId();
        clock = protocolContext.getClock();
        timestamp = protocolContext.getTimestamp();
        key = protocolContext.getKey();
        ttl = protocolContext.getTtl();

        ContextDao contextDao = new ContextDao( domain, country, city, action, coreVersion, bapId, bapUri, bppId, bppUri, transactionId, messageId, clock, timestamp, key, ttl );

        return contextDao;
    }

    protected Type typeToType1(org.beckn.protocol.schemas.ProtocolError.Type type) {
        if ( type == null ) {
            return null;
        }

        Type type1;

        switch ( type ) {
            case CONTEXTERROR: type1 = Type.CONTEXTERROR;
            break;
            case COREERROR: type1 = Type.COREERROR;
            break;
            case DOMAINERROR: type1 = Type.DOMAINERROR;
            break;
            case POLICYERROR: type1 = Type.POLICYERROR;
            break;
            case JSONSCHEMAERROR: type1 = Type.JSONSCHEMAERROR;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected ErrorDao protocolErrorToErrorDao(ProtocolError protocolError) {
        if ( protocolError == null ) {
            return null;
        }

        Type type = null;
        String code = null;
        String path = null;
        String message = null;

        type = typeToType1( protocolError.getType() );
        code = protocolError.getCode();
        path = protocolError.getPath();
        message = protocolError.getMessage();

        ErrorDao errorDao = new ErrorDao( type, code, path, message );

        return errorDao;
    }

    protected BillingDetailsDao billingDetailsResponseToBillingDetailsDao(BillingDetailsResponse billingDetailsResponse) {
        if ( billingDetailsResponse == null ) {
            return null;
        }

        ContextDao context = null;
        String id = null;
        String name = null;
        String phone = null;
        OrganizationDao organization = null;
        AddressDao address = null;
        String email = null;
        TimeDao time = null;
        String taxNumber = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;
        String locationId = null;
        ErrorDao error = null;
        String userId = null;

        context = protocolContextToContextDao( billingDetailsResponse.getContext() );
        id = billingDetailsResponse.getId();
        name = billingDetailsResponse.getName();
        phone = billingDetailsResponse.getPhone();
        organization = billingDetailsResponse.getOrganization();
        address = billingDetailsResponse.getAddress();
        email = billingDetailsResponse.getEmail();
        time = billingDetailsResponse.getTime();
        taxNumber = billingDetailsResponse.getTaxNumber();
        createdAt = billingDetailsResponse.getCreatedAt();
        updatedAt = billingDetailsResponse.getUpdatedAt();
        locationId = billingDetailsResponse.getLocationId();
        error = protocolErrorToErrorDao( billingDetailsResponse.getError() );
        userId = billingDetailsResponse.getUserId();

        BillingDetailsDao billingDetailsDao = new BillingDetailsDao( context, id, name, phone, organization, address, email, time, taxNumber, createdAt, updatedAt, locationId, error, userId );

        return billingDetailsDao;
    }

    protected List<BillingDetailsDao> billingDetailsResponseListToBillingDetailsDaoList(List<BillingDetailsResponse> list) {
        if ( list == null ) {
            return null;
        }

        List<BillingDetailsDao> list1 = new ArrayList<BillingDetailsDao>( list.size() );
        for ( BillingDetailsResponse billingDetailsResponse : list ) {
            list1.add( billingDetailsResponseToBillingDetailsDao( billingDetailsResponse ) );
        }

        return list1;
    }
}
