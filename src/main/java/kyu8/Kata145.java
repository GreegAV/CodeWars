package kyu8;

/*
Kata: Square(n) Sum
Complete the square sum function so that it squares each number passed into it
and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
public class Kata145 {
    public static int squareSum(int[] n) {
        //Your Code
        int result = 0;
        for (int num : n) {
            result += num * num;
        }
        return result;
    }
}