package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata012v2Test {
    @Test
    public void test() {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Kata012v2.printerError(s));
    }
}