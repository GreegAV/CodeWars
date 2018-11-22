package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata067Test {

    @Test
    public void example1() {
        // assertEquals("expected", "actual");
        assertEquals(1, Kata067.hexToDec("1"));
    }

    @Test
    public void example10() {
        // assertEquals("expected", "actual");
        assertEquals(10, Kata067.hexToDec("a"));
    }

    @Test
    public void example16() {
        // assertEquals("expected", "actual");
        assertEquals(16, Kata067.hexToDec("10"));
    }

    @Test
    public void example255() {
        // assertEquals("expected", "actual");
        assertEquals(255, Kata067.hexToDec("FF"));
    }

    @Test
    public void example12() {
        // assertEquals("expected", "actual");
        assertEquals(-12, Kata067.hexToDec("-C"));
    }

}