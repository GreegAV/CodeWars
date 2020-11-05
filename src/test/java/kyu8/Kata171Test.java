package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata171Test {
    @Test
    public void testOtherAngle() {
        assertEquals(123, Kata171.otherAngle(45, 12));
        assertEquals(70, Kata171.otherAngle(50, 60));
    }
}