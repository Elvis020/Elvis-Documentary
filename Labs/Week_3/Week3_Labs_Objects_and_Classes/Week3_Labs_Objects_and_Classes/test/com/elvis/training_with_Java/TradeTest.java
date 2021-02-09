package com.elvis.training_with_Java;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TradeTest extends TestCase {

    public void testSetPrice() {
        int range = 10 - (-10);
        double rand = Math.random()*range - (-10);
        Trade Ama = new BondTrades("T1","PPP",20,rand);
        Trade Kojo = new BondTrades("T2","CCP",23,rand);
        Ama.setPrice(rand);
//        System.out.println(Kojo);
//        Ama.getDateAndTime();

        if(rand > 0){
            assertEquals(rand, Ama.getPrice());
        }else{
            assertNotEquals(rand,Ama.getPrice());
        }
    }
}