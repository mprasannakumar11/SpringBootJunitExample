package com.example;

import org.junit.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class AnnotationsExampleTest {


    // junit.jupitor
    @BeforeTestClass
    public static void setUpBeforeTestClass() {
        //Code run once before all tests
        // JMS setup. ENV setup etc..
    }

    @AfterTestClass
    public static void setUpAfterTestClass() {
        // Code run once after all tests
        // like closing I/O connections
    }

    //Junit 4 -------------------------------------------------------

    @BeforeClass
    public static void setUpBeforeClass() {
        //Code run once before all tests
        // JMS setup. ENV setup etc..
    }

    @AfterClass
    public static void setUpAfterClass() {
        // Code run once after all tests
        // like closing I/O connections
    }

    @Before
    public void setUp() {
        // Code to run before each test
    }

    @After
    public void tearDown() {
        // Code after each test
    }

    @Test
    public void testMethod() {
        //Test case logic
        assertEquals(2, 1+1);
    }


}
