package com.elvis.training_with_Java;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {
    private String ID;
    private String symbol;
    protected Integer quantity;
    protected Double price;
    LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();



    public abstract Double calcDividend();

    public Double getPrice() {
        return price;
    }

    public Trade(String ID, String symbol, Integer quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        getDateAndTime();
    }

    public Trade(String ID, String symbol, Integer quantity, Double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        getDateAndTime();
    }


    public Double setPrice(Double price) {
        Double updatedPrice = 0.0;
        if(price<0)
            updatedPrice = price;
        return updatedPrice;
    }

    public void getDateAndTime(){
        System.out.println(time);
        System.out.println(date);
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
