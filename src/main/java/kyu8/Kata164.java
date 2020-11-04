package kyu8;
/*
Kata: Convert a string to an array

Write a function to split a string and convert it into an array of words. For example:

"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class Kata164 {
    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");
    }
}
