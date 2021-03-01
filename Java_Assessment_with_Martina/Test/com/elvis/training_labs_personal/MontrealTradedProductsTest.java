package com.elvis.training_labs_personal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MontrealTradedProductsTest {

    @Mock
    private ProductPricingService pps;
    private MontrealTradedProducts mon;

    @Before
    public void setUp(){
        //    Preparing the mock
        mon = new MontrealTradedProducts();
        when(pps.price("MON","AAPL")).thenReturn(1300.0);
//        when(pps.price("LON","CCTL",2,2000)).thenReturn(1500.0);
    }






    @org.junit.Test(expected = ProductAlreadyRegisteredException.class)
    public void addNewProduct() throws ProductAlreadyRegisteredException {
        Product prod = new Stock("S21","NYSE","AAPL-S",pps);
        mon.addNewProduct(prod);
        mon.addNewProduct(prod);
    }

    @Test
    public void addNewProductTest() throws ProductAlreadyRegisteredException {
        Product prod = new Stock("S21","NYSE","AAPL",pps);
        mon.addNewProduct(prod);
        assertTrue(mon.getLengthOfRegisteredProducts() == 1);
    }


    @Test
    public void totalValueOfDaysTradedProducts() throws ProductAlreadyRegisteredException {
        Product prod = new Stock("S21","MON","AAPL",pps);
        mon.addNewProduct(prod);
        mon.trade(prod,1);
        assertEquals(1300,mon.totalValueOfDaysTradedProducts(), 0.0001);
    }
}