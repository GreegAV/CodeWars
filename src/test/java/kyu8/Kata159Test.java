package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata159Test {
    @Test
    public void fail() {
        assertEquals("Fail!", Kata159.well(new String[]{"bad", "bad", "bad"}));
    }

    @Test
    public void publish() {
        assertEquals("Publish!", Kata159.well(new String[]{"good", "bad", "bad", "bad", "bad"}));
    }

    @Test
    public void series() {
        assertEquals("I smell a series!", Kata159.well(new String[]{
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }

}