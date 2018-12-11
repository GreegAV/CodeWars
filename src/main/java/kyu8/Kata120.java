package kyu8;

/*
Kata: Find the position!
Task: When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"

This kata is meant for beginners. Rank and upvote to bring it out of beta
 */
public class Kata120 {
    public static String position(char alphabet) {
        return "Position of alphabet: " + (Character.getNumericValue(Character.toLowerCase(alphabet)) - 9);
        // return "Position of alphabet: " + (alphabet-'a'+1);
        // alternative variant
    }
}
