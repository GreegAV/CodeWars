package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata047Test {
    @Test
    public void test1() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, Kata047.simpleMultiplication(1));
        assertEquals(27, Kata047.simpleMultiplication(3));
        assertEquals(189, Kata047.simpleMultiplication(21));
        assertEquals(207, Kata047.simpleMultiplication(23));
    }

    @Test
    public void test2() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, Kata047.simpleMultiplication(2));
        assertEquals(32, Kata047.simpleMultiplication(4));
        assertEquals(176, Kata047.simpleMultiplication(22));
        assertEquals(208, Kata047.simpleMultiplication(26));
    }
}