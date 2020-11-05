package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kata063v2Test {

    Kata063v2 myUtil = new Kata063v2();

    @Test
    public void test0() throws Exception {
        assertFalse(myUtil.isDigit("s2324"));
    }

    @Test
    public void test4() throws Exception {
        assertTrue(myUtil.isDigit("234.4"));
    }


    @Test
    public void test5() throws Exception {
        assertTrue(myUtil.isDigit("2345"));
    }

    @Test
    public void test6() throws Exception {
        assertTrue(myUtil.isDigit("-2345"));
    }


    @Test
    public void test1() throws Exception {
        assertTrue(myUtil.isDigit("-234.4"));
    }


    @Test
    public void test2() throws Exception {
        assertFalse(myUtil.isDigit("2-2"));
    }

    @Test
    public void test3() throws Exception {
        assertFalse(myUtil.isDigit("2-3-4"));
    }
}