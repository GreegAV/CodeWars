package kyu8;

import java.util.ArrayList;
import java.util.List;

/*
Kata: Filtering even numbers (Bug Fixes)
Task: Fix the bug in Filtering method
The method is supposed to remove even numbers from the list and return a list that contains odd number.

However, there is a bug in the method that needs to be resolved.
 */
public class Kata116 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> filteredList = new ArrayList();
        for (int num : listOfNumbers) {
            if (num % 2 != 0) {
                filteredList.add(num);
            }
        }
        return filteredList;
    }
}
