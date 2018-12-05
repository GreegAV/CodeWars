package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata102Test {

    @Test
    public void test1() {
        assertEquals("ttlheoiscstk", Kata102.tripleTrouble("this", "test", "lock"));
    }

    @Test
    public void tests2() {
        assertEquals("abcabc", Kata102.tripleTrouble("aa", "bb", "cc"));
    }

    @Test
    public void test3() {
        assertEquals("Batman", Kata102.tripleTrouble("Bm", "aa", "tn"));
    }

    @Test
    public void test4() {
        assertEquals("LexLuthor", Kata102.tripleTrouble("LLh", "euo", "xtr"));
    }
}