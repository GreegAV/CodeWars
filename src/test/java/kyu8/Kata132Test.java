package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata132Test {

    @Test
    public void oscar88() {
        assertEquals("Leo finally won the oscar! Leo is happy", Kata132.leo(88));
    }

    @Test
    public void oscar86() {
        assertEquals("Not even for Wolf of wallstreet?!", Kata132.leo(86));
    }

    @Test
    public void below88() {
        assertEquals("When will you give Leo an Oscar?", Kata132.leo(87));
        assertEquals("When will you give Leo an Oscar?", Kata132.leo(83));
        assertEquals("When will you give Leo an Oscar?", Kata132.leo(85));
    }

    @Test
    public void over88() {
        assertEquals("Leo got one already!", Kata132.leo(89));
        assertEquals("Leo got one already!", Kata132.leo(90));
        assertEquals("Leo got one already!", Kata132.leo(95));
    }

}