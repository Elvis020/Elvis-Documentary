package com.elvis.training_with_Java;

public class FundTrades extends Trade {
    Double percentage;
    public FundTrades(String ID, String symbol, Integer quantity,Double percentage) {
        super(ID, symbol, quantity);
        this.percentage = percentage;
    }

    public FundTrades(String ID, String symbol, Integer quantity, Double price, Double percentage) {
        super(ID, symbol, quantity, price);
        this.percentage = percentage;
    }

    @Override
    public Double calcDividend() {
        return (percentage/100)*super.getPrice();
    }
}
