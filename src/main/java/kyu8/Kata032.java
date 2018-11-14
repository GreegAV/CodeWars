package kyu8;

/*
Kata: Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right

Task: Description:
Remove n exclamation marks in the sentence from left to right. n is positive integer.

Examples
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
Note
Please don't post issue about difficulty or duplicate.
 */
public class Kata032 {
    public static String remove(String s, int n) {

        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!", "");
        }
        return s;

    }
}
