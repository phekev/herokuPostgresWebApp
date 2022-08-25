package com.phekev.herokupostgreswebapp.dao;

import com.phekev.herokupostgreswebapp.model.Customer;

import java.util.List;

public interface CustomerDAO {

        Customer getCustomerById(int id);

        List<Customer> getAllPersons();

        boolean deleteCustomer(Customer customer);

        boolean updateCustomer(Customer customer);

        boolean createCustomer(Customer customer);
}

