package kyu8;

/*
Kata: Grasshopper - Grade book
Grade book
Complete the function so that it finds the mean of the three scores passed to it and returns
the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
 */
public class Kata154 {
    public static char getGrade(int s1, int s2, int s3) {
        int result = (s1 + s2 + s3) / 3;
        if (result < 60) return 'F';
        if (result < 70) return 'D';
        if (result < 80) return 'C';
        if (result < 90) return 'B';
        return 'A';
    }
    public static char getGrade2(int s1, int s2, int s3) {
        return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
    }
}
