/*
Wilson primes satisfy the following condition. Let P represent a prime number.

Then ((P-1)! + 1) / (P * P) should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.
 */
public class WilsonPrime {

    public static boolean am_i_wilson(double n) {
        //your code here
        return  ((int)n==5 || (int)n==13 || (int)n==563  );
        // only known Wilson primes at all.
    }
}