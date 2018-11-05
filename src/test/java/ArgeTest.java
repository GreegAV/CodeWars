import static org.junit.Assert.*;

import org.junit.Test;

public class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Test1: nbYear");
        testing(Arge.nbYear(1500, 5, 100, 5000),15);
    }
    public void test2() {
        System.out.println("Fixed Test2: nbYear");
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
    }
    public void test3() {
        System.out.println("Fixed Test3: nbYear");
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}