package com.elvis.training_with_Java;

public class Trade {
    public String ID;
    public String symbol;
    public Integer quantity;
    public Double price;

    public Trade(String ID, String symbol, Integer quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public Trade(String ID, String symbol, Integer quantity, Double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }


    public Double setPrice(Double price) {
        Double updatedPrice = 0.0;
        if(price<0){
            System.out.println("Price can't be negative");
            updatedPrice = null;
        }
        else
            updatedPrice = price;
        return updatedPrice;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
