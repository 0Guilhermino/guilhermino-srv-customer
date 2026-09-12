package com.guilhermino.hexagonal.application.ports.out;

import com.guilhermino.hexagonal.application.core.domain.Customer;

public interface IInsertCustomerOutputPort {
    void insert(Customer customer);
}
