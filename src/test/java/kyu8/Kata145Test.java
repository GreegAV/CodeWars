package kyu8;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata145Test {
    @Test
    public void testBasic() {
        assertEquals(9, Kata145.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, Kata145.squareSum(new int[]{1, 2}));
        assertEquals(50, Kata145.squareSum(new int[]{5, -3, 4}));
    }
}