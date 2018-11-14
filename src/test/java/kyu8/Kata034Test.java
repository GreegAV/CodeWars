package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata034Test {

    @Test
    public void basicTests10000() {
        assertEquals(10000, Kata034.nearestSq(9999));
    }

    @Test
    public void basicTests111() {
        assertEquals(121, Kata034.nearestSq(111));
    }

    @Test
    public void basicTests10() {
        assertEquals(9, Kata034.nearestSq(10));
    }

    @Test
    public void basicTests2() {
        assertEquals(1, Kata034.nearestSq(2));
    }

    @Test
    public void basicTests1() {
        assertEquals(1, Kata034.nearestSq(1));
    }
}