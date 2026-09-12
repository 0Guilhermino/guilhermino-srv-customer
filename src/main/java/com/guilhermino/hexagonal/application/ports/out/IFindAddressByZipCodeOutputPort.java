package com.guilhermino.hexagonal.application.ports.out;

import com.guilhermino.hexagonal.application.core.domain.Address;

public interface IFindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
