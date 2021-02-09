package com.elvis.training_with_Java;

import junit.framework.TestCase;

public class TradeTest extends TestCase {

    public void testSetPrice() {
        Trade Ama = new Trade("T1","PPP",20,34.5);
        assertEquals(33.1,Ama.setPrice(33.1));
    }
}