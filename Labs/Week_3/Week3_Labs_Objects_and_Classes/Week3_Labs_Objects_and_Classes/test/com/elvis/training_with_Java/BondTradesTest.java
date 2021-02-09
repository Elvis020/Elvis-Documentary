package com.elvis.training_with_Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradesTest {

    @Test
    void calcDividend() {
        int range = 10 - (-10);
        double dividend = Math.random()*range - (-10);

        Trade AmaWithBond = new BondTrades("T1","PPP",20,dividend);
        Trade AmaWithFund = new FundTrades("F1","CCC",20,dividend,20.0);


        AmaWithBond.setPrice(dividend);
        AmaWithFund.setPrice(dividend);


//        Do individual calculation and don't use assertNotEquals
        assertNotEquals(AmaWithBond.calcDividend(),AmaWithFund.calcDividend());
    }
}