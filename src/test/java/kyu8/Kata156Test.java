package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata156Test {
    @Test
    public void basicTests() {
        assertTrue(Kata156.checkForFactor(10, 2));
        assertTrue(Kata156.checkForFactor(63, 7));
        assertTrue(Kata156.checkForFactor(2450, 5));
        assertTrue(Kata156.checkForFactor(24612, 3));
    }

}