package com.elvis.training_java_labs;

import static org.junit.Assert.*;

public class TradeTest {

    @org.junit.Test
    public void setPrice() {
        Trade trade_1 = new Trade("T1", "APPL", 100, 15.25);
//        trade_1.setPrice(29.12);
        trade_1.setPrice(-29.12);
        System.out.println(trade_1.toString());
//        assertEquals(29.12,trade_1.price,0.001);
        assertEquals(0.0,trade_1.price,0.001);
    }
}