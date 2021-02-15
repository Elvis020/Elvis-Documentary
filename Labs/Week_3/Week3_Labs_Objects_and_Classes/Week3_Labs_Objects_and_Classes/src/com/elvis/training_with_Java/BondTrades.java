package com.elvis.training_with_Java;

public class BondTrades extends Trade {
    private final Double dividend;
    public BondTrades(String ID, String symbol, Integer quantity,double dividend) {
        super(ID, symbol, quantity);
        this.dividend = dividend;
    }

    public BondTrades(String ID, String symbol, Integer quantity, Double price,double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
    }

    @Override
    public Double calcDividend() {
        return dividend;
    }
}
