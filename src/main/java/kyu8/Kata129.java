package kyu8;

/*
Kata: Printing Array elements with Comma delimiters
Task: Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"
 */
public class Kata129 {
    public static String printArray(Object array[]) {
        StringBuilder sb = new StringBuilder(7);
        int i = 0;
        for (; i < array.length - 1; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        sb.append(array[i]);
        return sb.toString();
    }
}

