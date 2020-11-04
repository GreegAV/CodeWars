package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class Kata158Test {
    @Test
    public void basicTest3() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, Kata158.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

}