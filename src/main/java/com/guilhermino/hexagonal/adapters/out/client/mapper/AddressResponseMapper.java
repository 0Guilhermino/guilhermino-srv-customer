package com.guilhermino.hexagonal.adapters.out.client.mapper;

import com.guilhermino.hexagonal.adapters.out.client.response.AddressResponse;
import com.guilhermino.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAdress(AddressResponse addressResponse);
}
