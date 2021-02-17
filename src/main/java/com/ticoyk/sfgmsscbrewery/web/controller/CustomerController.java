package com.ticoyk.sfgmsscbrewery.web.controller;

import com.ticoyk.sfgmsscbrewery.web.model.CustomerDto;
import com.ticoyk.sfgmsscbrewery.web.service.CustomerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    CustomerService customerService;

    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @RequestMapping("/{customerId}")
    public CustomerDto getCustomerById(@PathVariable UUID customerId){
        return this.customerService.getCustomerById(customerId);
    }
}
