package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata167Test {
    @Test
    public void basicTests() {
        assertEquals("More than a handful!",Kata167.howManyDalmatians(26));
        assertEquals("Hardly any" ,Kata167.howManyDalmatians(8));
        assertEquals("More than a handful!" ,Kata167.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,Kata167.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,Kata167.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,Kata167.howManyDalmatians(101));
    }
}