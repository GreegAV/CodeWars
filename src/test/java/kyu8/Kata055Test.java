package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata055Test {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testBasic() {
        System.out.println("Testing basics.");
        testing(Kata055.xor(false, false), false);
        testing(Kata055.xor(true, false), true);
        testing(Kata055.xor(false, true), true);
        testing(Kata055.xor(true, true), false);
    }

    @Test
    public void testNested() {
        System.out.println("Testing nested calls.");
        testing(Kata055.xor(false, Kata055.xor(false, false)), false);
        testing(Kata055.xor(Kata055.xor(true, false), false), true);
        testing(Kata055.xor(Kata055.xor(true, true), false), false);
        testing(Kata055.xor(true, Kata055.xor(true, true)), true);
        testing(Kata055.xor(Kata055.xor(false, false), Kata055.xor(false, false)), false);
        testing(Kata055.xor(Kata055.xor(false, false), Kata055.xor(false, true)), true);
        testing(Kata055.xor(Kata055.xor(true, false), Kata055.xor(false, false)), true);
        testing(Kata055.xor(Kata055.xor(true, false), Kata055.xor(true, false)), false);
        testing(Kata055.xor(Kata055.xor(true, true), Kata055.xor(true, false)), true);
        testing(Kata055.xor(Kata055.xor(true, Kata055.xor(true, true)), Kata055.xor(Kata055.xor(true, true), false)), true);
    }
}