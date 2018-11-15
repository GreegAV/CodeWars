package kyu8;
/*
Kata: easy logs
Task: Add two logs with base X, with the value of A and B. Example log A + log B where the base is X.
 */
public class Kata037 {
    public static double logs(double x, double a, double b) {
        return Math.log10(a)/Math.log10(x)+Math.log10(b)/Math.log10(x);
    }
}
