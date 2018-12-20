package kyu7;

/*
Kata:Vowel Count
Task: Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */
public class Kata009 {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".contains(String.valueOf(ch))) vowelsCount++;
        }
        return vowelsCount;
    }

}