package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata075Test {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", Kata075.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", Kata075.weatherInfo(23));
    }
}