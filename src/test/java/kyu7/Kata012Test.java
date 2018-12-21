package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata012Test {
    @Test
    public void test() {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Kata012.printerError(s));
    }
}