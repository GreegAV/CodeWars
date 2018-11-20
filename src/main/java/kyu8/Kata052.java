package kyu8;

/*
Kata: Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence
Task: Description:
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

Examples
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"
Note
Please don't post issue about difficulty or duplicate. Because:

That's unfair on the kata creator.
This is a valid kata and introduces new people to javascript some regex or loops,
depending on how they tackle this problem. --matt c
 */
public class Kata052 {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
