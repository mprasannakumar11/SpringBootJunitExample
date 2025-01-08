package com.example.testsuite;

import com.example.AdvancedCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvancedCalculatorTest {
    private AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}
