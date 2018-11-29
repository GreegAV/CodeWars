package kyu8;
/*
Kata: Beginner Series #2 Clock
Task: Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to miliseconds.

#####Example:

Past(0, 1, 1) == 61000
Note! h, m and s will be only Natural numbers!
 */
public class Kata088 {
    public static int Past(int h, int m, int s)
    {
        return 1000*(s+60*(m+60*h));//Happy Coding! ^_^
    }
}
