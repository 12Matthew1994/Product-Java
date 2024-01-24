package org.example.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product>productList = new ArrayList<>();

        // Vytvoření produktů
        Product trouba = new Product("Trouba Bosch", 2000, 3);
        Product kolo = new Product("Horské kolo", 4000, 2);
        Product notebook = new Product("Notebook Acer", 10000, 8);

        productList.add(trouba);
        productList.add(kolo);
        productList.add(notebook);

        // Vytvoření objednávek
        Order order1 = new Order();

        order1.addProductToOrder(kolo, 1);
        order1.addProductToOrder(trouba, 4);

        order1.printOrderInfo();

        Order order2 = new Order();
        order2.addProductToOrder(notebook, 5);

        // Vytvoření zákazníků
        Customer matej = new Customer("Matthew Novak", "Kostelec");
        matej.addOrder(order1);

        Customer sarka = new Customer("Šárka Vokatá", "Konopáč");
        sarka.addOrder(order2);

        // Vytvoření faktur
        Invoice invoice1 = new Invoice();
        invoice1.addOrder(order1);
        invoice1.markAsPaid();

        Invoice invoice2 = new Invoice();
        invoice2.addOrder(order2);

        // Vypsání informací
        System.out.println("Informace o zákaznících:");
        System.out.println("Zákazník 1: " + matej.getName());
        System.out.println("Zákazník 2: " + sarka.getName());

        System.out.println("Informace o fakturách:");
        invoice1.printInvoice();
        invoice2.printInvoice();
    }
}




