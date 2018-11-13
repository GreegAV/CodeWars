package kyu8;

/*
Kata: Convert to Binary
Task: Given a non-negative integer n, write a function toBinary/ToBinary which returns that number in a binary format.

to_binary(1)  // should return 1
to_binary(5)  // should return 101
to_binary(11) // should return 1011
 */
public class Kata024 {
    public static int toBinary(int n) {
        // newbie code
//        StringBuilder res = new StringBuilder("");
//        if (n < 2) return n;
//        else {
//            while (n > 1) {
//                res.append(n % 2);
//                n /= 2;
//            }
//            res.append(n);
//        }
//        return Integer.parseInt(res.reverse().toString());

        return Integer.parseInt(Integer.toBinaryString(n));
    }

}
