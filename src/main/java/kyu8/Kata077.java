package kyu8;

/*
Kata: Array plus array
Task I'm new to coding and now I want to get the sum of two arrays...
actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.
 */
public class Kata077 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int a : arr1) {
            sum += a;
        }
        for (int a : arr2) {
            sum += a;
        }
        return sum;
    }
}
