package org.beckn.one.sandbox.bap.message.mappers;

import java.math.BigDecimal;
import java.net.URI;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.beckn.one.sandbox.bap.client.shared.dtos.ClientConfirmResponse;
import org.beckn.one.sandbox.bap.message.entities.AddressDao;
import org.beckn.one.sandbox.bap.message.entities.BillingDao;
import org.beckn.one.sandbox.bap.message.entities.CircleDao;
import org.beckn.one.sandbox.bap.message.entities.CityDao;
import org.beckn.one.sandbox.bap.message.entities.ContactDao;
import org.beckn.one.sandbox.bap.message.entities.ContextDao;
import org.beckn.one.sandbox.bap.message.entities.ContextDao.Action;
import org.beckn.one.sandbox.bap.message.entities.CountryDao;
import org.beckn.one.sandbox.bap.message.entities.CustomerDao;
import org.beckn.one.sandbox.bap.message.entities.DescriptorDao;
import org.beckn.one.sandbox.bap.message.entities.ErrorDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao;
import org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao;
import org.beckn.one.sandbox.bap.message.entities.LocationDao;
import org.beckn.one.sandbox.bap.message.entities.OnConfirmDao;
import org.beckn.one.sandbox.bap.message.entities.OnConfirmMessageDao;
import org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao;
import org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao;
import org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType;
import org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao;
import org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao;
import org.beckn.one.sandbox.bap.message.entities.OptionDao;
import org.beckn.one.sandbox.bap.message.entities.OrderDao;
import org.beckn.one.sandbox.bap.message.entities.OrganizationDao;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy;
import org.beckn.one.sandbox.bap.message.entities.PersonDao;
import org.beckn.one.sandbox.bap.message.entities.PolicyDao;
import org.beckn.one.sandbox.bap.message.entities.PriceDao;
import org.beckn.one.sandbox.bap.message.entities.QuotationBreakupDao;
import org.beckn.one.sandbox.bap.message.entities.QuotationDao;
import org.beckn.one.sandbox.bap.message.entities.ScalarDao;
import org.beckn.one.sandbox.bap.message.entities.ScalarDao.Type;
import org.beckn.one.sandbox.bap.message.entities.ScalarRangeDao;
import org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedAddOnsDao;
import org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedItemsDao;
import org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedOffersDao;
import org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderDao;
import org.beckn.one.sandbox.bap.message.entities.SelectMessageSelectedProviderLocationsDao;
import org.beckn.one.sandbox.bap.message.entities.SelectedReasonDao;
import org.beckn.one.sandbox.bap.message.entities.SettlementDetailsDao;
import org.beckn.one.sandbox.bap.message.entities.StateDao;
import org.beckn.one.sandbox.bap.message.entities.TimeDao;
import org.beckn.one.sandbox.bap.message.entities.TimeRangeDao;
import org.beckn.one.sandbox.bap.message.entities.VehicleDao;
import org.beckn.protocol.schemas.OndcStatutoryPackagedCommodities;
import org.beckn.protocol.schemas.OndcStatutoryPackagedFood;
import org.beckn.protocol.schemas.ProtocolAddress;
import org.beckn.protocol.schemas.ProtocolBilling;
import org.beckn.protocol.schemas.ProtocolCircle;
import org.beckn.protocol.schemas.ProtocolCity;
import org.beckn.protocol.schemas.ProtocolContact;
import org.beckn.protocol.schemas.ProtocolContext;
import org.beckn.protocol.schemas.ProtocolCountry;
import org.beckn.protocol.schemas.ProtocolCustomer;
import org.beckn.protocol.schemas.ProtocolDescriptor;
import org.beckn.protocol.schemas.ProtocolError;
import org.beckn.protocol.schemas.ProtocolFulfillment;
import org.beckn.protocol.schemas.ProtocolFulfillmentEnd;
import org.beckn.protocol.schemas.ProtocolFulfillmentStart;
import org.beckn.protocol.schemas.ProtocolItemQuantityAllocated;
import org.beckn.protocol.schemas.ProtocolLocation;
import org.beckn.protocol.schemas.ProtocolOnConfirmMessage;
import org.beckn.protocol.schemas.ProtocolOndcLinkedOrders;
import org.beckn.protocol.schemas.ProtocolOndcOrderCancellation;
import org.beckn.protocol.schemas.ProtocolOption;
import org.beckn.protocol.schemas.ProtocolOrder;
import org.beckn.protocol.schemas.ProtocolOrganization;
import org.beckn.protocol.schemas.ProtocolPayment;
import org.beckn.protocol.schemas.ProtocolPayment.BuyerAppFinderFeeType;
import org.beckn.protocol.schemas.ProtocolPayment.CollectedByStatus;
import org.beckn.protocol.schemas.ProtocolPayment.Status;
import org.beckn.protocol.schemas.ProtocolPayment.TlMethod;
import org.beckn.protocol.schemas.ProtocolPerson;
import org.beckn.protocol.schemas.ProtocolPolicy;
import org.beckn.protocol.schemas.ProtocolPrice;
import org.beckn.protocol.schemas.ProtocolQuotation;
import org.beckn.protocol.schemas.ProtocolQuotationBreakup;
import org.beckn.protocol.schemas.ProtocolScalar;
import org.beckn.protocol.schemas.ProtocolScalarRange;
import org.beckn.protocol.schemas.ProtocolSchedule;
import org.beckn.protocol.schemas.ProtocolSelectMessageSelectedAddOns;
import org.beckn.protocol.schemas.ProtocolSelectMessageSelectedItems;
import org.beckn.protocol.schemas.ProtocolSelectMessageSelectedOffers;
import org.beckn.protocol.schemas.ProtocolSelectMessageSelectedProvider;
import org.beckn.protocol.schemas.ProtocolSelectMessageSelectedProviderLocations;
import org.beckn.protocol.schemas.ProtocolSelectedReason;
import org.beckn.protocol.schemas.ProtocolState;
import org.beckn.protocol.schemas.ProtocolTime;
import org.beckn.protocol.schemas.ProtocolTimeRange;
import org.beckn.protocol.schemas.ProtocolVehicle;
import org.beckn.protocol.schemas.SettlementDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T15:45:11+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class OnConfirmResponseMapperImpl implements OnConfirmResponseMapper {

    private final DateMapper dateMapper;

    @Autowired
    public OnConfirmResponseMapperImpl(DateMapper dateMapper) {

        this.dateMapper = dateMapper;
    }

    @Override
    public ClientConfirmResponse entityToProtocol(OnConfirmDao entity) {
        if ( entity == null ) {
            return null;
        }

        ProtocolContext context = null;
        ProtocolOnConfirmMessage message = null;
        ProtocolError error = null;

        context = contextDaoToProtocolContext( entity.getContext() );
        message = onConfirmMessageDaoToProtocolOnConfirmMessage( entity.getMessage() );
        error = errorDaoToProtocolError( entity.getError() );

        String parentOrderId = null;

        ClientConfirmResponse clientConfirmResponse = new ClientConfirmResponse( context, message, error, parentOrderId );

        return clientConfirmResponse;
    }

    @Override
    public OnConfirmDao protocolToEntity(ClientConfirmResponse schema) {
        if ( schema == null ) {
            return null;
        }

        ContextDao context = null;
        OnConfirmMessageDao message = null;
        ErrorDao error = null;

        context = protocolContextToContextDao( schema.getContext() );
        message = protocolOnConfirmMessageToOnConfirmMessageDao( schema.getMessage() );
        error = protocolErrorToErrorDao( schema.getError() );

        String transactionId = null;
        String messageId = null;
        String userId = null;

        OnConfirmDao onConfirmDao = new OnConfirmDao( context, transactionId, messageId, message, error, userId );

        return onConfirmDao;
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

    protected org.beckn.protocol.schemas.ProtocolScalar.Type typeToType(Type type) {
        if ( type == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolScalar.Type type1;

        switch ( type ) {
            case CONSTANT: type1 = org.beckn.protocol.schemas.ProtocolScalar.Type.CONSTANT;
            break;
            case VARIABLE: type1 = org.beckn.protocol.schemas.ProtocolScalar.Type.VARIABLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected ProtocolScalarRange scalarRangeDaoToProtocolScalarRange(ScalarRangeDao scalarRangeDao) {
        if ( scalarRangeDao == null ) {
            return null;
        }

        BigDecimal min = null;
        BigDecimal max = null;

        min = scalarRangeDao.getMin();
        max = scalarRangeDao.getMax();

        ProtocolScalarRange protocolScalarRange = new ProtocolScalarRange( min, max );

        return protocolScalarRange;
    }

    protected ProtocolScalar scalarDaoToProtocolScalar(ScalarDao scalarDao) {
        if ( scalarDao == null ) {
            return null;
        }

        BigDecimal value = null;
        String unit = null;
        org.beckn.protocol.schemas.ProtocolScalar.Type type = null;
        BigDecimal estimatedValue = null;
        BigDecimal computedValue = null;
        ProtocolScalarRange range = null;

        value = scalarDao.getValue();
        unit = scalarDao.getUnit();
        type = typeToType( scalarDao.getType() );
        estimatedValue = scalarDao.getEstimatedValue();
        computedValue = scalarDao.getComputedValue();
        range = scalarRangeDaoToProtocolScalarRange( scalarDao.getRange() );

        ProtocolScalar protocolScalar = new ProtocolScalar( value, unit, type, estimatedValue, computedValue, range );

        return protocolScalar;
    }

    protected ProtocolItemQuantityAllocated itemQuantityAllocatedDaoToProtocolItemQuantityAllocated(ItemQuantityAllocatedDao itemQuantityAllocatedDao) {
        if ( itemQuantityAllocatedDao == null ) {
            return null;
        }

        Integer count = null;
        ProtocolScalar measure = null;

        count = itemQuantityAllocatedDao.getCount();
        measure = scalarDaoToProtocolScalar( itemQuantityAllocatedDao.getMeasure() );

        ProtocolItemQuantityAllocated protocolItemQuantityAllocated = new ProtocolItemQuantityAllocated( count, measure );

        return protocolItemQuantityAllocated;
    }

    protected OndcStatutoryPackagedCommodities ondcStatutoryPackagedCommoditiesDaoToOndcStatutoryPackagedCommodities(OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommoditiesDao) {
        if ( ondcStatutoryPackagedCommoditiesDao == null ) {
            return null;
        }

        String commonOrGenericNameOfCommodity = null;
        String contactDetailsConsumerCare = null;
        String importedProductCountryOfOrigin = null;
        String manufacturerOrPackerAddress = null;
        String manufacturerOrPackerName = null;
        String monthYearOfManufacturePackingImport = null;
        String multipleProductsNameNumberOrQty = null;
        String netQuantityOrMeasureOfCommodityInPkg = null;

        commonOrGenericNameOfCommodity = ondcStatutoryPackagedCommoditiesDao.getCommonOrGenericNameOfCommodity();
        contactDetailsConsumerCare = ondcStatutoryPackagedCommoditiesDao.getContactDetailsConsumerCare();
        importedProductCountryOfOrigin = ondcStatutoryPackagedCommoditiesDao.getImportedProductCountryOfOrigin();
        manufacturerOrPackerAddress = ondcStatutoryPackagedCommoditiesDao.getManufacturerOrPackerAddress();
        manufacturerOrPackerName = ondcStatutoryPackagedCommoditiesDao.getManufacturerOrPackerName();
        monthYearOfManufacturePackingImport = ondcStatutoryPackagedCommoditiesDao.getMonthYearOfManufacturePackingImport();
        multipleProductsNameNumberOrQty = ondcStatutoryPackagedCommoditiesDao.getMultipleProductsNameNumberOrQty();
        netQuantityOrMeasureOfCommodityInPkg = ondcStatutoryPackagedCommoditiesDao.getNetQuantityOrMeasureOfCommodityInPkg();

        OndcStatutoryPackagedCommodities ondcStatutoryPackagedCommodities = new OndcStatutoryPackagedCommodities( commonOrGenericNameOfCommodity, contactDetailsConsumerCare, importedProductCountryOfOrigin, manufacturerOrPackerAddress, manufacturerOrPackerName, monthYearOfManufacturePackingImport, multipleProductsNameNumberOrQty, netQuantityOrMeasureOfCommodityInPkg );

        return ondcStatutoryPackagedCommodities;
    }

    protected OndcStatutoryPackagedFood ondcStatutoryPackagedFoodDaoToOndcStatutoryPackagedFood(OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFoodDao) {
        if ( ondcStatutoryPackagedFoodDao == null ) {
            return null;
        }

        String additivesInfo = null;
        String brandOwnerAddress = null;
        String brandOwnerFssaiLicenseNo = null;
        String brandOwnerFssaiLogo = null;
        String brandOwnerName = null;
        String contactDetailsConsumerCare = null;
        String importterProductCountryOrigin = null;
        String importerAddress = null;
        String importerFssaiLicenseNo = null;
        String importerFssaiLogo = null;
        String importerName = null;
        String ingredientsInfo = null;
        String netQuantity = null;
        String nutritionalInfo = null;
        String otherFssaiLicenseNo = null;
        String otherImporterAddress = null;
        String otherImporterCountryOrigin = null;
        String otherImporterName = null;
        String otherPremises = null;

        additivesInfo = ondcStatutoryPackagedFoodDao.getAdditivesInfo();
        brandOwnerAddress = ondcStatutoryPackagedFoodDao.getBrandOwnerAddress();
        brandOwnerFssaiLicenseNo = ondcStatutoryPackagedFoodDao.getBrandOwnerFssaiLicenseNo();
        brandOwnerFssaiLogo = ondcStatutoryPackagedFoodDao.getBrandOwnerFssaiLogo();
        brandOwnerName = ondcStatutoryPackagedFoodDao.getBrandOwnerName();
        contactDetailsConsumerCare = ondcStatutoryPackagedFoodDao.getContactDetailsConsumerCare();
        importterProductCountryOrigin = ondcStatutoryPackagedFoodDao.getImportterProductCountryOrigin();
        importerAddress = ondcStatutoryPackagedFoodDao.getImporterAddress();
        importerFssaiLicenseNo = ondcStatutoryPackagedFoodDao.getImporterFssaiLicenseNo();
        importerFssaiLogo = ondcStatutoryPackagedFoodDao.getImporterFssaiLogo();
        importerName = ondcStatutoryPackagedFoodDao.getImporterName();
        ingredientsInfo = ondcStatutoryPackagedFoodDao.getIngredientsInfo();
        netQuantity = ondcStatutoryPackagedFoodDao.getNetQuantity();
        nutritionalInfo = ondcStatutoryPackagedFoodDao.getNutritionalInfo();
        otherFssaiLicenseNo = ondcStatutoryPackagedFoodDao.getOtherFssaiLicenseNo();
        otherImporterAddress = ondcStatutoryPackagedFoodDao.getOtherImporterAddress();
        otherImporterCountryOrigin = ondcStatutoryPackagedFoodDao.getOtherImporterCountryOrigin();
        otherImporterName = ondcStatutoryPackagedFoodDao.getOtherImporterName();
        otherPremises = ondcStatutoryPackagedFoodDao.getOtherPremises();

        String manufacturerPackerAddress = null;
        String manufacturerPackerName = null;

        OndcStatutoryPackagedFood ondcStatutoryPackagedFood = new OndcStatutoryPackagedFood( additivesInfo, brandOwnerAddress, brandOwnerFssaiLicenseNo, brandOwnerFssaiLogo, brandOwnerName, contactDetailsConsumerCare, importterProductCountryOrigin, importerAddress, importerFssaiLicenseNo, importerFssaiLogo, importerName, ingredientsInfo, manufacturerPackerAddress, manufacturerPackerName, netQuantity, nutritionalInfo, otherFssaiLicenseNo, otherImporterAddress, otherImporterCountryOrigin, otherImporterName, otherPremises );

        return ondcStatutoryPackagedFood;
    }

    protected ProtocolSelectMessageSelectedItems selectMessageSelectedItemsDaoToProtocolSelectMessageSelectedItems(SelectMessageSelectedItemsDao selectMessageSelectedItemsDao) {
        if ( selectMessageSelectedItemsDao == null ) {
            return null;
        }

        String id = null;
        ProtocolItemQuantityAllocated quantity = null;
        Boolean ondcReturnable = null;
        Boolean ondcCancellable = null;
        Boolean ondcSellerPickupReturn = null;
        String ondcReturnWindow = null;
        String ondcTimeToShip = null;
        Boolean ondcAvailableOnCod = null;
        OndcStatutoryPackagedCommodities ondcStatutoryPackagedCommodities = null;
        OndcStatutoryPackagedFood ondcStatutoryPackagedFood = null;

        id = selectMessageSelectedItemsDao.getId();
        quantity = itemQuantityAllocatedDaoToProtocolItemQuantityAllocated( selectMessageSelectedItemsDao.getQuantity() );
        ondcReturnable = selectMessageSelectedItemsDao.getOndcReturnable();
        ondcCancellable = selectMessageSelectedItemsDao.getOndcCancellable();
        ondcSellerPickupReturn = selectMessageSelectedItemsDao.getOndcSellerPickupReturn();
        ondcReturnWindow = selectMessageSelectedItemsDao.getOndcReturnWindow();
        ondcTimeToShip = selectMessageSelectedItemsDao.getOndcTimeToShip();
        ondcAvailableOnCod = selectMessageSelectedItemsDao.getOndcAvailableOnCod();
        ondcStatutoryPackagedCommodities = ondcStatutoryPackagedCommoditiesDaoToOndcStatutoryPackagedCommodities( selectMessageSelectedItemsDao.getOndcStatutoryPackagedCommodities() );
        ondcStatutoryPackagedFood = ondcStatutoryPackagedFoodDaoToOndcStatutoryPackagedFood( selectMessageSelectedItemsDao.getOndcStatutoryPackagedFood() );

        ProtocolSelectMessageSelectedItems protocolSelectMessageSelectedItems = new ProtocolSelectMessageSelectedItems( id, quantity, ondcReturnable, ondcCancellable, ondcSellerPickupReturn, ondcReturnWindow, ondcTimeToShip, ondcAvailableOnCod, ondcStatutoryPackagedCommodities, ondcStatutoryPackagedFood );

        return protocolSelectMessageSelectedItems;
    }

    protected List<ProtocolSelectMessageSelectedItems> selectMessageSelectedItemsDaoListToProtocolSelectMessageSelectedItemsList(List<SelectMessageSelectedItemsDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedItems> list1 = new ArrayList<ProtocolSelectMessageSelectedItems>( list.size() );
        for ( SelectMessageSelectedItemsDao selectMessageSelectedItemsDao : list ) {
            list1.add( selectMessageSelectedItemsDaoToProtocolSelectMessageSelectedItems( selectMessageSelectedItemsDao ) );
        }

        return list1;
    }

    protected ProtocolSelectMessageSelectedAddOns selectMessageSelectedAddOnsDaoToProtocolSelectMessageSelectedAddOns(SelectMessageSelectedAddOnsDao selectMessageSelectedAddOnsDao) {
        if ( selectMessageSelectedAddOnsDao == null ) {
            return null;
        }

        String id = null;

        id = selectMessageSelectedAddOnsDao.getId();

        ProtocolSelectMessageSelectedAddOns protocolSelectMessageSelectedAddOns = new ProtocolSelectMessageSelectedAddOns( id );

        return protocolSelectMessageSelectedAddOns;
    }

    protected List<ProtocolSelectMessageSelectedAddOns> selectMessageSelectedAddOnsDaoListToProtocolSelectMessageSelectedAddOnsList(List<SelectMessageSelectedAddOnsDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedAddOns> list1 = new ArrayList<ProtocolSelectMessageSelectedAddOns>( list.size() );
        for ( SelectMessageSelectedAddOnsDao selectMessageSelectedAddOnsDao : list ) {
            list1.add( selectMessageSelectedAddOnsDaoToProtocolSelectMessageSelectedAddOns( selectMessageSelectedAddOnsDao ) );
        }

        return list1;
    }

    protected ProtocolSelectMessageSelectedOffers selectMessageSelectedOffersDaoToProtocolSelectMessageSelectedOffers(SelectMessageSelectedOffersDao selectMessageSelectedOffersDao) {
        if ( selectMessageSelectedOffersDao == null ) {
            return null;
        }

        String id = null;

        id = selectMessageSelectedOffersDao.getId();

        ProtocolSelectMessageSelectedOffers protocolSelectMessageSelectedOffers = new ProtocolSelectMessageSelectedOffers( id );

        return protocolSelectMessageSelectedOffers;
    }

    protected List<ProtocolSelectMessageSelectedOffers> selectMessageSelectedOffersDaoListToProtocolSelectMessageSelectedOffersList(List<SelectMessageSelectedOffersDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedOffers> list1 = new ArrayList<ProtocolSelectMessageSelectedOffers>( list.size() );
        for ( SelectMessageSelectedOffersDao selectMessageSelectedOffersDao : list ) {
            list1.add( selectMessageSelectedOffersDaoToProtocolSelectMessageSelectedOffers( selectMessageSelectedOffersDao ) );
        }

        return list1;
    }

    protected ProtocolOndcLinkedOrders ondcLinkedOrdersDaoToProtocolOndcLinkedOrders(OndcLinkedOrdersDao ondcLinkedOrdersDao) {
        if ( ondcLinkedOrdersDao == null ) {
            return null;
        }

        String id = null;

        id = ondcLinkedOrdersDao.getId();

        ProtocolOndcLinkedOrders protocolOndcLinkedOrders = new ProtocolOndcLinkedOrders( id );

        return protocolOndcLinkedOrders;
    }

    protected List<ProtocolOndcLinkedOrders> ondcLinkedOrdersDaoListToProtocolOndcLinkedOrdersList(List<OndcLinkedOrdersDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolOndcLinkedOrders> list1 = new ArrayList<ProtocolOndcLinkedOrders>( list.size() );
        for ( OndcLinkedOrdersDao ondcLinkedOrdersDao : list ) {
            list1.add( ondcLinkedOrdersDaoToProtocolOndcLinkedOrders( ondcLinkedOrdersDao ) );
        }

        return list1;
    }

    protected ProtocolSelectMessageSelectedProviderLocations selectMessageSelectedProviderLocationsDaoToProtocolSelectMessageSelectedProviderLocations(SelectMessageSelectedProviderLocationsDao selectMessageSelectedProviderLocationsDao) {
        if ( selectMessageSelectedProviderLocationsDao == null ) {
            return null;
        }

        String id = null;

        id = selectMessageSelectedProviderLocationsDao.getId();

        ProtocolSelectMessageSelectedProviderLocations protocolSelectMessageSelectedProviderLocations = new ProtocolSelectMessageSelectedProviderLocations( id );

        return protocolSelectMessageSelectedProviderLocations;
    }

    protected List<ProtocolSelectMessageSelectedProviderLocations> selectMessageSelectedProviderLocationsDaoListToProtocolSelectMessageSelectedProviderLocationsList(List<SelectMessageSelectedProviderLocationsDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedProviderLocations> list1 = new ArrayList<ProtocolSelectMessageSelectedProviderLocations>( list.size() );
        for ( SelectMessageSelectedProviderLocationsDao selectMessageSelectedProviderLocationsDao : list ) {
            list1.add( selectMessageSelectedProviderLocationsDaoToProtocolSelectMessageSelectedProviderLocations( selectMessageSelectedProviderLocationsDao ) );
        }

        return list1;
    }

    protected ProtocolSelectMessageSelectedProvider selectMessageSelectedProviderDaoToProtocolSelectMessageSelectedProvider(SelectMessageSelectedProviderDao selectMessageSelectedProviderDao) {
        if ( selectMessageSelectedProviderDao == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedProviderLocations> locations = null;
        String id = null;

        locations = selectMessageSelectedProviderLocationsDaoListToProtocolSelectMessageSelectedProviderLocationsList( selectMessageSelectedProviderDao.getLocations() );
        id = selectMessageSelectedProviderDao.getId();

        ProtocolSelectMessageSelectedProvider protocolSelectMessageSelectedProvider = new ProtocolSelectMessageSelectedProvider( id, locations );

        return protocolSelectMessageSelectedProvider;
    }

    protected ProtocolOrganization organizationDaoToProtocolOrganization(OrganizationDao organizationDao) {
        if ( organizationDao == null ) {
            return null;
        }

        String name = null;
        String cred = null;

        name = organizationDao.getName();
        cred = organizationDao.getCred();

        ProtocolOrganization protocolOrganization = new ProtocolOrganization( name, cred );

        return protocolOrganization;
    }

    protected ProtocolAddress addressDaoToProtocolAddress(AddressDao addressDao) {
        if ( addressDao == null ) {
            return null;
        }

        String door = null;
        String name = null;
        String building = null;
        String street = null;
        String locality = null;
        String ward = null;
        String city = null;
        String state = null;
        String country = null;
        String areaCode = null;

        door = addressDao.getDoor();
        name = addressDao.getName();
        building = addressDao.getBuilding();
        street = addressDao.getStreet();
        locality = addressDao.getLocality();
        ward = addressDao.getWard();
        city = addressDao.getCity();
        state = addressDao.getState();
        country = addressDao.getCountry();
        areaCode = addressDao.getAreaCode();

        ProtocolAddress protocolAddress = new ProtocolAddress( door, name, building, street, locality, ward, city, state, country, areaCode );

        return protocolAddress;
    }

    protected ProtocolTimeRange timeRangeDaoToProtocolTimeRange(TimeRangeDao timeRangeDao) {
        if ( timeRangeDao == null ) {
            return null;
        }

        OffsetDateTime start = null;
        OffsetDateTime end = null;

        start = dateMapper.map( timeRangeDao.getStart() );
        end = dateMapper.map( timeRangeDao.getEnd() );

        ProtocolTimeRange protocolTimeRange = new ProtocolTimeRange( start, end );

        return protocolTimeRange;
    }

    protected ProtocolTime timeDaoToProtocolTime(TimeDao timeDao) {
        if ( timeDao == null ) {
            return null;
        }

        String label = null;
        OffsetDateTime timestamp = null;
        String duration = null;
        ProtocolTimeRange range = null;
        String days = null;

        label = timeDao.getLabel();
        timestamp = dateMapper.map( timeDao.getTimestamp() );
        duration = timeDao.getDuration();
        range = timeRangeDaoToProtocolTimeRange( timeDao.getRange() );
        days = timeDao.getDays();

        ProtocolSchedule schedule = null;

        ProtocolTime protocolTime = new ProtocolTime( label, timestamp, duration, range, days, schedule );

        return protocolTime;
    }

    protected ProtocolBilling billingDaoToProtocolBilling(BillingDao billingDao) {
        if ( billingDao == null ) {
            return null;
        }

        String name = null;
        String phone = null;
        ProtocolOrganization organization = null;
        ProtocolAddress address = null;
        String email = null;
        ProtocolTime time = null;
        String taxNumber = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;

        name = billingDao.getName();
        phone = billingDao.getPhone();
        organization = organizationDaoToProtocolOrganization( billingDao.getOrganization() );
        address = addressDaoToProtocolAddress( billingDao.getAddress() );
        email = billingDao.getEmail();
        time = timeDaoToProtocolTime( billingDao.getTime() );
        taxNumber = billingDao.getTaxNumber();
        createdAt = billingDao.getCreatedAt();
        updatedAt = billingDao.getUpdatedAt();

        ProtocolBilling protocolBilling = new ProtocolBilling( name, phone, organization, address, email, time, taxNumber, createdAt, updatedAt );

        return protocolBilling;
    }

    protected ProtocolDescriptor descriptorDaoToProtocolDescriptor(DescriptorDao descriptorDao) {
        if ( descriptorDao == null ) {
            return null;
        }

        List<String> images = null;
        String name = null;
        String code = null;
        String symbol = null;
        String shortDesc = null;
        String longDesc = null;
        String audio = null;
        String threeDRender = null;

        List<String> list = descriptorDao.getImages();
        if ( list != null ) {
            images = new ArrayList<String>( list );
        }
        name = descriptorDao.getName();
        code = descriptorDao.getCode();
        symbol = descriptorDao.getSymbol();
        shortDesc = descriptorDao.getShortDesc();
        longDesc = descriptorDao.getLongDesc();
        audio = descriptorDao.getAudio();
        threeDRender = descriptorDao.getThreeDRender();

        ProtocolDescriptor protocolDescriptor = new ProtocolDescriptor( name, code, symbol, shortDesc, longDesc, images, audio, threeDRender );

        return protocolDescriptor;
    }

    protected ProtocolState stateDaoToProtocolState(StateDao stateDao) {
        if ( stateDao == null ) {
            return null;
        }

        ProtocolDescriptor descriptor = null;
        OffsetDateTime updatedAt = null;
        String updatedBy = null;

        descriptor = descriptorDaoToProtocolDescriptor( stateDao.getDescriptor() );
        updatedAt = stateDao.getUpdatedAt();
        updatedBy = stateDao.getUpdatedBy();

        ProtocolState protocolState = new ProtocolState( descriptor, updatedAt, updatedBy );

        return protocolState;
    }

    protected ProtocolPerson personDaoToProtocolPerson(PersonDao personDao) {
        if ( personDao == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String name = null;
        String image = null;
        LocalDate dob = null;
        String gender = null;
        String cred = null;

        Map<String, String> map = personDao.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        name = personDao.getName();
        image = personDao.getImage();
        dob = personDao.getDob();
        gender = personDao.getGender();
        cred = personDao.getCred();

        ProtocolPerson protocolPerson = new ProtocolPerson( name, image, dob, gender, cred, tags );

        return protocolPerson;
    }

    protected ProtocolVehicle vehicleDaoToProtocolVehicle(VehicleDao vehicleDao) {
        if ( vehicleDao == null ) {
            return null;
        }

        String category = null;
        Integer capacity = null;
        String make = null;
        String model = null;
        String size = null;
        String variant = null;
        String color = null;
        String energyType = null;
        String registration = null;

        category = vehicleDao.getCategory();
        capacity = vehicleDao.getCapacity();
        make = vehicleDao.getMake();
        model = vehicleDao.getModel();
        size = vehicleDao.getSize();
        variant = vehicleDao.getVariant();
        color = vehicleDao.getColor();
        energyType = vehicleDao.getEnergyType();
        registration = vehicleDao.getRegistration();

        ProtocolVehicle protocolVehicle = new ProtocolVehicle( category, capacity, make, model, size, variant, color, energyType, registration );

        return protocolVehicle;
    }

    protected ProtocolCity cityDaoToProtocolCity(CityDao cityDao) {
        if ( cityDao == null ) {
            return null;
        }

        String name = null;
        String code = null;

        name = cityDao.getName();
        code = cityDao.getCode();

        ProtocolCity protocolCity = new ProtocolCity( name, code );

        return protocolCity;
    }

    protected ProtocolCountry countryDaoToProtocolCountry(CountryDao countryDao) {
        if ( countryDao == null ) {
            return null;
        }

        String name = null;
        String code = null;

        name = countryDao.getName();
        code = countryDao.getCode();

        ProtocolCountry protocolCountry = new ProtocolCountry( name, code );

        return protocolCountry;
    }

    protected ProtocolCircle circleDaoToProtocolCircle(CircleDao circleDao) {
        if ( circleDao == null ) {
            return null;
        }

        ProtocolScalar radius = null;

        radius = scalarDaoToProtocolScalar( circleDao.getRadius() );

        ProtocolCircle protocolCircle = new ProtocolCircle( radius );

        return protocolCircle;
    }

    protected ProtocolLocation locationDaoToProtocolLocation(LocationDao locationDao) {
        if ( locationDao == null ) {
            return null;
        }

        String id = null;
        ProtocolDescriptor descriptor = null;
        String gps = null;
        ProtocolAddress address = null;
        String stationCode = null;
        ProtocolCity city = null;
        ProtocolCountry country = null;
        ProtocolCircle circle = null;
        String polygon = null;
        String dspace = null;

        id = locationDao.getId();
        descriptor = descriptorDaoToProtocolDescriptor( locationDao.getDescriptor() );
        gps = locationDao.getGps();
        address = addressDaoToProtocolAddress( locationDao.getAddress() );
        stationCode = locationDao.getStationCode();
        city = cityDaoToProtocolCity( locationDao.getCity() );
        country = countryDaoToProtocolCountry( locationDao.getCountry() );
        circle = circleDaoToProtocolCircle( locationDao.getCircle() );
        polygon = locationDao.getPolygon();
        dspace = locationDao.get3dspace();

        ProtocolLocation protocolLocation = new ProtocolLocation( id, descriptor, gps, address, stationCode, city, country, circle, polygon, dspace );

        return protocolLocation;
    }

    protected ProtocolContact contactDaoToProtocolContact(ContactDao contactDao) {
        if ( contactDao == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String phone = null;
        String email = null;

        Map<String, String> map = contactDao.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        phone = contactDao.getPhone();
        email = contactDao.getEmail();

        ProtocolContact protocolContact = new ProtocolContact( phone, email, tags );

        return protocolContact;
    }

    protected ProtocolFulfillmentStart fulfillmentStartDaoToProtocolFulfillmentStart(FulfillmentStartDao fulfillmentStartDao) {
        if ( fulfillmentStartDao == null ) {
            return null;
        }

        ProtocolLocation location = null;
        ProtocolTime time = null;
        ProtocolDescriptor instructions = null;
        ProtocolContact contact = null;

        location = locationDaoToProtocolLocation( fulfillmentStartDao.getLocation() );
        time = timeDaoToProtocolTime( fulfillmentStartDao.getTime() );
        instructions = descriptorDaoToProtocolDescriptor( fulfillmentStartDao.getInstructions() );
        contact = contactDaoToProtocolContact( fulfillmentStartDao.getContact() );

        ProtocolFulfillmentStart protocolFulfillmentStart = new ProtocolFulfillmentStart( location, time, instructions, contact );

        return protocolFulfillmentStart;
    }

    protected ProtocolFulfillmentEnd fulfillmentEndDaoToProtocolFulfillmentEnd(FulfillmentEndDao fulfillmentEndDao) {
        if ( fulfillmentEndDao == null ) {
            return null;
        }

        ProtocolLocation location = null;
        ProtocolTime time = null;
        ProtocolDescriptor instructions = null;
        ProtocolContact contact = null;

        location = locationDaoToProtocolLocation( fulfillmentEndDao.getLocation() );
        time = timeDaoToProtocolTime( fulfillmentEndDao.getTime() );
        instructions = descriptorDaoToProtocolDescriptor( fulfillmentEndDao.getInstructions() );
        contact = contactDaoToProtocolContact( fulfillmentEndDao.getContact() );

        ProtocolFulfillmentEnd protocolFulfillmentEnd = new ProtocolFulfillmentEnd( location, time, instructions, contact );

        return protocolFulfillmentEnd;
    }

    protected ProtocolCustomer customerDaoToProtocolCustomer(CustomerDao customerDao) {
        if ( customerDao == null ) {
            return null;
        }

        ProtocolPerson person = null;
        ProtocolContact contact = null;

        person = personDaoToProtocolPerson( customerDao.getPerson() );
        contact = contactDaoToProtocolContact( customerDao.getContact() );

        ProtocolCustomer protocolCustomer = new ProtocolCustomer( person, contact );

        return protocolCustomer;
    }

    protected ProtocolFulfillment fulfillmentDaoToProtocolFulfillment(FulfillmentDao fulfillmentDao) {
        if ( fulfillmentDao == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String id = null;
        String type = null;
        ProtocolState state = null;
        Boolean tracking = null;
        ProtocolPerson agent = null;
        ProtocolVehicle vehicle = null;
        ProtocolFulfillmentStart start = null;
        ProtocolFulfillmentEnd end = null;
        ProtocolCustomer customer = null;

        Map<String, String> map = fulfillmentDao.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        id = fulfillmentDao.getId();
        type = fulfillmentDao.getType();
        state = stateDaoToProtocolState( fulfillmentDao.getState() );
        tracking = fulfillmentDao.getTracking();
        agent = personDaoToProtocolPerson( fulfillmentDao.getAgent() );
        vehicle = vehicleDaoToProtocolVehicle( fulfillmentDao.getVehicle() );
        start = fulfillmentStartDaoToProtocolFulfillmentStart( fulfillmentDao.getStart() );
        end = fulfillmentEndDaoToProtocolFulfillmentEnd( fulfillmentDao.getEnd() );
        customer = customerDaoToProtocolCustomer( fulfillmentDao.getCustomer() );

        String provider_id = null;
        Integer rating = null;

        ProtocolFulfillment protocolFulfillment = new ProtocolFulfillment( id, type, state, tracking, agent, vehicle, start, end, customer, tags, provider_id, rating );

        return protocolFulfillment;
    }

    protected ProtocolPrice priceDaoToProtocolPrice(PriceDao priceDao) {
        if ( priceDao == null ) {
            return null;
        }

        String currency = null;
        String value = null;
        String estimatedValue = null;
        String computedValue = null;
        String listedValue = null;
        String offeredValue = null;
        String minimumValue = null;
        String maximumValue = null;

        currency = priceDao.getCurrency();
        value = priceDao.getValue();
        estimatedValue = priceDao.getEstimatedValue();
        computedValue = priceDao.getComputedValue();
        listedValue = priceDao.getListedValue();
        offeredValue = priceDao.getOfferedValue();
        minimumValue = priceDao.getMinimumValue();
        maximumValue = priceDao.getMaximumValue();

        ProtocolPrice protocolPrice = new ProtocolPrice( currency, value, estimatedValue, computedValue, listedValue, offeredValue, minimumValue, maximumValue );

        return protocolPrice;
    }

    protected ProtocolQuotationBreakup quotationBreakupDaoToProtocolQuotationBreakup(QuotationBreakupDao quotationBreakupDao) {
        if ( quotationBreakupDao == null ) {
            return null;
        }

        String title = null;
        ProtocolPrice price = null;

        title = quotationBreakupDao.getTitle();
        price = priceDaoToProtocolPrice( quotationBreakupDao.getPrice() );

        ProtocolQuotationBreakup protocolQuotationBreakup = new ProtocolQuotationBreakup( title, price );

        return protocolQuotationBreakup;
    }

    protected List<ProtocolQuotationBreakup> quotationBreakupDaoListToProtocolQuotationBreakupList(List<QuotationBreakupDao> list) {
        if ( list == null ) {
            return null;
        }

        List<ProtocolQuotationBreakup> list1 = new ArrayList<ProtocolQuotationBreakup>( list.size() );
        for ( QuotationBreakupDao quotationBreakupDao : list ) {
            list1.add( quotationBreakupDaoToProtocolQuotationBreakup( quotationBreakupDao ) );
        }

        return list1;
    }

    protected ProtocolQuotation quotationDaoToProtocolQuotation(QuotationDao quotationDao) {
        if ( quotationDao == null ) {
            return null;
        }

        List<ProtocolQuotationBreakup> breakup = null;
        ProtocolPrice price = null;
        String ttl = null;

        breakup = quotationBreakupDaoListToProtocolQuotationBreakupList( quotationDao.getBreakup() );
        price = priceDaoToProtocolPrice( quotationDao.getPrice() );
        ttl = quotationDao.getTtl();

        ProtocolQuotation protocolQuotation = new ProtocolQuotation( price, breakup, ttl );

        return protocolQuotation;
    }

    protected TlMethod tlMethodToTlMethod(org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod) {
        if ( tlMethod == null ) {
            return null;
        }

        TlMethod tlMethod1;

        switch ( tlMethod ) {
            case GET: tlMethod1 = TlMethod.GET;
            break;
            case POST: tlMethod1 = TlMethod.POST;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + tlMethod );
        }

        return tlMethod1;
    }

    protected org.beckn.protocol.schemas.ProtocolPayment.Type typeToType1(org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type) {
        if ( type == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolPayment.Type type1;

        switch ( type ) {
            case ONORDER: type1 = org.beckn.protocol.schemas.ProtocolPayment.Type.ONORDER;
            break;
            case PREFULFILLMENT: type1 = org.beckn.protocol.schemas.ProtocolPayment.Type.PREFULFILLMENT;
            break;
            case ONFULFILLMENT: type1 = org.beckn.protocol.schemas.ProtocolPayment.Type.ONFULFILLMENT;
            break;
            case POSTFULFILLMENT: type1 = org.beckn.protocol.schemas.ProtocolPayment.Type.POSTFULFILLMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected Status statusToStatus(org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status) {
        if ( status == null ) {
            return null;
        }

        Status status1;

        switch ( status ) {
            case PAID: status1 = Status.PAID;
            break;
            case NOTPAID: status1 = Status.NOTPAID;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + status );
        }

        return status1;
    }

    protected org.beckn.protocol.schemas.ProtocolPayment.CollectedBy collectedByToCollectedBy(CollectedBy collectedBy) {
        if ( collectedBy == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolPayment.CollectedBy collectedBy1;

        switch ( collectedBy ) {
            case BAP: collectedBy1 = org.beckn.protocol.schemas.ProtocolPayment.CollectedBy.BAP;
            break;
            case BPP: collectedBy1 = org.beckn.protocol.schemas.ProtocolPayment.CollectedBy.BPP;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + collectedBy );
        }

        return collectedBy1;
    }

    protected ProtocolPayment paymentDaoToProtocolPayment(PaymentDao paymentDao) {
        if ( paymentDao == null ) {
            return null;
        }

        Map<String, String> params = null;
        URI uri = null;
        TlMethod tlMethod = null;
        org.beckn.protocol.schemas.ProtocolPayment.Type type = null;
        Status status = null;
        ProtocolTime time = null;
        org.beckn.protocol.schemas.ProtocolPayment.CollectedBy collectedBy = null;

        Map<String, String> map = paymentDao.getParams();
        if ( map != null ) {
            params = new HashMap<String, String>( map );
        }
        uri = paymentDao.getUri();
        tlMethod = tlMethodToTlMethod( paymentDao.getTlMethod() );
        type = typeToType1( paymentDao.getType() );
        status = statusToStatus( paymentDao.getStatus() );
        time = timeDaoToProtocolTime( paymentDao.getTime() );
        collectedBy = collectedByToCollectedBy( paymentDao.getCollectedBy() );

        CollectedByStatus collectedByStatus = null;
        BuyerAppFinderFeeType buyerAppFinderFeeType = null;
        String buyerAppFinderFeeAmount = null;
        String withHoldingAmount = null;
        CollectedByStatus withHoldingAmountStatus = null;
        String returnWindow = null;
        CollectedByStatus returnWindowStatus = null;
        String settlementBasis = null;
        CollectedByStatus settlementBasisStatus = null;
        String settlementWindow = null;
        CollectedByStatus settlementWindowStatus = null;
        List<SettlementDetails> settlementDetails = null;

        ProtocolPayment protocolPayment = new ProtocolPayment( uri, tlMethod, params, type, status, time, collectedBy, collectedByStatus, buyerAppFinderFeeType, buyerAppFinderFeeAmount, withHoldingAmount, withHoldingAmountStatus, returnWindow, returnWindowStatus, settlementBasis, settlementBasisStatus, settlementWindow, settlementWindowStatus, settlementDetails );

        return protocolPayment;
    }

    protected org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType ondcCancellationTypeToOndcCancellationType(OndcCancellationType ondcCancellationType) {
        if ( ondcCancellationType == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType ondcCancellationType1;

        switch ( ondcCancellationType ) {
            case FULL: ondcCancellationType1 = org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType.FULL;
            break;
            case PARTIAL: ondcCancellationType1 = org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType.PARTIAL;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + ondcCancellationType );
        }

        return ondcCancellationType1;
    }

    protected ProtocolPolicy policyDaoToProtocolPolicy(PolicyDao policyDao) {
        if ( policyDao == null ) {
            return null;
        }

        String id = null;
        String parentPolicyId = null;
        ProtocolDescriptor descriptor = null;
        ProtocolTime time = null;

        id = policyDao.getId();
        parentPolicyId = policyDao.getParentPolicyId();
        descriptor = descriptorDaoToProtocolDescriptor( policyDao.getDescriptor() );
        time = timeDaoToProtocolTime( policyDao.getTime() );

        ProtocolPolicy protocolPolicy = new ProtocolPolicy( id, parentPolicyId, descriptor, time );

        return protocolPolicy;
    }

    protected ProtocolOption optionDaoToProtocolOption(OptionDao optionDao) {
        if ( optionDao == null ) {
            return null;
        }

        String id = null;
        ProtocolDescriptor descriptor = null;

        id = optionDao.getId();
        descriptor = descriptorDaoToProtocolDescriptor( optionDao.getDescriptor() );

        ProtocolOption protocolOption = new ProtocolOption( id, descriptor );

        return protocolOption;
    }

    protected ProtocolSelectedReason selectedReasonDaoToProtocolSelectedReason(SelectedReasonDao selectedReasonDao) {
        if ( selectedReasonDao == null ) {
            return null;
        }

        String id = null;

        id = selectedReasonDao.getId();

        ProtocolSelectedReason protocolSelectedReason = new ProtocolSelectedReason( id );

        return protocolSelectedReason;
    }

    protected ProtocolOndcOrderCancellation ondcOrderCancellationDaoToProtocolOndcOrderCancellation(OndcOrderCancellationDao ondcOrderCancellationDao) {
        if ( ondcOrderCancellationDao == null ) {
            return null;
        }

        org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType type = null;
        String refId = null;
        ProtocolPolicy policies = null;
        OffsetDateTime time = null;
        String cancelledBy = null;
        ProtocolOption reasons = null;
        ProtocolSelectedReason selectedReason = null;
        ProtocolDescriptor additionalDescription = null;

        type = ondcCancellationTypeToOndcCancellationType( ondcOrderCancellationDao.getType() );
        refId = ondcOrderCancellationDao.getRefId();
        policies = policyDaoToProtocolPolicy( ondcOrderCancellationDao.getPolicies() );
        time = ondcOrderCancellationDao.getTime();
        cancelledBy = ondcOrderCancellationDao.getCancelledBy();
        reasons = optionDaoToProtocolOption( ondcOrderCancellationDao.getReasons() );
        selectedReason = selectedReasonDaoToProtocolSelectedReason( ondcOrderCancellationDao.getSelectedReason() );
        additionalDescription = descriptorDaoToProtocolDescriptor( ondcOrderCancellationDao.getAdditionalDescription() );

        ProtocolOndcOrderCancellation protocolOndcOrderCancellation = new ProtocolOndcOrderCancellation( type, refId, policies, time, cancelledBy, reasons, selectedReason, additionalDescription );

        return protocolOndcOrderCancellation;
    }

    protected ProtocolOrder orderDaoToProtocolOrder(OrderDao orderDao) {
        if ( orderDao == null ) {
            return null;
        }

        List<ProtocolSelectMessageSelectedItems> items = null;
        List<ProtocolSelectMessageSelectedAddOns> addOns = null;
        List<ProtocolSelectMessageSelectedOffers> offers = null;
        List<ProtocolOndcLinkedOrders> ondcLinkedOrders = null;
        ProtocolSelectMessageSelectedProvider provider = null;
        ProtocolBilling billing = null;
        ProtocolFulfillment fulfillment = null;
        ProtocolQuotation quote = null;
        ProtocolPayment payment = null;
        String id = null;
        String state = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;
        ProtocolOndcOrderCancellation ondcCancellation = null;

        items = selectMessageSelectedItemsDaoListToProtocolSelectMessageSelectedItemsList( orderDao.getItems() );
        addOns = selectMessageSelectedAddOnsDaoListToProtocolSelectMessageSelectedAddOnsList( orderDao.getAddOns() );
        offers = selectMessageSelectedOffersDaoListToProtocolSelectMessageSelectedOffersList( orderDao.getOffers() );
        ondcLinkedOrders = ondcLinkedOrdersDaoListToProtocolOndcLinkedOrdersList( orderDao.getOndcLinkedOrders() );
        provider = selectMessageSelectedProviderDaoToProtocolSelectMessageSelectedProvider( orderDao.getProvider() );
        billing = billingDaoToProtocolBilling( orderDao.getBilling() );
        fulfillment = fulfillmentDaoToProtocolFulfillment( orderDao.getFulfillment() );
        quote = quotationDaoToProtocolQuotation( orderDao.getQuote() );
        payment = paymentDaoToProtocolPayment( orderDao.getPayment() );
        id = orderDao.getId();
        state = orderDao.getState();
        createdAt = orderDao.getCreatedAt();
        updatedAt = orderDao.getUpdatedAt();
        ondcCancellation = ondcOrderCancellationDaoToProtocolOndcOrderCancellation( orderDao.getOndcCancellation() );

        ProtocolOrder protocolOrder = new ProtocolOrder( provider, items, addOns, offers, billing, fulfillment, quote, payment, id, state, createdAt, updatedAt, ondcCancellation, ondcLinkedOrders );

        return protocolOrder;
    }

    protected ProtocolOnConfirmMessage onConfirmMessageDaoToProtocolOnConfirmMessage(OnConfirmMessageDao onConfirmMessageDao) {
        if ( onConfirmMessageDao == null ) {
            return null;
        }

        ProtocolOrder order = null;

        order = orderDaoToProtocolOrder( onConfirmMessageDao.getOrder() );

        ProtocolOnConfirmMessage protocolOnConfirmMessage = new ProtocolOnConfirmMessage( order );

        return protocolOnConfirmMessage;
    }

    protected org.beckn.protocol.schemas.ProtocolError.Type typeToType2(org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type type) {
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
        type = typeToType2( errorDao.getType() );
        path = errorDao.getPath();

        ProtocolError protocolError = new ProtocolError( code, message, type, path );

        return protocolError;
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

    protected Type typeToType3(org.beckn.protocol.schemas.ProtocolScalar.Type type) {
        if ( type == null ) {
            return null;
        }

        Type type1;

        switch ( type ) {
            case CONSTANT: type1 = Type.CONSTANT;
            break;
            case VARIABLE: type1 = Type.VARIABLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected ScalarRangeDao protocolScalarRangeToScalarRangeDao(ProtocolScalarRange protocolScalarRange) {
        if ( protocolScalarRange == null ) {
            return null;
        }

        BigDecimal min = null;
        BigDecimal max = null;

        min = protocolScalarRange.getMin();
        max = protocolScalarRange.getMax();

        ScalarRangeDao scalarRangeDao = new ScalarRangeDao( min, max );

        return scalarRangeDao;
    }

    protected ScalarDao protocolScalarToScalarDao(ProtocolScalar protocolScalar) {
        if ( protocolScalar == null ) {
            return null;
        }

        BigDecimal value = null;
        String unit = null;
        Type type = null;
        BigDecimal estimatedValue = null;
        BigDecimal computedValue = null;
        ScalarRangeDao range = null;

        value = protocolScalar.getValue();
        unit = protocolScalar.getUnit();
        type = typeToType3( protocolScalar.getType() );
        estimatedValue = protocolScalar.getEstimatedValue();
        computedValue = protocolScalar.getComputedValue();
        range = protocolScalarRangeToScalarRangeDao( protocolScalar.getRange() );

        ScalarDao scalarDao = new ScalarDao( value, unit, type, estimatedValue, computedValue, range );

        return scalarDao;
    }

    protected ItemQuantityAllocatedDao protocolItemQuantityAllocatedToItemQuantityAllocatedDao(ProtocolItemQuantityAllocated protocolItemQuantityAllocated) {
        if ( protocolItemQuantityAllocated == null ) {
            return null;
        }

        Integer count = null;
        ScalarDao measure = null;

        count = protocolItemQuantityAllocated.getCount();
        measure = protocolScalarToScalarDao( protocolItemQuantityAllocated.getMeasure() );

        ItemQuantityAllocatedDao itemQuantityAllocatedDao = new ItemQuantityAllocatedDao( count, measure );

        return itemQuantityAllocatedDao;
    }

    protected OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommoditiesToOndcStatutoryPackagedCommoditiesDao(OndcStatutoryPackagedCommodities ondcStatutoryPackagedCommodities) {
        if ( ondcStatutoryPackagedCommodities == null ) {
            return null;
        }

        String commonOrGenericNameOfCommodity = null;
        String contactDetailsConsumerCare = null;
        String importedProductCountryOfOrigin = null;
        String manufacturerOrPackerAddress = null;
        String manufacturerOrPackerName = null;
        String monthYearOfManufacturePackingImport = null;
        String multipleProductsNameNumberOrQty = null;
        String netQuantityOrMeasureOfCommodityInPkg = null;

        commonOrGenericNameOfCommodity = ondcStatutoryPackagedCommodities.getCommonOrGenericNameOfCommodity();
        contactDetailsConsumerCare = ondcStatutoryPackagedCommodities.getContactDetailsConsumerCare();
        importedProductCountryOfOrigin = ondcStatutoryPackagedCommodities.getImportedProductCountryOfOrigin();
        manufacturerOrPackerAddress = ondcStatutoryPackagedCommodities.getManufacturerOrPackerAddress();
        manufacturerOrPackerName = ondcStatutoryPackagedCommodities.getManufacturerOrPackerName();
        monthYearOfManufacturePackingImport = ondcStatutoryPackagedCommodities.getMonthYearOfManufacturePackingImport();
        multipleProductsNameNumberOrQty = ondcStatutoryPackagedCommodities.getMultipleProductsNameNumberOrQty();
        netQuantityOrMeasureOfCommodityInPkg = ondcStatutoryPackagedCommodities.getNetQuantityOrMeasureOfCommodityInPkg();

        OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommoditiesDao = new OndcStatutoryPackagedCommoditiesDao( commonOrGenericNameOfCommodity, contactDetailsConsumerCare, importedProductCountryOfOrigin, manufacturerOrPackerAddress, manufacturerOrPackerName, monthYearOfManufacturePackingImport, multipleProductsNameNumberOrQty, netQuantityOrMeasureOfCommodityInPkg );

        return ondcStatutoryPackagedCommoditiesDao;
    }

    protected OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFoodToOndcStatutoryPackagedFoodDao(OndcStatutoryPackagedFood ondcStatutoryPackagedFood) {
        if ( ondcStatutoryPackagedFood == null ) {
            return null;
        }

        String additivesInfo = null;
        String brandOwnerAddress = null;
        String brandOwnerFssaiLicenseNo = null;
        String brandOwnerFssaiLogo = null;
        String brandOwnerName = null;
        String contactDetailsConsumerCare = null;
        String importterProductCountryOrigin = null;
        String importerAddress = null;
        String importerFssaiLicenseNo = null;
        String importerFssaiLogo = null;
        String importerName = null;
        String ingredientsInfo = null;
        String netQuantity = null;
        String nutritionalInfo = null;
        String otherFssaiLicenseNo = null;
        String otherImporterAddress = null;
        String otherImporterCountryOrigin = null;
        String otherImporterName = null;
        String otherPremises = null;

        additivesInfo = ondcStatutoryPackagedFood.getAdditivesInfo();
        brandOwnerAddress = ondcStatutoryPackagedFood.getBrandOwnerAddress();
        brandOwnerFssaiLicenseNo = ondcStatutoryPackagedFood.getBrandOwnerFssaiLicenseNo();
        brandOwnerFssaiLogo = ondcStatutoryPackagedFood.getBrandOwnerFssaiLogo();
        brandOwnerName = ondcStatutoryPackagedFood.getBrandOwnerName();
        contactDetailsConsumerCare = ondcStatutoryPackagedFood.getContactDetailsConsumerCare();
        importterProductCountryOrigin = ondcStatutoryPackagedFood.getImportterProductCountryOrigin();
        importerAddress = ondcStatutoryPackagedFood.getImporterAddress();
        importerFssaiLicenseNo = ondcStatutoryPackagedFood.getImporterFssaiLicenseNo();
        importerFssaiLogo = ondcStatutoryPackagedFood.getImporterFssaiLogo();
        importerName = ondcStatutoryPackagedFood.getImporterName();
        ingredientsInfo = ondcStatutoryPackagedFood.getIngredientsInfo();
        netQuantity = ondcStatutoryPackagedFood.getNetQuantity();
        nutritionalInfo = ondcStatutoryPackagedFood.getNutritionalInfo();
        otherFssaiLicenseNo = ondcStatutoryPackagedFood.getOtherFssaiLicenseNo();
        otherImporterAddress = ondcStatutoryPackagedFood.getOtherImporterAddress();
        otherImporterCountryOrigin = ondcStatutoryPackagedFood.getOtherImporterCountryOrigin();
        otherImporterName = ondcStatutoryPackagedFood.getOtherImporterName();
        otherPremises = ondcStatutoryPackagedFood.getOtherPremises();

        String manufacturerPackerAddress = null;
        String manufacturerPackerName = null;

        OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFoodDao = new OndcStatutoryPackagedFoodDao( additivesInfo, brandOwnerAddress, brandOwnerFssaiLicenseNo, brandOwnerFssaiLogo, brandOwnerName, contactDetailsConsumerCare, importterProductCountryOrigin, importerAddress, importerFssaiLicenseNo, importerFssaiLogo, importerName, ingredientsInfo, manufacturerPackerAddress, manufacturerPackerName, netQuantity, nutritionalInfo, otherFssaiLicenseNo, otherImporterAddress, otherImporterCountryOrigin, otherImporterName, otherPremises );

        return ondcStatutoryPackagedFoodDao;
    }

    protected SelectMessageSelectedItemsDao protocolSelectMessageSelectedItemsToSelectMessageSelectedItemsDao(ProtocolSelectMessageSelectedItems protocolSelectMessageSelectedItems) {
        if ( protocolSelectMessageSelectedItems == null ) {
            return null;
        }

        String id = null;
        ItemQuantityAllocatedDao quantity = null;
        Boolean ondcReturnable = null;
        Boolean ondcCancellable = null;
        Boolean ondcSellerPickupReturn = null;
        String ondcReturnWindow = null;
        String ondcTimeToShip = null;
        Boolean ondcAvailableOnCod = null;
        OndcStatutoryPackagedCommoditiesDao ondcStatutoryPackagedCommodities = null;
        OndcStatutoryPackagedFoodDao ondcStatutoryPackagedFood = null;

        id = protocolSelectMessageSelectedItems.getId();
        quantity = protocolItemQuantityAllocatedToItemQuantityAllocatedDao( protocolSelectMessageSelectedItems.getQuantity() );
        ondcReturnable = protocolSelectMessageSelectedItems.getOndcReturnable();
        ondcCancellable = protocolSelectMessageSelectedItems.getOndcCancellable();
        ondcSellerPickupReturn = protocolSelectMessageSelectedItems.getOndcSellerPickupReturn();
        ondcReturnWindow = protocolSelectMessageSelectedItems.getOndcReturnWindow();
        ondcTimeToShip = protocolSelectMessageSelectedItems.getOndcTimeToShip();
        ondcAvailableOnCod = protocolSelectMessageSelectedItems.getOndcAvailableOnCod();
        ondcStatutoryPackagedCommodities = ondcStatutoryPackagedCommoditiesToOndcStatutoryPackagedCommoditiesDao( protocolSelectMessageSelectedItems.getOndcStatutoryPackagedCommodities() );
        ondcStatutoryPackagedFood = ondcStatutoryPackagedFoodToOndcStatutoryPackagedFoodDao( protocolSelectMessageSelectedItems.getOndcStatutoryPackagedFood() );

        SelectMessageSelectedItemsDao selectMessageSelectedItemsDao = new SelectMessageSelectedItemsDao( id, quantity, ondcReturnable, ondcCancellable, ondcSellerPickupReturn, ondcReturnWindow, ondcTimeToShip, ondcAvailableOnCod, ondcStatutoryPackagedCommodities, ondcStatutoryPackagedFood );

        return selectMessageSelectedItemsDao;
    }

    protected List<SelectMessageSelectedItemsDao> protocolSelectMessageSelectedItemsListToSelectMessageSelectedItemsDaoList(List<ProtocolSelectMessageSelectedItems> list) {
        if ( list == null ) {
            return null;
        }

        List<SelectMessageSelectedItemsDao> list1 = new ArrayList<SelectMessageSelectedItemsDao>( list.size() );
        for ( ProtocolSelectMessageSelectedItems protocolSelectMessageSelectedItems : list ) {
            list1.add( protocolSelectMessageSelectedItemsToSelectMessageSelectedItemsDao( protocolSelectMessageSelectedItems ) );
        }

        return list1;
    }

    protected SelectMessageSelectedAddOnsDao protocolSelectMessageSelectedAddOnsToSelectMessageSelectedAddOnsDao(ProtocolSelectMessageSelectedAddOns protocolSelectMessageSelectedAddOns) {
        if ( protocolSelectMessageSelectedAddOns == null ) {
            return null;
        }

        String id = null;

        id = protocolSelectMessageSelectedAddOns.getId();

        SelectMessageSelectedAddOnsDao selectMessageSelectedAddOnsDao = new SelectMessageSelectedAddOnsDao( id );

        return selectMessageSelectedAddOnsDao;
    }

    protected List<SelectMessageSelectedAddOnsDao> protocolSelectMessageSelectedAddOnsListToSelectMessageSelectedAddOnsDaoList(List<ProtocolSelectMessageSelectedAddOns> list) {
        if ( list == null ) {
            return null;
        }

        List<SelectMessageSelectedAddOnsDao> list1 = new ArrayList<SelectMessageSelectedAddOnsDao>( list.size() );
        for ( ProtocolSelectMessageSelectedAddOns protocolSelectMessageSelectedAddOns : list ) {
            list1.add( protocolSelectMessageSelectedAddOnsToSelectMessageSelectedAddOnsDao( protocolSelectMessageSelectedAddOns ) );
        }

        return list1;
    }

    protected SelectMessageSelectedOffersDao protocolSelectMessageSelectedOffersToSelectMessageSelectedOffersDao(ProtocolSelectMessageSelectedOffers protocolSelectMessageSelectedOffers) {
        if ( protocolSelectMessageSelectedOffers == null ) {
            return null;
        }

        String id = null;

        id = protocolSelectMessageSelectedOffers.getId();

        SelectMessageSelectedOffersDao selectMessageSelectedOffersDao = new SelectMessageSelectedOffersDao( id );

        return selectMessageSelectedOffersDao;
    }

    protected List<SelectMessageSelectedOffersDao> protocolSelectMessageSelectedOffersListToSelectMessageSelectedOffersDaoList(List<ProtocolSelectMessageSelectedOffers> list) {
        if ( list == null ) {
            return null;
        }

        List<SelectMessageSelectedOffersDao> list1 = new ArrayList<SelectMessageSelectedOffersDao>( list.size() );
        for ( ProtocolSelectMessageSelectedOffers protocolSelectMessageSelectedOffers : list ) {
            list1.add( protocolSelectMessageSelectedOffersToSelectMessageSelectedOffersDao( protocolSelectMessageSelectedOffers ) );
        }

        return list1;
    }

    protected OndcLinkedOrdersDao protocolOndcLinkedOrdersToOndcLinkedOrdersDao(ProtocolOndcLinkedOrders protocolOndcLinkedOrders) {
        if ( protocolOndcLinkedOrders == null ) {
            return null;
        }

        String id = null;

        id = protocolOndcLinkedOrders.getId();

        OndcLinkedOrdersDao ondcLinkedOrdersDao = new OndcLinkedOrdersDao( id );

        return ondcLinkedOrdersDao;
    }

    protected List<OndcLinkedOrdersDao> protocolOndcLinkedOrdersListToOndcLinkedOrdersDaoList(List<ProtocolOndcLinkedOrders> list) {
        if ( list == null ) {
            return null;
        }

        List<OndcLinkedOrdersDao> list1 = new ArrayList<OndcLinkedOrdersDao>( list.size() );
        for ( ProtocolOndcLinkedOrders protocolOndcLinkedOrders : list ) {
            list1.add( protocolOndcLinkedOrdersToOndcLinkedOrdersDao( protocolOndcLinkedOrders ) );
        }

        return list1;
    }

    protected SelectMessageSelectedProviderLocationsDao protocolSelectMessageSelectedProviderLocationsToSelectMessageSelectedProviderLocationsDao(ProtocolSelectMessageSelectedProviderLocations protocolSelectMessageSelectedProviderLocations) {
        if ( protocolSelectMessageSelectedProviderLocations == null ) {
            return null;
        }

        String id = null;

        id = protocolSelectMessageSelectedProviderLocations.getId();

        SelectMessageSelectedProviderLocationsDao selectMessageSelectedProviderLocationsDao = new SelectMessageSelectedProviderLocationsDao( id );

        return selectMessageSelectedProviderLocationsDao;
    }

    protected List<SelectMessageSelectedProviderLocationsDao> protocolSelectMessageSelectedProviderLocationsListToSelectMessageSelectedProviderLocationsDaoList(List<ProtocolSelectMessageSelectedProviderLocations> list) {
        if ( list == null ) {
            return null;
        }

        List<SelectMessageSelectedProviderLocationsDao> list1 = new ArrayList<SelectMessageSelectedProviderLocationsDao>( list.size() );
        for ( ProtocolSelectMessageSelectedProviderLocations protocolSelectMessageSelectedProviderLocations : list ) {
            list1.add( protocolSelectMessageSelectedProviderLocationsToSelectMessageSelectedProviderLocationsDao( protocolSelectMessageSelectedProviderLocations ) );
        }

        return list1;
    }

    protected SelectMessageSelectedProviderDao protocolSelectMessageSelectedProviderToSelectMessageSelectedProviderDao(ProtocolSelectMessageSelectedProvider protocolSelectMessageSelectedProvider) {
        if ( protocolSelectMessageSelectedProvider == null ) {
            return null;
        }

        List<SelectMessageSelectedProviderLocationsDao> locations = null;
        String id = null;

        locations = protocolSelectMessageSelectedProviderLocationsListToSelectMessageSelectedProviderLocationsDaoList( protocolSelectMessageSelectedProvider.getLocations() );
        id = protocolSelectMessageSelectedProvider.getId();

        SelectMessageSelectedProviderDao selectMessageSelectedProviderDao = new SelectMessageSelectedProviderDao( id, locations );

        return selectMessageSelectedProviderDao;
    }

    protected OrganizationDao protocolOrganizationToOrganizationDao(ProtocolOrganization protocolOrganization) {
        if ( protocolOrganization == null ) {
            return null;
        }

        String name = null;
        String cred = null;

        name = protocolOrganization.getName();
        cred = protocolOrganization.getCred();

        OrganizationDao organizationDao = new OrganizationDao( name, cred );

        return organizationDao;
    }

    protected AddressDao protocolAddressToAddressDao(ProtocolAddress protocolAddress) {
        if ( protocolAddress == null ) {
            return null;
        }

        String door = null;
        String name = null;
        String building = null;
        String street = null;
        String locality = null;
        String ward = null;
        String city = null;
        String state = null;
        String country = null;
        String areaCode = null;

        door = protocolAddress.getDoor();
        name = protocolAddress.getName();
        building = protocolAddress.getBuilding();
        street = protocolAddress.getStreet();
        locality = protocolAddress.getLocality();
        ward = protocolAddress.getWard();
        city = protocolAddress.getCity();
        state = protocolAddress.getState();
        country = protocolAddress.getCountry();
        areaCode = protocolAddress.getAreaCode();

        AddressDao addressDao = new AddressDao( door, name, building, street, locality, ward, city, state, country, areaCode );

        return addressDao;
    }

    protected TimeRangeDao protocolTimeRangeToTimeRangeDao(ProtocolTimeRange protocolTimeRange) {
        if ( protocolTimeRange == null ) {
            return null;
        }

        Instant start = null;
        Instant end = null;

        start = dateMapper.map( protocolTimeRange.getStart() );
        end = dateMapper.map( protocolTimeRange.getEnd() );

        TimeRangeDao timeRangeDao = new TimeRangeDao( start, end );

        return timeRangeDao;
    }

    protected TimeDao protocolTimeToTimeDao(ProtocolTime protocolTime) {
        if ( protocolTime == null ) {
            return null;
        }

        String label = null;
        Instant timestamp = null;
        String duration = null;
        TimeRangeDao range = null;
        String days = null;

        label = protocolTime.getLabel();
        timestamp = dateMapper.map( protocolTime.getTimestamp() );
        duration = protocolTime.getDuration();
        range = protocolTimeRangeToTimeRangeDao( protocolTime.getRange() );
        days = protocolTime.getDays();

        TimeDao timeDao = new TimeDao( label, timestamp, duration, range, days );

        return timeDao;
    }

    protected BillingDao protocolBillingToBillingDao(ProtocolBilling protocolBilling) {
        if ( protocolBilling == null ) {
            return null;
        }

        String name = null;
        String phone = null;
        OrganizationDao organization = null;
        AddressDao address = null;
        String email = null;
        TimeDao time = null;
        String taxNumber = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;

        name = protocolBilling.getName();
        phone = protocolBilling.getPhone();
        organization = protocolOrganizationToOrganizationDao( protocolBilling.getOrganization() );
        address = protocolAddressToAddressDao( protocolBilling.getAddress() );
        email = protocolBilling.getEmail();
        time = protocolTimeToTimeDao( protocolBilling.getTime() );
        taxNumber = protocolBilling.getTaxNumber();
        createdAt = protocolBilling.getCreatedAt();
        updatedAt = protocolBilling.getUpdatedAt();

        String id = null;
        String locationId = null;

        BillingDao billingDao = new BillingDao( id, name, phone, organization, address, email, time, taxNumber, createdAt, updatedAt, locationId );

        return billingDao;
    }

    protected DescriptorDao protocolDescriptorToDescriptorDao(ProtocolDescriptor protocolDescriptor) {
        if ( protocolDescriptor == null ) {
            return null;
        }

        List<String> images = null;
        String name = null;
        String code = null;
        String symbol = null;
        String shortDesc = null;
        String longDesc = null;
        String audio = null;
        String threeDRender = null;

        List<String> list = protocolDescriptor.getImages();
        if ( list != null ) {
            images = new ArrayList<String>( list );
        }
        name = protocolDescriptor.getName();
        code = protocolDescriptor.getCode();
        symbol = protocolDescriptor.getSymbol();
        shortDesc = protocolDescriptor.getShortDesc();
        longDesc = protocolDescriptor.getLongDesc();
        audio = protocolDescriptor.getAudio();
        threeDRender = protocolDescriptor.getThreeDRender();

        DescriptorDao descriptorDao = new DescriptorDao( name, code, symbol, shortDesc, longDesc, images, audio, threeDRender );

        return descriptorDao;
    }

    protected StateDao protocolStateToStateDao(ProtocolState protocolState) {
        if ( protocolState == null ) {
            return null;
        }

        DescriptorDao descriptor = null;
        OffsetDateTime updatedAt = null;
        String updatedBy = null;

        descriptor = protocolDescriptorToDescriptorDao( protocolState.getDescriptor() );
        updatedAt = protocolState.getUpdatedAt();
        updatedBy = protocolState.getUpdatedBy();

        StateDao stateDao = new StateDao( descriptor, updatedAt, updatedBy );

        return stateDao;
    }

    protected PersonDao protocolPersonToPersonDao(ProtocolPerson protocolPerson) {
        if ( protocolPerson == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String name = null;
        String image = null;
        LocalDate dob = null;
        String gender = null;
        String cred = null;

        Map<String, String> map = protocolPerson.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        name = protocolPerson.getName();
        image = protocolPerson.getImage();
        dob = protocolPerson.getDob();
        gender = protocolPerson.getGender();
        cred = protocolPerson.getCred();

        PersonDao personDao = new PersonDao( name, image, dob, gender, cred, tags );

        return personDao;
    }

    protected VehicleDao protocolVehicleToVehicleDao(ProtocolVehicle protocolVehicle) {
        if ( protocolVehicle == null ) {
            return null;
        }

        String category = null;
        Integer capacity = null;
        String make = null;
        String model = null;
        String size = null;
        String variant = null;
        String color = null;
        String energyType = null;
        String registration = null;

        category = protocolVehicle.getCategory();
        capacity = protocolVehicle.getCapacity();
        make = protocolVehicle.getMake();
        model = protocolVehicle.getModel();
        size = protocolVehicle.getSize();
        variant = protocolVehicle.getVariant();
        color = protocolVehicle.getColor();
        energyType = protocolVehicle.getEnergyType();
        registration = protocolVehicle.getRegistration();

        VehicleDao vehicleDao = new VehicleDao( category, capacity, make, model, size, variant, color, energyType, registration );

        return vehicleDao;
    }

    protected CityDao protocolCityToCityDao(ProtocolCity protocolCity) {
        if ( protocolCity == null ) {
            return null;
        }

        String name = null;
        String code = null;

        name = protocolCity.getName();
        code = protocolCity.getCode();

        CityDao cityDao = new CityDao( name, code );

        return cityDao;
    }

    protected CountryDao protocolCountryToCountryDao(ProtocolCountry protocolCountry) {
        if ( protocolCountry == null ) {
            return null;
        }

        String name = null;
        String code = null;

        name = protocolCountry.getName();
        code = protocolCountry.getCode();

        CountryDao countryDao = new CountryDao( name, code );

        return countryDao;
    }

    protected CircleDao protocolCircleToCircleDao(ProtocolCircle protocolCircle) {
        if ( protocolCircle == null ) {
            return null;
        }

        ScalarDao radius = null;

        radius = protocolScalarToScalarDao( protocolCircle.getRadius() );

        CircleDao circleDao = new CircleDao( radius );

        return circleDao;
    }

    protected LocationDao protocolLocationToLocationDao(ProtocolLocation protocolLocation) {
        if ( protocolLocation == null ) {
            return null;
        }

        String id = null;
        DescriptorDao descriptor = null;
        String gps = null;
        AddressDao address = null;
        String stationCode = null;
        CityDao city = null;
        CountryDao country = null;
        CircleDao circle = null;
        String polygon = null;

        id = protocolLocation.getId();
        descriptor = protocolDescriptorToDescriptorDao( protocolLocation.getDescriptor() );
        gps = protocolLocation.getGps();
        address = protocolAddressToAddressDao( protocolLocation.getAddress() );
        stationCode = protocolLocation.getStationCode();
        city = protocolCityToCityDao( protocolLocation.getCity() );
        country = protocolCountryToCountryDao( protocolLocation.getCountry() );
        circle = protocolCircleToCircleDao( protocolLocation.getCircle() );
        polygon = protocolLocation.getPolygon();

        String p9_495300234 = null;

        LocationDao locationDao = new LocationDao( id, descriptor, gps, address, stationCode, city, country, circle, polygon, p9_495300234 );

        return locationDao;
    }

    protected ContactDao protocolContactToContactDao(ProtocolContact protocolContact) {
        if ( protocolContact == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String phone = null;
        String email = null;

        Map<String, String> map = protocolContact.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        phone = protocolContact.getPhone();
        email = protocolContact.getEmail();

        ContactDao contactDao = new ContactDao( phone, email, tags );

        return contactDao;
    }

    protected FulfillmentStartDao protocolFulfillmentStartToFulfillmentStartDao(ProtocolFulfillmentStart protocolFulfillmentStart) {
        if ( protocolFulfillmentStart == null ) {
            return null;
        }

        LocationDao location = null;
        TimeDao time = null;
        DescriptorDao instructions = null;
        ContactDao contact = null;

        location = protocolLocationToLocationDao( protocolFulfillmentStart.getLocation() );
        time = protocolTimeToTimeDao( protocolFulfillmentStart.getTime() );
        instructions = protocolDescriptorToDescriptorDao( protocolFulfillmentStart.getInstructions() );
        contact = protocolContactToContactDao( protocolFulfillmentStart.getContact() );

        FulfillmentStartDao fulfillmentStartDao = new FulfillmentStartDao( location, time, instructions, contact );

        return fulfillmentStartDao;
    }

    protected FulfillmentEndDao protocolFulfillmentEndToFulfillmentEndDao(ProtocolFulfillmentEnd protocolFulfillmentEnd) {
        if ( protocolFulfillmentEnd == null ) {
            return null;
        }

        LocationDao location = null;
        TimeDao time = null;
        DescriptorDao instructions = null;
        ContactDao contact = null;

        location = protocolLocationToLocationDao( protocolFulfillmentEnd.getLocation() );
        time = protocolTimeToTimeDao( protocolFulfillmentEnd.getTime() );
        instructions = protocolDescriptorToDescriptorDao( protocolFulfillmentEnd.getInstructions() );
        contact = protocolContactToContactDao( protocolFulfillmentEnd.getContact() );

        FulfillmentEndDao fulfillmentEndDao = new FulfillmentEndDao( location, time, instructions, contact );

        return fulfillmentEndDao;
    }

    protected CustomerDao protocolCustomerToCustomerDao(ProtocolCustomer protocolCustomer) {
        if ( protocolCustomer == null ) {
            return null;
        }

        PersonDao person = null;
        ContactDao contact = null;

        person = protocolPersonToPersonDao( protocolCustomer.getPerson() );
        contact = protocolContactToContactDao( protocolCustomer.getContact() );

        CustomerDao customerDao = new CustomerDao( person, contact );

        return customerDao;
    }

    protected FulfillmentDao protocolFulfillmentToFulfillmentDao(ProtocolFulfillment protocolFulfillment) {
        if ( protocolFulfillment == null ) {
            return null;
        }

        Map<String, String> tags = null;
        String id = null;
        String type = null;
        StateDao state = null;
        Boolean tracking = null;
        PersonDao agent = null;
        VehicleDao vehicle = null;
        FulfillmentStartDao start = null;
        FulfillmentEndDao end = null;
        CustomerDao customer = null;

        Map<String, String> map = protocolFulfillment.getTags();
        if ( map != null ) {
            tags = new HashMap<String, String>( map );
        }
        id = protocolFulfillment.getId();
        type = protocolFulfillment.getType();
        state = protocolStateToStateDao( protocolFulfillment.getState() );
        tracking = protocolFulfillment.getTracking();
        agent = protocolPersonToPersonDao( protocolFulfillment.getAgent() );
        vehicle = protocolVehicleToVehicleDao( protocolFulfillment.getVehicle() );
        start = protocolFulfillmentStartToFulfillmentStartDao( protocolFulfillment.getStart() );
        end = protocolFulfillmentEndToFulfillmentEndDao( protocolFulfillment.getEnd() );
        customer = protocolCustomerToCustomerDao( protocolFulfillment.getCustomer() );

        String purpose = null;

        FulfillmentDao fulfillmentDao = new FulfillmentDao( id, type, state, tracking, agent, vehicle, start, end, purpose, customer, tags );

        return fulfillmentDao;
    }

    protected PriceDao protocolPriceToPriceDao(ProtocolPrice protocolPrice) {
        if ( protocolPrice == null ) {
            return null;
        }

        String currency = null;
        String value = null;
        String estimatedValue = null;
        String computedValue = null;
        String listedValue = null;
        String offeredValue = null;
        String minimumValue = null;
        String maximumValue = null;

        currency = protocolPrice.getCurrency();
        value = protocolPrice.getValue();
        estimatedValue = protocolPrice.getEstimatedValue();
        computedValue = protocolPrice.getComputedValue();
        listedValue = protocolPrice.getListedValue();
        offeredValue = protocolPrice.getOfferedValue();
        minimumValue = protocolPrice.getMinimumValue();
        maximumValue = protocolPrice.getMaximumValue();

        PriceDao priceDao = new PriceDao( currency, value, estimatedValue, computedValue, listedValue, offeredValue, minimumValue, maximumValue );

        return priceDao;
    }

    protected QuotationBreakupDao protocolQuotationBreakupToQuotationBreakupDao(ProtocolQuotationBreakup protocolQuotationBreakup) {
        if ( protocolQuotationBreakup == null ) {
            return null;
        }

        String title = null;
        PriceDao price = null;

        title = protocolQuotationBreakup.getTitle();
        price = protocolPriceToPriceDao( protocolQuotationBreakup.getPrice() );

        org.beckn.one.sandbox.bap.message.entities.QuotationBreakupDao.Type type = null;
        String refId = null;

        QuotationBreakupDao quotationBreakupDao = new QuotationBreakupDao( type, refId, title, price );

        return quotationBreakupDao;
    }

    protected List<QuotationBreakupDao> protocolQuotationBreakupListToQuotationBreakupDaoList(List<ProtocolQuotationBreakup> list) {
        if ( list == null ) {
            return null;
        }

        List<QuotationBreakupDao> list1 = new ArrayList<QuotationBreakupDao>( list.size() );
        for ( ProtocolQuotationBreakup protocolQuotationBreakup : list ) {
            list1.add( protocolQuotationBreakupToQuotationBreakupDao( protocolQuotationBreakup ) );
        }

        return list1;
    }

    protected QuotationDao protocolQuotationToQuotationDao(ProtocolQuotation protocolQuotation) {
        if ( protocolQuotation == null ) {
            return null;
        }

        List<QuotationBreakupDao> breakup = null;
        PriceDao price = null;
        String ttl = null;

        breakup = protocolQuotationBreakupListToQuotationBreakupDaoList( protocolQuotation.getBreakup() );
        price = protocolPriceToPriceDao( protocolQuotation.getPrice() );
        ttl = protocolQuotation.getTtl();

        QuotationDao quotationDao = new QuotationDao( price, breakup, ttl );

        return quotationDao;
    }

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethodToTlMethod1(TlMethod tlMethod) {
        if ( tlMethod == null ) {
            return null;
        }

        org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod1;

        switch ( tlMethod ) {
            case GET: tlMethod1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod.GET;
            break;
            case POST: tlMethod1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod.POST;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + tlMethod );
        }

        return tlMethod1;
    }

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type typeToType4(org.beckn.protocol.schemas.ProtocolPayment.Type type) {
        if ( type == null ) {
            return null;
        }

        org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type1;

        switch ( type ) {
            case ONORDER: type1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type.ONORDER;
            break;
            case PREFULFILLMENT: type1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type.PREFULFILLMENT;
            break;
            case ONFULFILLMENT: type1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type.ONFULFILLMENT;
            break;
            case POSTFULFILLMENT: type1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type.POSTFULFILLMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status statusToStatus1(Status status) {
        if ( status == null ) {
            return null;
        }

        org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status1;

        switch ( status ) {
            case PAID: status1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status.PAID;
            break;
            case NOTPAID: status1 = org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status.NOTPAID;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + status );
        }

        return status1;
    }

    protected CollectedBy collectedByToCollectedBy1(org.beckn.protocol.schemas.ProtocolPayment.CollectedBy collectedBy) {
        if ( collectedBy == null ) {
            return null;
        }

        CollectedBy collectedBy1;

        switch ( collectedBy ) {
            case BAP: collectedBy1 = CollectedBy.BAP;
            break;
            case BPP: collectedBy1 = CollectedBy.BPP;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + collectedBy );
        }

        return collectedBy1;
    }

    protected PaymentDao protocolPaymentToPaymentDao(ProtocolPayment protocolPayment) {
        if ( protocolPayment == null ) {
            return null;
        }

        Map<String, String> params = null;
        URI uri = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethod = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type type = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status status = null;
        TimeDao time = null;
        CollectedBy collectedBy = null;

        Map<String, String> map = protocolPayment.getParams();
        if ( map != null ) {
            params = new HashMap<String, String>( map );
        }
        uri = protocolPayment.getUri();
        tlMethod = tlMethodToTlMethod1( protocolPayment.getTlMethod() );
        type = typeToType4( protocolPayment.getType() );
        status = statusToStatus1( protocolPayment.getStatus() );
        time = protocolTimeToTimeDao( protocolPayment.getTime() );
        collectedBy = collectedByToCollectedBy1( protocolPayment.getCollectedBy() );

        org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcCollectedByStatus = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType ondcBuyerAppFinderFeeType = null;
        String ondcBuyerAppFinderFeeAmount = null;
        String ondcWithHoldingAmount = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcWithHoldingAmountStatus = null;
        String ondcReturnWindow = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcReturnWindowStatus = null;
        String ondcSettlementBasis = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementBasisStatus = null;
        String ondcSettlementWindow = null;
        org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus ondcSettlementWindowStatus = null;
        List<SettlementDetailsDao> ondcSettlementDetails = null;

        PaymentDao paymentDao = new PaymentDao( uri, tlMethod, params, type, status, time, collectedBy, ondcCollectedByStatus, ondcBuyerAppFinderFeeType, ondcBuyerAppFinderFeeAmount, ondcWithHoldingAmount, ondcWithHoldingAmountStatus, ondcReturnWindow, ondcReturnWindowStatus, ondcSettlementBasis, ondcSettlementBasisStatus, ondcSettlementWindow, ondcSettlementWindowStatus, ondcSettlementDetails );

        return paymentDao;
    }

    protected OndcCancellationType ondcCancellationTypeToOndcCancellationType1(org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType ondcCancellationType) {
        if ( ondcCancellationType == null ) {
            return null;
        }

        OndcCancellationType ondcCancellationType1;

        switch ( ondcCancellationType ) {
            case FULL: ondcCancellationType1 = OndcCancellationType.FULL;
            break;
            case PARTIAL: ondcCancellationType1 = OndcCancellationType.PARTIAL;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + ondcCancellationType );
        }

        return ondcCancellationType1;
    }

    protected PolicyDao protocolPolicyToPolicyDao(ProtocolPolicy protocolPolicy) {
        if ( protocolPolicy == null ) {
            return null;
        }

        String id = null;
        String parentPolicyId = null;
        DescriptorDao descriptor = null;
        TimeDao time = null;

        id = protocolPolicy.getId();
        parentPolicyId = protocolPolicy.getParentPolicyId();
        descriptor = protocolDescriptorToDescriptorDao( protocolPolicy.getDescriptor() );
        time = protocolTimeToTimeDao( protocolPolicy.getTime() );

        PolicyDao policyDao = new PolicyDao( id, parentPolicyId, descriptor, time );

        return policyDao;
    }

    protected OptionDao protocolOptionToOptionDao(ProtocolOption protocolOption) {
        if ( protocolOption == null ) {
            return null;
        }

        String id = null;
        DescriptorDao descriptor = null;

        id = protocolOption.getId();
        descriptor = protocolDescriptorToDescriptorDao( protocolOption.getDescriptor() );

        OptionDao optionDao = new OptionDao( id, descriptor );

        return optionDao;
    }

    protected SelectedReasonDao protocolSelectedReasonToSelectedReasonDao(ProtocolSelectedReason protocolSelectedReason) {
        if ( protocolSelectedReason == null ) {
            return null;
        }

        String id = null;

        id = protocolSelectedReason.getId();

        SelectedReasonDao selectedReasonDao = new SelectedReasonDao( id );

        return selectedReasonDao;
    }

    protected OndcOrderCancellationDao protocolOndcOrderCancellationToOndcOrderCancellationDao(ProtocolOndcOrderCancellation protocolOndcOrderCancellation) {
        if ( protocolOndcOrderCancellation == null ) {
            return null;
        }

        OndcCancellationType type = null;
        String refId = null;
        PolicyDao policies = null;
        OffsetDateTime time = null;
        String cancelledBy = null;
        OptionDao reasons = null;
        SelectedReasonDao selectedReason = null;
        DescriptorDao additionalDescription = null;

        type = ondcCancellationTypeToOndcCancellationType1( protocolOndcOrderCancellation.getType() );
        refId = protocolOndcOrderCancellation.getRefId();
        policies = protocolPolicyToPolicyDao( protocolOndcOrderCancellation.getPolicies() );
        time = protocolOndcOrderCancellation.getTime();
        cancelledBy = protocolOndcOrderCancellation.getCancelledBy();
        reasons = protocolOptionToOptionDao( protocolOndcOrderCancellation.getReasons() );
        selectedReason = protocolSelectedReasonToSelectedReasonDao( protocolOndcOrderCancellation.getSelectedReason() );
        additionalDescription = protocolDescriptorToDescriptorDao( protocolOndcOrderCancellation.getAdditionalDescription() );

        OndcOrderCancellationDao ondcOrderCancellationDao = new OndcOrderCancellationDao( type, refId, policies, time, cancelledBy, reasons, selectedReason, additionalDescription );

        return ondcOrderCancellationDao;
    }

    protected OrderDao protocolOrderToOrderDao(ProtocolOrder protocolOrder) {
        if ( protocolOrder == null ) {
            return null;
        }

        List<SelectMessageSelectedItemsDao> items = null;
        List<SelectMessageSelectedAddOnsDao> addOns = null;
        List<SelectMessageSelectedOffersDao> offers = null;
        List<OndcLinkedOrdersDao> ondcLinkedOrders = null;
        SelectMessageSelectedProviderDao provider = null;
        BillingDao billing = null;
        FulfillmentDao fulfillment = null;
        QuotationDao quote = null;
        PaymentDao payment = null;
        String id = null;
        String state = null;
        OffsetDateTime createdAt = null;
        OffsetDateTime updatedAt = null;
        OndcOrderCancellationDao ondcCancellation = null;

        items = protocolSelectMessageSelectedItemsListToSelectMessageSelectedItemsDaoList( protocolOrder.getItems() );
        addOns = protocolSelectMessageSelectedAddOnsListToSelectMessageSelectedAddOnsDaoList( protocolOrder.getAddOns() );
        offers = protocolSelectMessageSelectedOffersListToSelectMessageSelectedOffersDaoList( protocolOrder.getOffers() );
        ondcLinkedOrders = protocolOndcLinkedOrdersListToOndcLinkedOrdersDaoList( protocolOrder.getOndcLinkedOrders() );
        provider = protocolSelectMessageSelectedProviderToSelectMessageSelectedProviderDao( protocolOrder.getProvider() );
        billing = protocolBillingToBillingDao( protocolOrder.getBilling() );
        fulfillment = protocolFulfillmentToFulfillmentDao( protocolOrder.getFulfillment() );
        quote = protocolQuotationToQuotationDao( protocolOrder.getQuote() );
        payment = protocolPaymentToPaymentDao( protocolOrder.getPayment() );
        id = protocolOrder.getId();
        state = protocolOrder.getState();
        createdAt = protocolOrder.getCreatedAt();
        updatedAt = protocolOrder.getUpdatedAt();
        ondcCancellation = protocolOndcOrderCancellationToOndcOrderCancellationDao( protocolOrder.getOndcCancellation() );

        ContextDao context = null;
        ErrorDao error = null;
        String userId = null;
        String transactionId = null;
        String messageId = null;
        String parentOrderId = null;

        OrderDao orderDao = new OrderDao( provider, items, addOns, offers, billing, fulfillment, quote, payment, id, state, createdAt, updatedAt, context, error, userId, transactionId, messageId, parentOrderId, ondcCancellation, ondcLinkedOrders );

        return orderDao;
    }

    protected OnConfirmMessageDao protocolOnConfirmMessageToOnConfirmMessageDao(ProtocolOnConfirmMessage protocolOnConfirmMessage) {
        if ( protocolOnConfirmMessage == null ) {
            return null;
        }

        OrderDao order = null;

        order = protocolOrderToOrderDao( protocolOnConfirmMessage.getOrder() );

        OnConfirmMessageDao onConfirmMessageDao = new OnConfirmMessageDao( order );

        return onConfirmMessageDao;
    }

    protected org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type typeToType5(org.beckn.protocol.schemas.ProtocolError.Type type) {
        if ( type == null ) {
            return null;
        }

        org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type type1;

        switch ( type ) {
            case CONTEXTERROR: type1 = org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type.CONTEXTERROR;
            break;
            case COREERROR: type1 = org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type.COREERROR;
            break;
            case DOMAINERROR: type1 = org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type.DOMAINERROR;
            break;
            case POLICYERROR: type1 = org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type.POLICYERROR;
            break;
            case JSONSCHEMAERROR: type1 = org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type.JSONSCHEMAERROR;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return type1;
    }

    protected ErrorDao protocolErrorToErrorDao(ProtocolError protocolError) {
        if ( protocolError == null ) {
            return null;
        }

        org.beckn.one.sandbox.bap.message.entities.ErrorDao.Type type = null;
        String code = null;
        String path = null;
        String message = null;

        type = typeToType5( protocolError.getType() );
        code = protocolError.getCode();
        path = protocolError.getPath();
        message = protocolError.getMessage();

        ErrorDao errorDao = new ErrorDao( type, code, path, message );

        return errorDao;
    }
}
