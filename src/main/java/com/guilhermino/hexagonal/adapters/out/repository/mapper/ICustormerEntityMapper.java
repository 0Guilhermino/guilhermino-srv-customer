package com.guilhermino.hexagonal.adapters.out.repository.mapper;

import com.guilhermino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilhermino.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustormerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
