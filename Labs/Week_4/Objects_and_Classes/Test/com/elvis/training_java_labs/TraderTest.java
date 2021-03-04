package com.elvis.training_java_labs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TraderTest {

    @Test
    public void addTrade() {
        Account account_1 = new Account();
        Trade trade_1 = new Trade("T1", "APPL", 100, 15.25);
        Trader trader_1 = new Trader("Trader 1",account_1);
        account_1.setValue(30.50);
//        System.out.println(account_1.getValue());
//        System.out.println(account_1.getValue());
        assertEquals(1555.5,trader_1.addTrade(trade_1),0.001);

    }
}