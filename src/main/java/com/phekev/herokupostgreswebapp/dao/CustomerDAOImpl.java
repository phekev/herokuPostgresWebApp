package com.phekev.herokupostgreswebapp.dao;

import com.phekev.herokupostgreswebapp.model.Customer;
import com.phekev.herokupostgreswebapp.model.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CustomerDAOImpl implements  CustomerDAO{
    JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_CUSTOMER = "select * from customers where id = ?";
    private final String SQL_DELETE_CUSTOMER = "delete from customers where id = ?";
    private final String SQL_UPDATE_CUSTOMER = "update customers set first_name = ?, last_name = ?, email = ? where id = ?";
    private final String SQL_GET_ALL = "select * from customers";
    private final String SQL_INSERT_CUSTOMER = "insert into customers(first_name, last_name, email) values (?,?,?)";

    @Autowired
    public CustomerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Customer getCustomerById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_CUSTOMER, new Object[] { id }, new CustomerMapper());

    }

    @Override
    public List<Customer> getAllPersons() {
        return jdbcTemplate.query(SQL_GET_ALL, new CustomerMapper());
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_DELETE_CUSTOMER, customer.getCustID()) > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_UPDATE_CUSTOMER, customer.getFirst_name(), customer.getLast_name(), customer.getEmail()) > 0;
    }

    @Override
    public boolean createCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_INSERT_CUSTOMER, customer.getFirst_name(), customer.getLast_name(), customer.getEmail()) > 0;
    }
}
