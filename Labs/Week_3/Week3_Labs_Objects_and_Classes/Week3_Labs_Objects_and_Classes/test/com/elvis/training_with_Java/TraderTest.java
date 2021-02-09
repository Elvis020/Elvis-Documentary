package com.elvis.training_with_Java;

import junit.framework.TestCase;

public class TraderTest extends TestCase {

    public void testAddTrade() {
        Trade Ama = new Trade("T1", "PPP", 20, 34.5) {
            @Override
            public Double calcDividend() {
                return null;
            }
        };
        Account account_for_ama = new Account();
        account_for_ama.setVaueOfAllTrades(23.14);
        Trader T1 = new Trader(account_for_ama,"Ama");





        Double actualResult = (Ama.price * Ama.quantity) + 23.14;
        assertEquals(actualResult,T1.addTrade(Ama));

    }
}