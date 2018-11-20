package kyu8;

import java.util.Arrays;

/*
Kata: Sort and Star
Task: You will be given an vector of string(s).
You must sort it alphabetically (case-sensitive!!) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
 */
public class Kata054 {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));

        // newbie code

//        StringBuilder result = new StringBuilder();
//        String resWord = s[0];
//        for (int i = 0; i < resWord.length() - 1; i++) {
//            result.append(resWord.charAt(i)).append("***");
//        }
//        result.append(resWord.charAt(resWord.length() - 1));
//        return result.toString();
    }
}
