package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata168Test {
    @Test
    public void exampleTests() {
        assertEquals("1x^3", Kata168.integrate(3,2));
        assertEquals("2x^6", Kata168.integrate(12,5));
        assertEquals("10x^2", Kata168.integrate(20,1));
        assertEquals("10x^4", Kata168.integrate(40,3));
        assertEquals("30x^3", Kata168.integrate(90,2));
    }
}