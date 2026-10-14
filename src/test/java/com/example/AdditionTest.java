package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void testAddTwoPositiveNumbers() {
        Addition addition = new Addition();
        assertEquals(30, addition.add(10, 20));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(10, -5));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        Addition addition = new Addition();
        assertEquals(-9, addition.add(-4, -5));
    }
}
