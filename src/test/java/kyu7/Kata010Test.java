package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata010Test {
    @Test
    public void One_Digit_Number() {
        assertEquals("Automorphic", Kata010.autoMorphic(1));
        assertEquals("Not!!", Kata010.autoMorphic(3));
        assertEquals("Automorphic", Kata010.autoMorphic(6));
        assertEquals("Not!!", Kata010.autoMorphic(9));
    }

    @Test
    public void Two_Digit_Number() {
        assertEquals("Automorphic", Kata010.autoMorphic(25));
        assertEquals("Not!!", Kata010.autoMorphic(13));
        assertEquals("Automorphic", Kata010.autoMorphic(76));
        assertEquals("Not!!", Kata010.autoMorphic(95));
    }

    @Test
    public void Larger_Number() {
        assertEquals("Automorphic", Kata010.autoMorphic(625));
        assertEquals("Not!!", Kata010.autoMorphic(225));
        assertEquals("Not!!", Kata010.autoMorphic(425));
        assertEquals("Not!!", Kata010.autoMorphic(399));
    }
}