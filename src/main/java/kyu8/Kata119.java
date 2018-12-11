package kyu8;
/*
Kata: Classic Hello World
Task: The main mode is having a method named main inside a class and should return nothing but should print
a line to the standard output with the message Hello World! i.e. print the line Hello World! to the console.
For Java the main method should receive String array as parameters that can be specified when running from
console with the command.
In many traditional programming languages can be only one main for a whole application since it denotes
the application entry point.

    java Solution.class parameter1 parameter2
Hints:

Check your references
Think about the scope of your method
 */
public class Kata119 {
    public static void main(String[] args) {
        System.out.println(String.join(" ",args));
    }
}
