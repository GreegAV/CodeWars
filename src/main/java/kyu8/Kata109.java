package kyu8;
/*
Kata: Grasshopper - Basic Function Fixer
Task: Fix the function
I created this function to add five to any number that was passed in to it and return the new value.
It doesn't throw any errors but it returns the wrong number.

Can you help me fix the function?
 */
public class Kata109 {
    public static int addFive(int num) {
        int total = num + 5;
        return total; //was return num;
    }
}
