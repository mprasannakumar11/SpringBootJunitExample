package com.example.junit4;

import org.junit.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

//Junit 4
@SpringBootTest
public class JUnit4AnnotationsTest {

    @Before
    public void setUp() {
        // Code to run before each test
    }

    @After
    public void tearDown() {
        // Code after each test
    }

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

    @Test
    public void testMethod() {
        //Test case logic
        assertEquals(2, 1 + 1);
    }

    @Ignore
    @Test
    public void testMethodIgnore() {
        //Test case logic
        assertEquals(2, 1 + 1);
        assertNotEquals(5, 2 + 2);
        assertTrue(5 > 2);
        assertFalse(5 < 2);

        String str = null;
        assertNull(str);

        String str1 = "JUnit";
        assertNotNull(str1);

        String str2 = "JUnit";
        assertSame(str1, str2);

        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

    }
}
