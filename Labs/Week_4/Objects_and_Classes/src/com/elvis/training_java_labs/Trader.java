package com.elvis.training_java_labs;

public class Trader {
    protected String name;
    Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    public Double addTrade(Trade trade) {
        return account.getValue() + (trade.price * trade.quantity);
    }
}
