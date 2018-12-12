package kyu8;

/*
Kata: String Templates - Bug Fixing #5
Task:
Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature,
Help Timmy with his string template so it works as he expects!

 */
public class Kata127 {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}