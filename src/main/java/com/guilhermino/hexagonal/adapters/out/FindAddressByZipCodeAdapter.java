package com.guilhermino.hexagonal.adapters.out;

import com.guilhermino.hexagonal.adapters.out.client.IFindAddressByZipCodeClient;
import com.guilhermino.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.guilhermino.hexagonal.application.core.domain.Address;
import com.guilhermino.hexagonal.application.ports.out.IFindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements IFindAddressByZipCodeOutputPort {

    @Autowired
    private IFindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAdress(addressResponse);
    }
}
