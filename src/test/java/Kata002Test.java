import static org.junit.Assert.*;

import org.junit.Test;

public class Kata002Test {
    @Test
    public void test1() {
        assertEquals(false, Kata002.am_i_wilson(0));
    }

    @Test
    public void test2() {
        assertEquals(false, Kata002.am_i_wilson(1));
    }

    @Test
    public void test3() {
        assertEquals(true, Kata002.am_i_wilson(5));
    }
}