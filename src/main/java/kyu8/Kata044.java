package kyu8;

/*
Kata: Fake Binary
Task: Given a string of digits,
you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
 */
public class Kata044 {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (char tmp : numberString.toCharArray()) {
            if (Integer.parseInt(Character.toString(tmp)) < 5)
                result.append("0");
            else
                result.append("1");
        }
        return result.toString();
    }
}
