package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HiberbnateCustomerRepositoryInpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HiberbnateCustomerRepositoryInpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}
