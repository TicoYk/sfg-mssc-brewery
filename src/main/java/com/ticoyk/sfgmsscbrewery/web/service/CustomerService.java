package com.ticoyk.sfgmsscbrewery.web.service;

import com.ticoyk.sfgmsscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

}
