package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata053Test {

    @Test
    public void testSomething1() {
        assertEquals("1 sheep...", Kata053.countingSheep(1));
    }

    @Test
    public void testSomething2() {
        assertEquals("1 sheep...2 sheep...", Kata053.countingSheep(2));
    }

    @Test
    public void testSomething3() {
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata053.countingSheep(3));
    }
}