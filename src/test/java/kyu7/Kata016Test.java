package kyu7;

import static org.junit.Assert.*;

import kyu7.Kata016;
import org.junit.*;

public class Kata016Test {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Kata016.evaporator(10, 10, 10));
    }
}