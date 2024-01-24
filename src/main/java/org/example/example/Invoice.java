package org.example.example;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    private static int invoiceCounter = 0;

    private int invoiceNumber;

    private Date issueDate;

    private ArrayList<Order> orders;

    private double totalAmount;

    private boolean isPaid;

    public Invoice() {
        this.invoiceNumber = ++invoiceCounter;
        this.issueDate = new Date();
        this.orders = new ArrayList<>();
        this.totalAmount = 0.0;
        this.isPaid = false;
    }

    public void addOrder(Order order) {
        orders.add(order);
        totalAmount += order.getTotalPrice();
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public void printInvoice() {
        System.out.println("Číslo faktury: " + invoiceNumber);
        System.out.println("Datum vydání: " + issueDate);
        System.out.println("Objednávky:");
        for (Order order : orders) {
            System.out.println("Objednávka ID: " + order.getId() + ", Celková cena: " + order.getTotalPrice());
        }
        System.out.println("Celková cena: " + totalAmount);
        System.out.println("Status: " + (isPaid ? "Zaplaceno" : "Nezaplaceno"));
    }
}
