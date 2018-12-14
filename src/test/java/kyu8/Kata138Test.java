package kyu8;
import static org.junit.Assert.*;
import org.junit.Test;

public class Kata138Test {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(Kata138.noBoringZeros(1450), 145);
        testing(Kata138.noBoringZeros(960000), 96);
        testing(Kata138.noBoringZeros(1050), 105);
        testing(Kata138.noBoringZeros(-1050), -105);
    }
}