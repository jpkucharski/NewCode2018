package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository ")


public class HiberbnateCustomerRepositoryInpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Peter");
        customer.setLastname("Peter's-LastName");

        customers.add(customer);
        return customers;
    }
}
