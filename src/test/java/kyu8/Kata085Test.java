package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata085Test {

    @Test
    public void Test1() {
        assertEquals("should greet some people normally", "Hello, Jim!", Kata085.greet("Jim"));
    }

    @Test
    public void Test2() {
        assertEquals("should greet some people normally", "Hello, Jane!", Kata085.greet("Jane"));
    }

    @Test
    public void Test3() {
        assertEquals("should greet some people normally", "Hello, Simon!", Kata085.greet("Simon"));
    }

    @Test
    public void Test4() {
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Kata085.greet("Johnny"));
    }
}