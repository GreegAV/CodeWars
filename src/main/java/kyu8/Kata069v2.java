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
public class Kata069v2 {
    public static int[] digitize(long n) {
        int[] res = new int[String.valueOf(n).length()];
        int count = 0;
        while (n > 9) {
            res[count] = (int) (n % 10);
            n /= 10;
            count++;
        }
        res[count] = (int) n;
        return res;
    }
}
