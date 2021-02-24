package com.ticoyk.sfgmsscbrewery.web.service;

import com.ticoyk.sfgmsscbrewery.web.model.BeerDto;
import com.ticoyk.sfgmsscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImp implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .customerName("Some Customer")
                .build();
    }

    public CustomerDto saveNewCustomer(CustomerDto beerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Customer Name")
                .build();
    }

    public CustomerDto updateCustomer(UUID id, CustomerDto beerDto){
        return CustomerDto.builder()
                .id(id)
                .customerName("Some name")
                .build();
    }

    public void deleteById(UUID customerId){
        log.debug("Deleting a customer...");
    }
}
