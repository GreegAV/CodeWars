/*
Kata:All Star Code Challenge #18

Task: This Kata is intended as a small challenge for my students

Create a function called that accepts 2 string arguments and returns an integer
of the count of occurrences the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned.

strCount("Hello", 'o') // => 1
strCount("Hello", 'l') // => 2
strCount("", 'z')      // => 0
Notes:

The first argument can be an empty string
The second string argument will always be of length 1
 */
public class Kata012 {
    public static int strCount(String str, char letter) {
        //write code here
        int count = 0;
        for (char tmp : str.toCharArray()) {
            if (tmp == letter) count++;
        }
        return count;
    }
}