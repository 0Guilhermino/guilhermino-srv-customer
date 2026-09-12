package com.guilhermino.hexagonal.application.ports.in;

import com.guilhermino.hexagonal.application.core.domain.Customer;

public interface IInsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
