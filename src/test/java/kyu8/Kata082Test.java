package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class Kata082Test {
    @Test
    public void testSomething() {
        assertEquals("eating like I", Kata082.reverseWords("I like eating"));
    }

    @Test
    public void testSomething2() {
        assertEquals("flying like I", Kata082.reverseWords("I like flying"));
    }

    @Test
    public void testSomething3() {
        assertEquals("nice is world The", Kata082.reverseWords("The world is nice"));
    }

}