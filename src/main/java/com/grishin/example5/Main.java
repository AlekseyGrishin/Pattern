package com.grishin.example5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Используя паттерн избавиться от рекурсивного вызова метода Cashier.sumBox
        Product product1 = new Product("product1", 1000);
        Product product2 = new Product("product2", 2000);
        Product product3 = new Product("product3", 3000);
        Product product4 = new Product("product4", 4000);
        Product product5 = new Product("product5", 5000);
        Product product6 = new Product("product6", 5000);
        Product product7 = new Product("product7", 5000);

        Box box1 = new Box();
        box1.addPurchase(product1);
        box1.addPurchase(product2);
        box1.addPurchase(product3);

        Box box2 = new Box();
        box2.addPurchase(product6);
        box2.addPurchase(product7);

        box1.addPurchase(box2);

        Cashier cashier = new Cashier();
        double resultSum = cashier.calculateSum(Arrays.asList(box1, product4, product5));
        System.out.println(resultSum);
    }


}
