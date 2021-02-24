package com.ticoyk.sfgmsscbrewery.web.service;

import com.ticoyk.sfgmsscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .beerName("My Beer-d")
                .beerStyle("No Style")
                .build();
    }

    public BeerDto updateBeer(UUID id, BeerDto beerDto){
        return beerDto.builder()
                .id(id)
                .beerName("Updated Beer")
                .build();
    }

    public void deleteById(UUID beerId){
        log.debug("Deleting a  beer...");
    }
}
