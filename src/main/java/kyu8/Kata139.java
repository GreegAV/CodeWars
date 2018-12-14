package kyu8;

/*
Kata: How do I compare numbers?
Task: What could be easier than comparing integer numbers?
However, the given piece of code doesn't recognize some of the special numbers for a reason to be found.
Your task is to find the bug and eliminate it.
 */
public class Kata139 {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String) p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
    static final Object[][] tests = {
//            {0, "nothing"},
//            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    public static void main(String[] args) {
        for (Object[] t : tests)
            System.out.println(whatIs((Integer) t[0]));


    }
}