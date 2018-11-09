package kyu8;

import kyu8.Kata009;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata009Test {
    @Test
    public void tests1() {
        assertEquals("67", Kata009.numberToString(67));
    }

    @Test
    public void tests2() {
        assertEquals("123", Kata009.numberToString(123));
    }

    @Test
    public void tests3() {
        assertEquals("999", Kata009.numberToString(999));
    }
}