package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata044Test {

    @Test
    public void testSomething01() {
        assertEquals("000111", Kata044.fakeBin("234567"));
    }

    @Test
    public void testSomething10() {
        assertEquals("111000", Kata044.fakeBin("765432"));
    }
}