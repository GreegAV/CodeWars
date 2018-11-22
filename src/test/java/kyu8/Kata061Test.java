package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata061Test {
    @Test
    public void test1() {
        assertEquals("I love you", Kata061.howMuchILoveYou(1));
        assertEquals("a little", Kata061.howMuchILoveYou(2));
        assertEquals("not at all", Kata061.howMuchILoveYou(6));
    }
}