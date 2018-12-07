package kyu8;

/*
Kata: Sum without highest and lowest number
Task: Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and the lowest element
(the value, not the index!).
(The highest/lowest element is respectively only one element at each edge,
even if there are more than one with the same value!)

Example:

{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6


If array is empty, null or None, or if only 1 Element exists, return 0.
Note:In C++ instead null an empty vector is used. In C there is no null. ;-)


-- There's no null in Haskell, therefore Maybe [Int] is used. Nothing represents null.
 */
public class Kata113 {
    public static int sum(int[] numbers) {
        try {
            if (numbers.length <= 2)
                return 0;
            int min = numbers[0];
            int max = numbers[0];
            int sum = 0;
            for (int tmp : numbers) {
                if (Integer.valueOf(tmp) == null) continue;
                if (tmp >= max)
                    max = tmp;
                if (min >= tmp)
                    min = tmp;
                sum += tmp;
            }
            return sum - max - min;
        } catch (Exception e) {
        }
        return 0;
    }
}
