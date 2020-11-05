package kyu8;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Kata036Test {

    private static void test(double expected, double[] arrVal, String[] arrUnit) {
        assertEquals(expected, Kata036.Solution(arrVal, arrUnit), expected * 1e-5);
    }

    @Test
    public void sampleTests() {
        test(6.67e-12, new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"});
        test(6.67e-9, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"});
        test(6.67e-5, new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "cm"});
    }

}
