package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata057Test {

    @Test
    public void simpleTest1() {
        assertEquals(1, Kata057.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }

    @Test
    public void simpleTest3() {
        assertEquals(3, Kata057.getAverage(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void simpleTest2() {
        assertEquals(2, Kata057.getAverage(new int[]{2, 2, 2, 2}));
    }


}