package kyu8;

/*
Kata: Beginner - Reduce but Grow
Task: Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class Kata025 {
    public static int grow(int[] x) {
        int result = 1;
        for (int tmp : x) {
            result *= tmp;
        }
        return result;

    }
}
