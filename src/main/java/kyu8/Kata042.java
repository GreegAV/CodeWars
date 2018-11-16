package kyu8;

/*
Kata: Find the smallest integer in the array
Task: Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class Kata042 {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int tmp : args) {
            if (tmp < min)
                min = tmp;
        }
        return min;
    }
}
