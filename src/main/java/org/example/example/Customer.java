package org.example.example;

import java.util.ArrayList;

public class Customer {
    private static int customerCounter = 0;
    private int customerId;
    private String name;
    private String address;
    private ArrayList<Order> orders;

    public Customer(String name, String address) {
        this.customerId = ++customerCounter;
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public static int getCustomerCounter() {
        return customerCounter;
    }

    public static void setCustomerCounter(int customerCounter) {
        Customer.customerCounter = customerCounter;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
