package kyu8;

/*
Kata:Surface Area and Volume of a Box
Task: Write a function that returns the total surface area and volume of a box as an array: [area, volume].
 */
public class Kata072 {
    public static int[] getSize(int w,int h,int d) {
        //To-Do
        return new int[]{2*(w*h+w*d+h*d),w*h*d};
    }
}
