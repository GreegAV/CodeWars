package kyu8;
/*
Kata: If you can't sleep, just count sheep!!
Task: If you can't sleep, just count sheep!!

Task:
Given a number, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep..."

Note:
You will always receive a positive integer.
 */
public class Kata053 {
    public static String countingSheep(int num) {
        StringBuilder sheeps = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sheeps.append(i);
            sheeps.append(" sheep...");
        }
        return sheeps.toString();
    }
}
