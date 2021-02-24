package com.ticoyk.sfgmsscbrewery.web.controller;

import com.ticoyk.sfgmsscbrewery.web.model.BeerDto;
import com.ticoyk.sfgmsscbrewery.web.model.CustomerDto;
import com.ticoyk.sfgmsscbrewery.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<BeerDto> saveNewCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedDto = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId, customerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID customerId){
        customerService.deleteById(customerId);
    }
}
