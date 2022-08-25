package com.phekev.herokupostgreswebapp.model;


public class OrdersDetails {

    private int id;
    private double price;
    private int quantity;
    private double total;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
