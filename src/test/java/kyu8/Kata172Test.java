package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata172Test {
    @Test
    public void testSetToThree() {
        Kata172 c = new Kata172();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }
}