package kyu8;
/*
Kata: Is it even?
Task: In this Kata we are passing a number (n) into a function.

Your code will determine if the number passed is even (or not).

The function needs to return either a true or false.

Numbers may be positive or negative, integers or floats.

Floats are considered UNeven for this kata.
 */
public class Kata101 {
    public boolean isEven(double n) {
        // Your awesome code here!
        if ((long)n<n && (long)(n+1)>n) return false;
        return (long)n%2==0;
    }
}
