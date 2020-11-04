package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata161Test {
        @Test
        public void testChar() {
            assertEquals('7', Kata161.getChar(55));
            assertEquals('8', Kata161.getChar(56));
            assertEquals('9', Kata161.getChar(57));
            assertEquals(':', Kata161.getChar(58));
            assertEquals(';', Kata161.getChar(59));
            assertEquals('<', Kata161.getChar(60));
            assertEquals('=', Kata161.getChar(61));
            assertEquals('>', Kata161.getChar(62));
            assertEquals('?', Kata161.getChar(63));
            assertEquals('@', Kata161.getChar(64));
            assertEquals('A', Kata161.getChar(65));
            assertEquals("getChar should return a `char`", 0, Character.compare('!', Kata161.getChar(33)));
        }
    }