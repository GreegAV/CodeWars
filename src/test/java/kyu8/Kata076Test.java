package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata076Test {

    @Test
    public void test() {
        String[] websites = Kata076.kataExampleTwist();
        assertEquals("The array is still empty", true, websites.length > 0);
    }

    @Test
    public void test2() {
        String[] websites = Kata076.kataExampleTwist();
        assertEquals("The array does not equal 1,000", true, websites.length == 1000);
    }

    @Test
    public void test3() {
        String[] websites = Kata076.kataExampleTwist();
        boolean allCodewars = true;
        for (int i = 0; i < websites.length; i++)
            if (!"codewars".equals(websites[i]))
                allCodewars = false;
        assertEquals("Every element in the array must contain the value \"codewars\"", true, allCodewars);
    }
}