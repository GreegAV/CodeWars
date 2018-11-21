package kyu8;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class Kata059Test {

    @Test
    public void test1() {
        assertEquals(true, Kata059.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, Kata059.isDivisible(3,3,4));
    }

}
