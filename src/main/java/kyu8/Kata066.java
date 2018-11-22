package kyu8;

import java.util.Arrays;

/*
Kata: A Needle in the Haystack
Task: Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Python, Ruby & Elixir

find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
JavaScript & TypeScript

findNeedle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
Java

findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
should return

"found the needle at position 5"
 */
public class Kata066 {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
        // newbie code
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] != null && haystack[i].equals("needle"))
//                return "found the needle at position " + i;
//        }
//        return "";
    }
}
