package kyu8;

import java.util.regex.Pattern;

/*
Kata: Simple validation of a username with regex

Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).
 */
public class Kata165 {
    public static boolean validateUsr(String s) {
        //glhf:)
       return Pattern.matches("[a-z_0-9]{4,16}", s);
    }
}
