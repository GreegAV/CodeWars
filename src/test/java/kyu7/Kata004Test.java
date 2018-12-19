package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata004Test {

    @Test
    public void test1() {
        assertEquals(2, Kata004.whereIsHe(3, 1, 1));
    }

    @Test
    public void test2() {
        assertEquals(3, Kata004.whereIsHe(5, 2, 3));
    }
    @Test
    public void test3() {
        assertEquals(42, Kata004.whereIsHe(73, 24, 41));
    }
}