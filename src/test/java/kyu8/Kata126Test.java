package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata126Test {
    @Test
    public void exampleTests() {
        String result = Kata126.helloName("Javatlacati");
        //                    message                                     expected               actual
        assertEquals("Hello my name is Javatlacati is not " + result, "Hello my name is Javatlacati", result);
    }
}