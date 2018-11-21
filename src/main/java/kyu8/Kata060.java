package kyu8;

/*
Kata: Reversed Strings
Task: Complete the solution so that it reverses the string value passed into it.

Kata.solution("world") //returns "dlrow"

 */
public class Kata060 {
    public static String solution(String str) {
        // Your code here...
        return new String(new StringBuilder(str).reverse());
    }
}
