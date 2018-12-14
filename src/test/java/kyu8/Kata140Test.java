package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata140Test {
    @Test
    public void test1() {
        assertEquals(1,
                Kata140.findAverage(new int[]{1}));
    }

    @Test
    public void test2() {
        assertEquals(4,
                Kata140.findAverage(new int[]{1, 3, 5, 7}));
    }
}