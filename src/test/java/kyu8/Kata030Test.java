package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata030Test {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{"head", "body", "tail"},
                Kata030.fixTheMeerkat(new String[]{"tail", "body", "head"}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{"heads", "body", "tails"},
                Kata030.fixTheMeerkat(new String[]{"tails", "body", "heads"}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{"top", "middle", "bottom"},
                Kata030.fixTheMeerkat(new String[]{"bottom", "middle", "top"}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{"upper legs", "torso", "lower legs"},
                Kata030.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs"}));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{"sky", "rainbow", "ground"},
                Kata030.fixTheMeerkat(new String[]{"ground", "rainbow", "sky"}));
    }
}