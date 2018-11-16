package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata041Test {
    @Test
    public void testTrue() {
        assertEquals(Kata041.convert(true), "true");
    }

    @Test
    public void testFalse() {
        assertEquals(Kata041.convert(false), "false");
    }
}