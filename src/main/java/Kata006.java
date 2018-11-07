/*
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
    }

    public static void main(String[] args) {
        Object[] aaaa = {1, 5, 3};
        System.out.println(check(aaaa, 2));
    }

}