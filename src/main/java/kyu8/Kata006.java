package kyu8;

/*
Kata: You only need one - Beginner
Task:

You will be given an array a and a value x.
All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not.
 */
public class Kata006 {

    public static boolean check(Object[] a, Object x) {
        // Your code here
        for (Object tmp : a) {
            if (tmp.equals(x))
                return true;
        }
        return false;

        // Bests solutions
        // return Arrays.indexOf(a, x) != -1;
        // return Arrays.asList(a).contains(x);
    }
}