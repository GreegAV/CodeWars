package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata054Test {

    @Test
    public void testFixed1() {
        assertEquals("b***i***t***c***o***i***n", Kata054.twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }

    @Test
    public void testFixed2() {
        assertEquals("a***r***e", Kata054.twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}