package com.elvis.training_labs_personal;

public class Stocks extends Product  {
    String exchange;
    String ticker;
    ProductPricingService service;

    public Stocks(String exchange, String ticker, ProductPricingService service) {
        this.exchange = exchange;
        this.ticker = ticker;
        this.service = service;
    }

}
