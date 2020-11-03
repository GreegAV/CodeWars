package kyu8;

import java.util.List;

/*
Kata: Sum Mixed Array

Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
 */
public class Kata157 {
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            sum += Integer.parseInt("" + o);
        }
        return sum;
    }
}
