package kyu8;
/*
Kata: String repeat
Task: Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
public class Kata022 {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder res= new StringBuilder("");
        for (int i = 0; i <repeat ; i++) {
            res.append(string);
        }
        return res.toString();
    }
}
