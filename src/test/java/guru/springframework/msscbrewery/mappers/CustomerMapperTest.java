package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerMapperTest {

    @Test
    public void testCustomerToCustomerDto() {
        Customer customer = Customer.builder()
                .name("Customer 1")
                .build();

        CustomerDto customerDto = CustomerMapper.INSTANCE.customerToCustomerDto(customer);

        assertEquals("Customer 1", customerDto.getName());
    }

    @Test
    public void testCustomerDtoToCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .name("Customer 2")
                .build();

        Customer customer = CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);

        assertEquals("Customer 2", customer.getName());
    }
}
