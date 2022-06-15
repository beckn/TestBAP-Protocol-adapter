package org.beckn.one.sandbox.bap.client.order.quote.mapper;

import java.util.Map;
import javax.annotation.processing.Generated;
import org.beckn.one.sandbox.bap.client.shared.dtos.CartItemDto;
import org.beckn.one.sandbox.bap.client.shared.dtos.CartSelectedItemQuantity;
import org.beckn.protocol.schemas.OndcStatutoryPackagedCommodities;
import org.beckn.protocol.schemas.OndcStatutoryPackagedFood;
import org.beckn.protocol.schemas.ProtocolDescriptor;
import org.beckn.protocol.schemas.ProtocolItemQuantityAllocated;
import org.beckn.protocol.schemas.ProtocolPrice;
import org.beckn.protocol.schemas.ProtocolScalar;
import org.beckn.protocol.schemas.ProtocolSelectedItem;
import org.beckn.protocol.schemas.ProtocolTime;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T15:45:11+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class SelectedItemMapperImpl implements SelectedItemMapper {

    @Override
    public ProtocolSelectedItem dtoToProtocol(CartItemDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProtocolItemQuantityAllocated quantity = null;
        String id = null;

        quantity = cartSelectedItemQuantityToProtocolItemQuantityAllocated( dto.getQuantity() );
        id = dto.getId();

        String parentItemId = null;
        ProtocolDescriptor descriptor = null;
        ProtocolPrice price = null;
        String categoryId = null;
        String locationId = null;
        ProtocolTime time = null;
        Map<String, String> tags = null;
        Boolean ondcReturnable = null;
        Boolean ondcCancellable = null;
        Boolean ondcSellerPickupReturn = null;
        String ondcReturnWindow = null;
        String ondcTimeToShip = null;
        Boolean ondcAvailableOnCod = null;
        OndcStatutoryPackagedCommodities ondcStatutoryPackagedCommodities = null;
        OndcStatutoryPackagedFood ondcStatutoryPackagedFood = null;

        ProtocolSelectedItem protocolSelectedItem = new ProtocolSelectedItem( id, parentItemId, descriptor, price, categoryId, locationId, time, tags, quantity, ondcReturnable, ondcCancellable, ondcSellerPickupReturn, ondcReturnWindow, ondcTimeToShip, ondcAvailableOnCod, ondcStatutoryPackagedCommodities, ondcStatutoryPackagedFood );

        return protocolSelectedItem;
    }

    protected ProtocolItemQuantityAllocated cartSelectedItemQuantityToProtocolItemQuantityAllocated(CartSelectedItemQuantity cartSelectedItemQuantity) {
        if ( cartSelectedItemQuantity == null ) {
            return null;
        }

        Integer count = null;
        ProtocolScalar measure = null;

        count = cartSelectedItemQuantity.getCount();
        measure = cartSelectedItemQuantity.getMeasure();

        ProtocolItemQuantityAllocated protocolItemQuantityAllocated = new ProtocolItemQuantityAllocated( count, measure );

        return protocolItemQuantityAllocated;
    }
}
