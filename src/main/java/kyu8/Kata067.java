package kyu8;

/*
Kata: Hex to Decimal
Task: Complete the function which converts hex number (given as a string) to a decimal number.

 */
public class Kata067 {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
        // newbie code
//        String digits = "0123456789ABCDEF";
//        int val = 0;
//        for (int i = hexString.charAt(0)=='-'?1:0; i < hexString.length(); i++) {
//            char c = hexString.toUpperCase().charAt(i);
//            int d = digits.indexOf(c);
//            val = 16*val + d;
//        }
//        return hexString.charAt(0)=='-'?-1*val:val;
    }
}
