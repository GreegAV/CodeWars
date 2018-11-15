package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata039Test {
    @Test
    public void test1() {
        assertEquals(1,
                Kata039.summation(1));
    }

    @Test
    public void test2() {
        assertEquals(36,
                Kata039.summation(8));
    }
}