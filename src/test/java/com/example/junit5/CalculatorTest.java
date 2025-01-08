package com.example.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.app.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator cal = new Calculator();
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
}
