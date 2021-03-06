package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID id, BeerDto beerDto);

    void deleteById(UUID id);
}
