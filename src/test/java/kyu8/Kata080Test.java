package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata080Test {
    @Test
    public void test1() {
        assertEquals(5, Kata080.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, Kata080.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, Kata080.howOld("1 year old"));
    }
}