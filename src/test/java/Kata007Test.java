import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata007Test {
    @Test
    public void under3Tests() {
        assertEquals(40, Kata007.rentalCarCost(1));
        assertEquals(80, Kata007.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, Kata007.rentalCarCost(3));
        assertEquals(140, Kata007.rentalCarCost(4));
        assertEquals(180, Kata007.rentalCarCost(5));
        assertEquals(220, Kata007.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, Kata007.rentalCarCost(7));
        assertEquals(270, Kata007.rentalCarCost(8));
        assertEquals(310, Kata007.rentalCarCost(9));
        assertEquals(350, Kata007.rentalCarCost(10));
    }
}