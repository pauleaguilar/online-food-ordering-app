package com.example.onlinefoodapp.service;


import com.example.onlinefoodapp.dao.CustomerRepository;
import com.example.onlinefoodapp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> findbyId(Long id) {
        return customerRepository.findById(id);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);

    }

    public void update(Customer customer) {

    }


    public List<Customer> findAllCustomer() {
    }




}
