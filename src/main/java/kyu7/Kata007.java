package kyu7;

/*
Kata: Highest and Lowest
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5")  // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Kata007 {
    public static String HighAndLow(String numbers) {
        // Code here or
        String[] nums = numbers.split(" ");
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        for (String str : nums) {
            min = Math.min(min, Integer.parseInt(str));
            max = Math.max(max, Integer.parseInt(str));
        }
        return "" + max + " " + min;
    }
}