package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata109Test {

    @Test
    public void testAddFive() {
        assertEquals(10, Kata109.addFive(5));
    }

    @Test
    public void testAddZero() {
        assertEquals(5, Kata109.addFive(0));
    }

    @Test
    public void testAddNegativeFive() {
        assertEquals(0, Kata109.addFive(-5));
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            assertEquals(rand + 5, Kata109.addFive(rand));
        }
    }
}