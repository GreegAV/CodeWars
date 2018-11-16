package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata048Test {

    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", Kata048.toAlternativeString("hello world"));
        assertEquals("hello world", Kata048.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", Kata048.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", Kata048.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", Kata048.toAlternativeString(Kata048.toAlternativeString("Hello World")));
        assertEquals("12345", Kata048.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", Kata048.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", Kata048.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", Kata048.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", Kata048.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", Kata048.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", Kata048.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}