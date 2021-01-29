package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("Mike's Pub & Grill")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public CustomerDto updateCustomer(UUID id, CustomerDto customerDto) {
        //todo: implement update method
        return customerDto;
    }

    @Override
    public void deleteById(UUID id) {
        //todo: implement delete method
    }
}
