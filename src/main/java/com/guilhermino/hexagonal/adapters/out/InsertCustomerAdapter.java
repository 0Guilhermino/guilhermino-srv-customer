package com.guilhermino.hexagonal.adapters.out;

import com.guilhermino.hexagonal.adapters.out.repository.CustomerRepository;
import com.guilhermino.hexagonal.adapters.out.repository.mapper.ICustormerEntityMapper;
import com.guilhermino.hexagonal.application.core.domain.Customer;
import com.guilhermino.hexagonal.application.ports.out.IInsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements IInsertCustomerOutputPort {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ICustormerEntityMapper custormerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = custormerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
