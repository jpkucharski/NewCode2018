package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HiberbnateCustomerRepositoryInpl implements CustomerRepository {

    @Value("${dbUsername}") // using annotation
    private String dbUsername;


    @Override
    public List<Customer> findAll() {

        System.out.println(dbUsername + "<-- username");

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Peter");
        customer.setLastname("Peter's-LastName");

        customers.add(customer);
        return customers;
    }
//only for hard wired example
//    public void setDbUsername(String dbUsername) {
//        this.dbUsername = dbUsername;
//    }
}
