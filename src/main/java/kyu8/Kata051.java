package kyu8;

/*
Kata: Even or Odd
Task: Create a function (or write a script in Shell)
that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class Kata051 {
    public static String even_or_odd(int number) {
        //Place code here
        return number % 2 == 0 ? "Even" : "Odd";

    }
}
