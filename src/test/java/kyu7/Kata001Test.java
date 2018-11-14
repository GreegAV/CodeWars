package kyu7;

import static org.junit.Assert.*;

import kyu7.Kata001;
import org.junit.Test;

public class Kata001Test {

    @Test
    public void test1() {
        assertEquals(Kata001.nbYear(1500, 5, 100, 5000), 15);
    }

    @Test
    public void test2() {
        assertEquals(Kata001.nbYear(1500000, 2.5, 10000, 2000000), 10);
    }

    @Test
    public void test3() {
        assertEquals(Kata001.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}