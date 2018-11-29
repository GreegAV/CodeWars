package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata087Test {
    @Test
    public void testBMI() {
        assertEquals("Normal", Kata087.bmi(80, 1.80));
    }
}