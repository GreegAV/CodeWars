package kyu8;

/*
Kata: Find Nearest square number
Task: Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.
 */
public class Kata034 {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}