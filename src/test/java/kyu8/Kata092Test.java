package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata092Test {

    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Kata092.greet("english"));
    }

    @Test
    public void exampleTest2() {
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Kata092.greet("dutch"));
    }

    @Test
    public void exampleTest3() {
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Kata092.greet("IP_ADDRESS_INVALID"));
    }
}