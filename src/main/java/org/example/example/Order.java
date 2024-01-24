package org.example.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    private static final AtomicInteger idCounter = new AtomicInteger(0);
    private int id;

    private List<Product>productList = new ArrayList<>();

    private List<Integer>quantity = new ArrayList<>();

    private Date orderDate;

    public Order() {
        this.id = idCounter.incrementAndGet();
        this.productList = productList;
        this.quantity = quantity;
        this.orderDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void addProductToOrder(Product product, int quantity) {
        int availableQuantity = product.getQuantity();

        if (availableQuantity >= quantity) {
            productList.add(product);
            getQuantity().add(quantity);
            System.out.println("Produkt '" + product.getName() + "' byl přidán do objednávky.");
        } else {
            System.out.println("Produkt '" + product.getName() + "' není dostupný ve zvoleném množství.");
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (int i = 0; i < getProductList().size(); i++) {
            Product product = getProductList().get(i);
            int quantity = getQuantity().get(i);
            totalPrice += product.getPrice() * quantity;
        }

        return totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Objednávka číslo " + id);
        System.out.println("Seznam produktů:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString() + ", počet v objednávce: " + quantity.get(i));
        }
        System.out.println("Celková cena objednávky: " + getTotalPrice());
    }
}
