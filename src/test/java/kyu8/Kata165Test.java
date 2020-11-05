package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata165Test {
        @Test
        public void basicTests() {
            assertTrue(Kata165.validateUsr("regex"));
            assertFalse(Kata165.validateUsr("a"));
            assertFalse(Kata165.validateUsr("Hass"));
            assertFalse(Kata165.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
            assertFalse(Kata165.validateUsr(""));
            assertTrue(Kata165.validateUsr("____"));
            assertFalse(Kata165.validateUsr("012"));
            assertTrue(Kata165.validateUsr("p1pp1"));
            assertFalse(Kata165.validateUsr("asd43 34"));
            assertTrue(Kata165.validateUsr("asd43_34"));
        }
    }