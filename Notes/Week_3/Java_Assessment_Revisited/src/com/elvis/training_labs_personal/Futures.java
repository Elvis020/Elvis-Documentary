package com.elvis.training_labs_personal;

public class Futures extends Product {
    String exchange;
    String contractCode;
    int month;
    int year;
    ProductPricingService service;

    public Futures(String exchange, String contractCode, int month, int year, ProductPricingService service) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
        this.service = service;
    }
}
