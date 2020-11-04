package kyu8;

import java.util.Arrays;

/*
Kata: Enumerable Magic #25 - Take the First N Elements

Create a method take that accepts a list/array and a number n,
and returns a list/array array of the first n elements from the list/array.

If you need help, here's a reference:

https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)

 */
public class Kata158 {
    public static int[] take(int[] arr, int n) {
        //your code;
        return Arrays.copyOfRange(arr, 0, Math.min(arr.length, n));
    }
}
