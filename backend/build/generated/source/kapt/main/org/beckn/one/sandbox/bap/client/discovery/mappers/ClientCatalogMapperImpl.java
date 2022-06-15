package org.beckn.one.sandbox.bap.client.discovery.mappers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.beckn.one.sandbox.bap.client.shared.dtos.ClientCatalog;
import org.beckn.protocol.schemas.ProtocolCatalog;
import org.beckn.protocol.schemas.ProtocolCategory;
import org.beckn.protocol.schemas.ProtocolDescriptor;
import org.beckn.protocol.schemas.ProtocolProviderCatalog;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T15:45:11+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class ClientCatalogMapperImpl implements ClientCatalogMapper {

    @Override
    public ClientCatalog protocolToClientDto(ProtocolCatalog source) {
        if ( source == null ) {
            return null;
        }

        List<ProtocolProviderCatalog> bppProviders = null;
        List<ProtocolCategory> bppCategories = null;
        ProtocolDescriptor bppDescriptor = null;
        LocalDateTime exp = null;

        List<ProtocolProviderCatalog> list = source.getBppProviders();
        if ( list != null ) {
            bppProviders = new ArrayList<ProtocolProviderCatalog>( list );
        }
        List<ProtocolCategory> list1 = source.getBppCategories();
        if ( list1 != null ) {
            bppCategories = new ArrayList<ProtocolCategory>( list1 );
        }
        bppDescriptor = source.getBppDescriptor();
        exp = source.getExp();

        String bppId = null;

        ClientCatalog clientCatalog = new ClientCatalog( bppDescriptor, bppProviders, bppCategories, exp, bppId );

        return clientCatalog;
    }
}
