package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class Kata018Test {
    @Test
    public void fixedTests1() {
        assertEquals(166, Kata018.dutyFree(12,50,1000));
    }
    @Test
    public void fixedTests2() {
        assertEquals(294, Kata018.dutyFree(17,10,500));
    }
    @Test
    public void fixedTests3() {
        assertEquals(357, Kata018.dutyFree(24,35,3000));
    }
    @Test
    public void fixedTests4() {
        assertEquals(20, Kata018.dutyFree(1400,35,10000));
    }
    @Test
    public void fixedTests5() {
        assertEquals(38, Kata018.dutyFree(700,26,7000));
    }
}