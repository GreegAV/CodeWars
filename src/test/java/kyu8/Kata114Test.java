package kyu8;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Kata114Test {

    @Test
    public void testSomething() {
        List<String> items = Kata114.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}