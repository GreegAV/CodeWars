package kyu8;

/*
Kata: Stringy Strings
Task: write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.

the string should start with a 1.

a string with size 6 should return :'101010'.

with size 4 should return : '1010'.

with size 12 should return : '101010101010'.

The size will always be positive and will only use whole numbers.
 */
public class Kata058 {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append((i + 1) % 2);
        }
        return sb.toString();

    }

}
