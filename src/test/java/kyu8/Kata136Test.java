package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Kata136Test {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(Kata136.barTriang(
                new double[]{4, 6}, new double[]{12, 4}, new double[]{10, 10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(Kata136.barTriang(
                new double[]{4, 2}, new double[]{12, 2}, new double[]{6, 10})));

    }
}
