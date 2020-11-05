package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata169Test {
    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata169.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata169.greet("Greg", "Daniel"));
    }
}