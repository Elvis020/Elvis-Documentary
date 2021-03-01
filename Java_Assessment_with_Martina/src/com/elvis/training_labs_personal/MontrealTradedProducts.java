package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MontrealTradedProducts implements MontrealTradedProductsAPI {

    private List<Product> registeredProduct = new ArrayList<>();
    private HashMap<Product, Integer> tradedProducts = new HashMap<Product, Integer>();

    public MontrealTradedProducts() {
    }


    //    List is an interface, and arrayList is the class implementing the interface list
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(registeredProduct.contains(product)) throw new ProductAlreadyRegisteredException("Product is already registered");
        else registeredProduct.add(product);
    }

    @Override
    public void trade(Product product, int quantity) {
        if(registeredProduct.contains(product)){
            int newQuant = tradedProducts.get(product) != null ? tradedProducts.get(product) + quantity : quantity;
            tradedProducts.put(product,newQuant);
        }else{
            tradedProducts.put(product,0);
        }

    }

    @Override
    public int totalTradeQuantityForDay() {
        return tradedProducts.values().stream().reduce(0, (x,y) -> x+y);
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double totalPrice = 0.0;
        for(Product prod: tradedProducts.keySet()){
            totalPrice += prod.price() * tradedProducts.get(prod);
        }
        return totalPrice;
    }


    public int getLengthOfRegisteredProducts(){
        return registeredProduct.size();
    }
}
