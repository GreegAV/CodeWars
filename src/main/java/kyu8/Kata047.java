package kyu8;
/*
Kata: Simple multiplication
Task: This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */
public class Kata047 {
    public static int simpleMultiplication(int n) {
        //your code here
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
