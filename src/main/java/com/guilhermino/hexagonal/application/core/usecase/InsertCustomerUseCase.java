package com.guilhermino.hexagonal.application.core.usecase;

import com.guilhermino.hexagonal.application.core.domain.Customer;
import com.guilhermino.hexagonal.application.ports.in.IInsertCustomerInputPort;
import com.guilhermino.hexagonal.application.ports.out.IInsertCustomerOutputPort;
import com.guilhermino.hexagonal.application.ports.out.IFindAddressByZipCodeOutputPort;

public class InsertCustomerUseCase  implements IInsertCustomerInputPort {

    private final IFindAddressByZipCodeOutputPort iFindAddressByZipCodeOutputPort;
    private final IInsertCustomerOutputPort iInsertCustomerOutputPort;

    public InsertCustomerUseCase(IFindAddressByZipCodeOutputPort iFindAddressByZipCodeOutputPort, IInsertCustomerOutputPort iInsertCustomerOutputPort) {
        this.iFindAddressByZipCodeOutputPort = iFindAddressByZipCodeOutputPort;
        this.iInsertCustomerOutputPort = iInsertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = iFindAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        iInsertCustomerOutputPort.insert(customer);
    };

}
