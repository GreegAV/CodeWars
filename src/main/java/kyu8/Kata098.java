package kyu8;

/*
Kata: Find numbers which are divisible by given number
Task: Write a function which takes two arguments and returns all numbers which are divisible by given divisor.
First argument is array of numbers and the second is divisor.

Example
divisibleBy([1,2,3,4,5,6], 2) == [2,4,6]
divisibleBy([1,2,3,4,5,6], 2) == [2,4,6]
 */
public class Kata098 {
    public static long[] divisibleBy(long[] numbers, long divider) {
        int count = 0;
        for (long tmp : numbers)
            if ((tmp % divider == 0))
                count++;
        long[] res = new long[count];
        int count2 = 0;
        for (long tmp : numbers)
            if (tmp % divider == 0) {
                res[count2] = tmp;
                count2++;
            }
        return res;
    }
}
