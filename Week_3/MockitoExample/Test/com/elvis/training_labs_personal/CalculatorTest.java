package com.elvis.training_labs_personal;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        Mockito.when(calc.addition(3,4)).thenReturn(85);
    }

    @After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void addition() {
        UseCalculator useCalc = new UseCalculator(calc,3,4);
        Mockito.verify(calc).addition(3,4);
        Mockito.verify(calc,Mockito.times(1)).addition(3,4);
    }
}