package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HiberbnateCustomerRepositoryInpl;

public class CustomerServiceImpl {

    private CustomerRepository customerRepository = new HiberbnateCustomerRepositoryInpl();



}
