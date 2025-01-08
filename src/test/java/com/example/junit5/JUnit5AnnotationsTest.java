package com.example.junit5;

import org.junit.Ignore;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class JUnit5AnnotationsTest {

    /*Junit5 comprises into three modules
    1. JUnit Platform
    2. JUnit Jupiter
    3. JUnit Vintage
     */

    @BeforeEach
    public void setUp() {
        // Code to run before each test
    }

    @AfterEach
    public void tearDown() {
        // Code after each test
    }

    @BeforeAll
    public static void setUpBeforeClass() {
        //Code run once before all tests
        // JMS setup. ENV setup etc..
    }

    @AfterAll
    public static void setUpAfterClass() {
        // Code run once after all tests
        // like closing I/O connections
    }

    @Test
    @DisplayName("testMethodRunning")
    public void testMethod() {
        //Test case logic
        assertEquals(5, 2 + 3, "Optional custom error message");
        assertNotEquals(5, 2 + 2, "Optional custom error message");
        assertTrue(5 > 2, "Optional custom error message");
        assertFalse(5 < 2, "Optional custom error message");

        String str = null;
        assertNull(str, "Optional custom error message");

        String str1 = "JUnit";
        assertNotNull(str1, "Optional custom error message");

        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("Invalid number");
        }, "Optional custom error message");

        assertAll("Multiple assertions",
                () -> assertEquals(4, 2 * 2),
                () -> assertTrue(5 > 1));

    }

    @Ignore
    @Test
    public void testMethodIgnore() {
        //Test case logic
        assertEquals(2, 1 + 1);
    }

}
