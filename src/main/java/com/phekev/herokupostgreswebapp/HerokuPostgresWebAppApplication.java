package com.phekev.herokupostgreswebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HerokuPostgresWebAppApplication {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {


        SpringApplication.run(HerokuPostgresWebAppApplication.class, args);


    }

}
