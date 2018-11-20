package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata052Test {

    @Test
    public void basicTest1() {
        assertEquals("H!!", Kata052.replace("Hi!"));
    }

    @Test
    public void basicTest2() {
        assertEquals("!H!! H!!", Kata052.replace("!Hi! Hi!"));
    }

    @Test
    public void basicTest3() {
        assertEquals("!!!!!", Kata052.replace("aeiou"));
    }

    @Test
    public void basicTest4() {
        assertEquals("!BCD!", Kata052.replace("ABCDE"));
    }
}