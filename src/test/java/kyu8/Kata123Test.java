package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata123Test {

    @Test
    public void BasicTest1() {
        assertEquals(true, Kata123.isPlural(0f));
    }

    @Test
    public void BasicTest2() {
        assertEquals(true, Kata123.isPlural(0.5f));
    }

    @Test
    public void BasicTest3() {
        assertEquals(false, Kata123.isPlural(1f));
    }

    @Test
    public void BasicTest4() {
        assertEquals(true, Kata123.isPlural(100f));
    }
}