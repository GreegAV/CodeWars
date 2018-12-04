package kyu8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata101Test {
    private Kata101 num;

    @Before
    public void setUp() throws Exception {
        num = new Kata101();
    }

    @After
    public void setDown() throws Exception {
        num = null;
    }

    @Test
    public void test1() {
        assertEquals(true, num.isEven(0));
    }

    @Test
    public void test2() {
        assertEquals(false, num.isEven(0.5));
    }

    @Test
    public void test3() {
        assertEquals(false, num.isEven(1));
    }

    @Test
    public void test4() {
        assertEquals(true, num.isEven(2));
    }

    @Test
    public void test5() {
        assertEquals(true, num.isEven(-4));
    }
}
