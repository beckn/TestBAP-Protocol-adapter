package org.beckn.one.sandbox.bap.message.mappers;

import java.math.BigDecimal;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.beckn.one.sandbox.bap.message.entities.AddressDao;
import org.beckn.one.sandbox.bap.message.entities.BillingDao;
import org.beckn.one.sandbox.bap.message.entities.CircleDao;
import org.beckn.one.sandbox.bap.message.entities.CityDao;
import org.beckn.one.sandbox.bap.message.entities.ContactDao;
import org.beckn.one.sandbox.bap.message.entities.ContextDao;
import org.beckn.one.sandbox.bap.message.entities.CountryDao;
import org.beckn.one.sandbox.bap.message.entities.CustomerDao;
import org.beckn.one.sandbox.bap.message.entities.DescriptorDao;
import org.beckn.one.sandbox.bap.message.entities.ErrorDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentEndDao;
import org.beckn.one.sandbox.bap.message.entities.FulfillmentStartDao;
import org.beckn.one.sandbox.bap.message.entities.ItemQuantityAllocatedDao;
import org.beckn.one.sandbox.bap.message.entities.LocationDao;
import org.beckn.one.sandbox.bap.message.entities.OndcLinkedOrdersDao;
import org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao;
import org.beckn.one.sandbox.bap.message.entities.OndcOrderCancellationDao.OndcCancellationType;
import org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedCommoditiesDao;
import org.beckn.one.sandbox.bap.message.entities.OndcStatutoryPackagedFoodDao;
import org.beckn.one.sandbox.bap.message.entities.OptionDao;
import org.beckn.one.sandbox.bap.message.entities.OrderDao;
import org.beckn.one.sandbox.bap.message.entities.OrganizationDao;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao.BuyerAppFinderFeeType;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedBy;
import org.beckn.one.sandbox.bap.message.entities.PaymentDao.CollectedByStatus;
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
import org.beckn.protocol.schemas.ProtocolCountry;
import org.beckn.protocol.schemas.ProtocolCustomer;
import org.beckn.protocol.schemas.ProtocolDescriptor;
import org.beckn.protocol.schemas.ProtocolFulfillment;
import org.beckn.protocol.schemas.ProtocolFulfillmentEnd;
import org.beckn.protocol.schemas.ProtocolFulfillmentStart;
import org.beckn.protocol.schemas.ProtocolItemQuantityAllocated;
import org.beckn.protocol.schemas.ProtocolLocation;
import org.beckn.protocol.schemas.ProtocolOndcLinkedOrders;
import org.beckn.protocol.schemas.ProtocolOndcOrderCancellation;
import org.beckn.protocol.schemas.ProtocolOption;
import org.beckn.protocol.schemas.ProtocolOrder;
import org.beckn.protocol.schemas.ProtocolOrganization;
import org.beckn.protocol.schemas.ProtocolPayment;
import org.beckn.protocol.schemas.ProtocolPayment.Status;
import org.beckn.protocol.schemas.ProtocolPayment.TlMethod;
import org.beckn.protocol.schemas.ProtocolPerson;
import org.beckn.protocol.schemas.ProtocolPolicy;
import org.beckn.protocol.schemas.ProtocolPrice;
import org.beckn.protocol.schemas.ProtocolQuotation;
import org.beckn.protocol.schemas.ProtocolQuotationBreakup;
import org.beckn.protocol.schemas.ProtocolScalar;
import org.beckn.protocol.schemas.ProtocolScalarRange;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T15:45:11+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class OnOrderProtocolToEntityOrderImpl implements OnOrderProtocolToEntityOrder {

    private final DateMapper dateMapper;

    @Autowired
    public OnOrderProtocolToEntityOrderImpl(DateMapper dateMapper) {

        this.dateMapper = dateMapper;
    }

    @Override
    public OrderDao protocolToEntity(ProtocolOrder entity) {
        if ( entity == null ) {
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

        items = protocolSelectMessageSelectedItemsListToSelectMessageSelectedItemsDaoList( entity.getItems() );
        addOns = protocolSelectMessageSelectedAddOnsListToSelectMessageSelectedAddOnsDaoList( entity.getAddOns() );
        offers = protocolSelectMessageSelectedOffersListToSelectMessageSelectedOffersDaoList( entity.getOffers() );
        ondcLinkedOrders = protocolOndcLinkedOrdersListToOndcLinkedOrdersDaoList( entity.getOndcLinkedOrders() );
        provider = protocolSelectMessageSelectedProviderToSelectMessageSelectedProviderDao( entity.getProvider() );
        billing = protocolBillingToBillingDao( entity.getBilling() );
        fulfillment = protocolFulfillmentToFulfillmentDao( entity.getFulfillment() );
        quote = protocolQuotationToQuotationDao( entity.getQuote() );
        payment = protocolPaymentToPaymentDao( entity.getPayment() );
        id = entity.getId();
        state = entity.getState();
        createdAt = entity.getCreatedAt();
        updatedAt = entity.getUpdatedAt();
        ondcCancellation = protocolOndcOrderCancellationToOndcOrderCancellationDao( entity.getOndcCancellation() );

        ContextDao context = null;
        ErrorDao error = null;
        String userId = null;
        String transactionId = null;
        String messageId = null;
        String parentOrderId = null;

        OrderDao orderDao = new OrderDao( provider, items, addOns, offers, billing, fulfillment, quote, payment, id, state, createdAt, updatedAt, context, error, userId, transactionId, messageId, parentOrderId, ondcCancellation, ondcLinkedOrders );

        return orderDao;
    }

    protected Type typeToType(org.beckn.protocol.schemas.ProtocolScalar.Type type) {
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
        type = typeToType( protocolScalar.getType() );
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

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.TlMethod tlMethodToTlMethod(TlMethod tlMethod) {
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

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.Type typeToType1(org.beckn.protocol.schemas.ProtocolPayment.Type type) {
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

    protected org.beckn.one.sandbox.bap.message.entities.PaymentDao.Status statusToStatus(Status status) {
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

    protected CollectedBy collectedByToCollectedBy(org.beckn.protocol.schemas.ProtocolPayment.CollectedBy collectedBy) {
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
        tlMethod = tlMethodToTlMethod( protocolPayment.getTlMethod() );
        type = typeToType1( protocolPayment.getType() );
        status = statusToStatus( protocolPayment.getStatus() );
        time = protocolTimeToTimeDao( protocolPayment.getTime() );
        collectedBy = collectedByToCollectedBy( protocolPayment.getCollectedBy() );

        CollectedByStatus ondcCollectedByStatus = null;
        BuyerAppFinderFeeType ondcBuyerAppFinderFeeType = null;
        String ondcBuyerAppFinderFeeAmount = null;
        String ondcWithHoldingAmount = null;
        CollectedByStatus ondcWithHoldingAmountStatus = null;
        String ondcReturnWindow = null;
        CollectedByStatus ondcReturnWindowStatus = null;
        String ondcSettlementBasis = null;
        CollectedByStatus ondcSettlementBasisStatus = null;
        String ondcSettlementWindow = null;
        CollectedByStatus ondcSettlementWindowStatus = null;
        List<SettlementDetailsDao> ondcSettlementDetails = null;

        PaymentDao paymentDao = new PaymentDao( uri, tlMethod, params, type, status, time, collectedBy, ondcCollectedByStatus, ondcBuyerAppFinderFeeType, ondcBuyerAppFinderFeeAmount, ondcWithHoldingAmount, ondcWithHoldingAmountStatus, ondcReturnWindow, ondcReturnWindowStatus, ondcSettlementBasis, ondcSettlementBasisStatus, ondcSettlementWindow, ondcSettlementWindowStatus, ondcSettlementDetails );

        return paymentDao;
    }

    protected OndcCancellationType ondcCancellationTypeToOndcCancellationType(org.beckn.protocol.schemas.ProtocolOndcOrderCancellation.OndcCancellationType ondcCancellationType) {
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

        type = ondcCancellationTypeToOndcCancellationType( protocolOndcOrderCancellation.getType() );
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
}
