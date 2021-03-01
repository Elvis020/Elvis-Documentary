package com.elvis.training_labs_personal;

public class Futures extends Product {
    private String contractCode;
    private int month;
    private int year;

    public Futures(String id, String exchange, String contractCode, int month, int year,ProductPricingService pps) {
        super(id, exchange,pps);  // Super(): Passing them to the constructor of the super class
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }

    public double price() {
        return pps.price(exchange,contractCode,month,year);
    }
}
