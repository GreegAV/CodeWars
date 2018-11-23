package kyu8;

/*
Kata: Convert number to reversed array of digits
Task: Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
 */
public class Kata069 {
    public static int[] digitize(long n) {
        // Code here
        StringBuilder str = new StringBuilder();
        while (n > 9) {
            str.append(n % 10);
            n /= 10;
        }
        str.append(n);
        int[] res = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            res[i] = (int) Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return res;
    }
}
