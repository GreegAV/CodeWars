package kyu8;

/*
Kata: Are You Playing Banjo?
Task: Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo"
name + " does not play banjo"
Names given are always valid strings.
 */
public class Kata142 {
    public static String areYouPlayingBanjo(String name) {
        // Program me!
        return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }
}