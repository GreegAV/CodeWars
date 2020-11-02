package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata147Test {
    @Test
    public void testSomething2() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!",
                Kata147.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
    }

    @Test
    public void testSomething5() {
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", Kata147.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    public void testSomething6() {
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", Kata147.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    public void testSomething4() {
        assertEquals("Oi! Sheep number 4! You are about to be eaten by a wolf!", Kata147.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    public void testSomething42() {
        assertEquals("Oi! Sheep number 4! You are about to be eaten by a wolf!", Kata147.warnTheSheep(new String[]{"sheep", "sheep", "wolf", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    public void testSomething1() {
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", Kata147.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    }

    @Test
    public void testSomething0() {
        assertEquals("Pls go away and stop eating my sheep", Kata147.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}