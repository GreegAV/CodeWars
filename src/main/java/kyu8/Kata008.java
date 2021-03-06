package kyu8;

/*
Kata: Abbreviate a Two Word Name
Task:

Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot seperating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F
 */
public class Kata008 {

    public static String abbrevName(String name) {
        return name.substring(0,1).toUpperCase()+"."+ name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase();
    }
}