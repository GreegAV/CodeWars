package kyu8;

import kyu8.Kata017;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata017Test {

    @Test
    public void test1() {
        assertEquals(-42, Kata017.makeNegative(42));
    }
}