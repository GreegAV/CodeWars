package kyu8;


/*
Kata: Regexp Basics - is it a digit?
Task Implement String#digit? (in Java StringUtils.isDigit(String)),
which should return true if given object is a digit (0-9), false otherwise.
 */
public class Kata118v2 {
    public static boolean isDigit(String s) {
        // your code goes here
        return s.matches("[0-9]");
    }
}
