package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Kata108Test {

    Kata108 k = new Kata108();

    @Test
    public void SampleTest1() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
    }

    @Test
    public void SampleTest2() {
        assertEquals(Arrays.asList(1, 2), k.CreateList(2));
    }

    @Test
    public void SampleTest3() {
        assertEquals(Arrays.asList(1, 2, 3), k.CreateList(3));
    }

    @Test
    public void SampleTest4() {
        assertEquals(Arrays.asList(1, 2, 3, 4), k.CreateList(4));
    }

    @Test
    public void SampleTest5() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), k.CreateList(5));
    }
}