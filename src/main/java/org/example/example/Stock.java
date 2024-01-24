package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    List<Product>listOfProducts = new ArrayList<>();

    public Stock(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    public void addProduct(Product product){
        listOfProducts.add(product);
        System.out.println("Prdoukt " + product.getId() + product.getName() + "přidán na sklad");
    }

    public void removeProduct(int id) {
        for (Product product : listOfProducts) {
            if (product.getId() == id) {
                listOfProducts.remove(id);
                System.out.println("Produkt " + product.getId() + product.getName() + "byl odebrán ze skladu");
            } else {
                System.out.println("Produkt nenalezen");
            }
        }
    }
        public void productInfo(String name){
            for(Product product : listOfProducts){
                if(product.equals(name)){
                    System.out.println("Informace o produktu: " + product.getId() + product.getName() + product.getPrice() + product.getQuantity());
                } else {
                    System.out.println("Prodkut nenalezen");
                }
            }
        }

        public void productsInStock(){
            if(listOfProducts.isEmpty()){
                System.out.println("Seznam produktů je prázdný");
            }else {
                System.out.println("Zde je seznam produktů:");
                for(Product product : listOfProducts){
                    System.out.println(product.toString());
                }
            }
        }

}
