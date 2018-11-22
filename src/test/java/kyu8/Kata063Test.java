package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata063Test {

    Kata063 myUtil = new Kata063();

    @Test
    public void test0() throws Exception {
        assertEquals(false, myUtil.isDigit("s2324"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(true, myUtil.isDigit("234.4"));
    }


    @Test
    public void test5() throws Exception {
        assertEquals(true, myUtil.isDigit("2345"));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(true, myUtil.isDigit("-2345"));
    }


    @Test
    public void test1() throws Exception {
        assertEquals(true, myUtil.isDigit("-234.4"));
    }


    @Test
    public void test2() throws Exception {
        assertEquals(false, myUtil.isDigit("2-2"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(false, myUtil.isDigit("2-3-4"));
    }

}