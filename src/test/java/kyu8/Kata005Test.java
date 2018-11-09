package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class Kata005Test {
    @Test
    public void fixedTests() {
        assertEquals(7, Kata005.oddCount(15));
        assertEquals(7511, Kata005.oddCount(15023));
    }
}