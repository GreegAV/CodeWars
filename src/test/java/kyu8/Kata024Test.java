package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;


public class Kata024Test {

    @Test
    public void testToBinary1() {
        assertEquals(1, Kata024.toBinary(1));
    }

    @Test
    public void testToBinary2() {
        assertEquals(10, Kata024.toBinary(2));
    }

    @Test
    public void testToBinary3() {
        assertEquals(11, Kata024.toBinary(3));
    }

    @Test
    public void testToBinary5() {
        assertEquals(101, Kata024.toBinary(5));
    }
}