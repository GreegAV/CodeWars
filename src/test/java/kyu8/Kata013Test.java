package kyu8;

import kyu8.Kata013;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata013Test {
    @Test
    public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata013.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }

    @Test
    public void testSomething2() {
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata013.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    }

    @Test
    public void testSomething3() {
        assertEquals("8aaaaaddddr", Kata013.noSpace("8aaaaa dddd r     "));
    }

    @Test
    public void testSomething4() {
        assertEquals("jfBmgklf8hg88lbe8", Kata013.noSpace("jfBm  gk lf8hg  88lbe8 "));
    }

    @Test
    public void testSomething5() {
        assertEquals("8jaam", Kata013.noSpace("8j aam"));
    }

}