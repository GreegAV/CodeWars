package kyu8;
/*
Kata: Example Twist
Task: This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).

Add the value "codewars" to the array websites/Websites 1,000 times.

String[] websites = {};
return websites;
 */
public class Kata076 {
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];
        for (int i = 0; i <1000 ; i++) {
            websites[i]="codewars";
        }
        return websites;
    }
}
