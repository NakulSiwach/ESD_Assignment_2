package com.nakulsiwach.esd_2.mapper;

import com.nakulsiwach.esd_2.dto.CustomerRequest;
import com.nakulsiwach.esd_2.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }
}