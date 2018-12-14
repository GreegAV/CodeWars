package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata135Test {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                Kata135.sayHello("Mr. Spock"));
    }

    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                Kata135.sayHello("Captain Kirk"));
    }

    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                Kata135.sayHello("Liutenant Uhura"));
    }

    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                Kata135.sayHello("Dr. McCoy"));
    }
}