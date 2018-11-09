package kyu8;

import kyu8.Kata015;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata015Test {
    @Test
    public void testBoolToWord1() {
        assertEquals(Kata015.boolToWord(true), "Yes");
    }

    @Test
    public void testBoolToWord2() {
        assertEquals(Kata015.boolToWord(false), "No");
    }
}