package kyu8;

/*
Kata: Calculate average
Task: Write function avg which calculates average of numbers in given list.
 */
public class Kata049 {
    public static double find_average(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
