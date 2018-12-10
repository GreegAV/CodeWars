package kyu8;

/*
Kata: Find Maximum and Minimum Values of a List
Task:Your task is to make two functions, max and min (maximum and minimum in PHP)
that take a(n) array/vector of integers list as input and outputs, respectively,
the largest and lowest number in that array/vector.

#Examples

max({4,6,2,1,9,63,-134,566}) returns 566
min({-52, 56, 30, 29, -54, 0, -110}) returns -110
max({5}) returns 5
min({42, 54, 65, 87, 0}) returns 0
#Notes

You may consider that there will not be any empty arrays/vectors.
 */
public class Kata117 {
    public int min(int[] list) {
        int min = list[0];
        for (int tmp : list) {
            if (min > tmp)
                min = tmp;
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int tmp : list) {
            if (max < tmp)
                max = tmp;
        }
        return max;
    }
}
