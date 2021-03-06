package kyu8;

/*
Kata: Formatting decimal places #0
Task: Each number should be formatted that it is rounded to two decimal places.
You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

Example:
5.5589 is rounded 5.56
3.3424 is rounded 3.34
 */
public class Kata128 {
    public static double TwoDecimalPlaces(double number) {
        return (int) number + (Math.round((number * 100) % 100)) / 100.0;
        //Double.parseDouble(String.format("%.2f", number)) do not work dut to national delimiter
    }
}