package kyu8;

/*
Kata: FIXME: Replace all dots
Task: The code provided is supposed replace all the dots . in the specified String str with dashes -

But it's not working properly.

Task
Fix the bug so we can all go home early.

Notes
String str will never be null.
 */
public class Kata107 {
    public static String replaceDots(final String str) {
        return str.replace(".", "-"); //  old version was    return str.replaceAll(".", "-");
    }
}
