package com.phekev.herokupostgreswebapp.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {


        public Customer mapRow(ResultSet resultSet, int i) throws SQLException {

            Customer customer = new Customer();
            customer.setCustID(resultSet.getInt("custID"));
            customer.setFirst_name(resultSet.getString("first_name"));
            customer.setLast_name(resultSet.getString("last_name"));
            customer.setEmail(resultSet.getString("email"));
            customer.setAccountCreated(resultSet.getTimestamp("accountCreated"));
            return customer;
        }
    }

