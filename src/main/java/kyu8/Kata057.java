package kyu8;

/*
Kata: Get the mean of an array
Task: It's the academic year's end, fateful moment of your school report.
The averages must be calculated. All the students come to you and entreat you to calculate their average for them.
Easy ! You just need to write a script.

Return the average of the given array rounded down to its nearest integer.

The array will never be empty.
 */
public class Kata057 {
    public static int getAverage(int[] marks) {
        int avg = 0;
        for (int tmp : marks) {
            avg += tmp;
        }
        return avg/marks.length;
    }
}
