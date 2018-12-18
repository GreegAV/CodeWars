package kyu7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Kata003Test {

    @Test
    public void basicTest1() {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        assertEquals(Arrays.asList("Ruby", "Python"), Kata003.myLanguages(map1));
    }

    @Test
    public void basicTest2() {
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), Kata003.myLanguages(map2));
    }

    @Test
    public void basicTest3() {
        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);
        assertEquals(Collections.emptyList(), Kata003.myLanguages(map3));
    }
}
