package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BeerMapperTest {

    @Test
    public void testBeerToBeerDto() {
        Beer beer = Beer.builder()
                .beerName("Castle")
                .beerStyle("LAGER")
                .build();

        BeerDto beerDto = BeerMapper.INSTANCE.beerToBeerDto(beer);

        assertEquals("Castle", beerDto.getBeerName());
        assertEquals("LAGER", beerDto.getBeerStyle());
    }

    @Test
    public void testBeerDToToBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("Black Label")
                .beerStyle("BEER")
                .build();

        Beer beer = BeerMapper.INSTANCE.beerDtoToBeer(beerDto);

        assertEquals("Black Label", beer.getBeerName());
        assertEquals("BEER", beer.getBeerStyle());
    }

}
