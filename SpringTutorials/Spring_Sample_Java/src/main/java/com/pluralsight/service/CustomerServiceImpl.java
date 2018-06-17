package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("customerServiceImpl") // to erase @Been from AppConfig class <-- for autowiring
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

//  No Spring
//  private CustomerRepository customerRepository = new HiberbnateCustomerRepositoryInpl();

//  Setter Injection Example
//    private CustomerRepository customerRepository;

//  Constructor Injection Example
//    private CustomerRepository customerRepository;
//
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("---> We are using constructor injection <---");
        this.customerRepository = customerRepository;
    }

//  Autowiring Example
//    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //  Setter Injection Example
//    @Autowired // Autowiring
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("---> We are using setter injection <---");
        this.customerRepository = customerRepository;
    }
}
