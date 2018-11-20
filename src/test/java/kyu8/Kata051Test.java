package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata051Test {
    @Test
    public void testEvenOrOdd() {
        Kata051 eoo = new Kata051();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
}