package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata046Test {
    Kata046 K = new Kata046();
    @Test
    public void sampleTest() {
        assertEquals(4, K.multiply(2, 2));
        assertEquals(10, K.multiply(5, 2));
        assertEquals(100, K.multiply(100, 1));
        assertEquals(0, K.multiply(0, 1000));
    }
}