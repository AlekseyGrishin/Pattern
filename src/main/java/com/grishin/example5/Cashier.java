package com.grishin.example5;

import java.util.ArrayList;
import java.util.List;

public class Cashier {

    public double calculateSum(List<Object> purchases) {
        double resultSum = 0d;
        for (Object purchase : purchases) {
            if (purchase instanceof BaseProduct) {
                resultSum = sumProduct(resultSum, (BaseProduct) purchase);
            } else if (purchase instanceof Box) {
                resultSum = sumBox(resultSum, (Box) purchase);
            }
        }

        return resultSum;
    }

    private double sumProduct(double currentSum, BaseProduct product) {
        return currentSum + product.getPrice();
    }

    private double sumBox(double currentSum, Box box) {
        double resultSum = currentSum;
        for (Object purchase : box.getPurchases()) {
            if (purchase instanceof BaseProduct) {
                BaseProduct product = (BaseProduct) purchase;
                resultSum = sumProduct(resultSum, product);
            } else if (purchase instanceof Box) {
                resultSum = sumBox(resultSum, (Box) purchase);
            }
        }

        return resultSum;
    }
}
