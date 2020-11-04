package kyu8;

/*
Kata: Area of a Square

Complete the function that calculates the area of the red square,
when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

Graph

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */
public class Kata162 {
    public static double squareArea(double A) {
        //your code;
        return Math.round(Math.pow(2 * A / Math.PI, 2) * 100) / 100.;
    }
}
