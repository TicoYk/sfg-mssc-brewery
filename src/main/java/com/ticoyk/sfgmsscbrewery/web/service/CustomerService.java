package com.ticoyk.sfgmsscbrewery.web.service;

import com.ticoyk.sfgmsscbrewery.web.model.BeerDto;
import com.ticoyk.sfgmsscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);

}
