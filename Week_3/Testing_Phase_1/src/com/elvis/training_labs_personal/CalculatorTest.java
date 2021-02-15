package com.elvis.training_labs_personal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddTwoNum() {
        Calculator c = new Calculator();
        int exRes = c.addTwoNum(23,43);
        assertEquals(23+43, exRes);
    }
}