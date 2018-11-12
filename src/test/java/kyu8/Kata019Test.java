package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;


public class Kata019Test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Kata019.reverse(5));
    }
}