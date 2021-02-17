package com.ticoyk.sfgmsscbrewery.web.service;

import com.ticoyk.sfgmsscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImp implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("My Beer-d")
                .beerStyle("No Style")
                .build();
    }
}
