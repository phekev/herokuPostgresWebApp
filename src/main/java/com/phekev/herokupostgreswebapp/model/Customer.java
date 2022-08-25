package com.phekev.herokupostgreswebapp.model;

import java.sql.Timestamp;


public class Customer {
    private int custID;
    private String first_name;
    private String last_name;
    private String email;
    private Timestamp accountCreated;

    public Customer() {}
    public Customer(int custID, String firstName, String l_Name, String email, Timestamp accountCreated ) {
        this.custID = custID;
        first_name = firstName;
        last_name = l_Name;
        this.email = email;
        this.accountCreated = accountCreated;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(Timestamp accountCreated) {
        this.accountCreated = accountCreated;
    }


}
