package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata037Test {

    @Test
    public void exampleTests() {
        assertEquals(0.7781512503836435, Kata037.logs(10, 2, 3), 0.0000001);
        assertEquals(1.1132827525593785, Kata037.logs(5, 2, 3), 0.0000001);
        assertEquals(0.25938375012788123, Kata037.logs(1000, 2, 3), 0.0000001);
    }

}
