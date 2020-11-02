package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata148Test {
    @Test
    public void testSomething() {
        assertEquals(16, Kata148.areaOrPerimeter(4 , 4));
        assertEquals(32, Kata148.areaOrPerimeter(6 , 10));
    }
}