package kyu8;

/*
Kata: Merging sorted integer arrays (without duplicates)

Task: Write a function that merges two sorted arrays into a single one.
The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.
 */
public class Kata028_2 {

    private static void sortArray(int[] resArray) {
        for (int i = 0; i < resArray.length - 1; i++) {
            for (int j = i; j < resArray.length - 1; j++) {
                if (resArray[i] > resArray[j + 1]) {
                    int tmp = resArray[i];
                    resArray[i] = resArray[j + 1];
                    resArray[j + 1] = tmp;
                }
            }
        }
    }

    public static int[] mergeArrays(int[] first, int[] second) {

        return null;
    }
}
