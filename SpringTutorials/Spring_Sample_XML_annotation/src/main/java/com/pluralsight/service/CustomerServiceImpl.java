package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")

public class CustomerServiceImpl implements CustomerService {

//    No Spring example
//    private CustomerRepository customerRepository = new HiberbnateCustomerRepositoryInpl();

//    Member Injection example
//    @Autowired
//    private CustomerRepository customerRepository;

//    Setter Injection example
//    private CustomerRepository customerRepository;

//  Constructor Injection example
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("We are using Constructor Injection.");
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
//    Setter Injection example
//    @Autowired
//    public void setCustomerRepository(CustomerRepository customerRepository) {
//        System.out.println("We are using Setter Injection.");
//        this.customerRepository = customerRepository;
//    }
}
