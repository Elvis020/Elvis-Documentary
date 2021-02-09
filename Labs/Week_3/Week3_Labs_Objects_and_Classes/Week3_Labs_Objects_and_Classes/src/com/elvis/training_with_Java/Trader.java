package com.elvis.training_with_Java;

public class Trader {
    Account account;
    String name;

    public Trader(Account account, String name) {
        this.account = account;
        this.name = name;
    }


    public Double addTrade(Trade trade){
        Double principalAmount = trade.price * trade.quantity;
        Double calculation = principalAmount +this.account.vaueOfAllTrades;
        return calculation;
    }
}
