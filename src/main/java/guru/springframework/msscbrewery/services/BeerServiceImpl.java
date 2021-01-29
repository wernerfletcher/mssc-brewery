package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Devil's Peak")
                .beerStyle("Lager")
                .upc(Long.MAX_VALUE)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Some new beer")
                .beerStyle("Ale")
                .upc(Long.MAX_VALUE)
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID id, BeerDto beerDto) {
        //todo: implement update method
        return beerDto;
    }

    @Override
    public void deleteById(UUID id) {
        //todo: implement delete method
    }

}
