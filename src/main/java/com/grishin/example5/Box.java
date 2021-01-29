package com.grishin.example5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box{

    // в списке может храниться как Box так и Product
    private List<Object> purchases = new ArrayList<>();

    public void addPurchase(Object purchase) {
        purchases.add(purchase);
    }

    public List<Object> getPurchases() {
        return purchases;
    }

}

