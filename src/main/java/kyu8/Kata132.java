package kyu8;

/*
Kata: Leonardo Dicaprio and Oscars
Task: You have to write a function that describe Leo:

def leo(oscar):
  pass
if oscar was (integer) 88, you have to return "Leo finally won the oscar! Leo is happy".
if oscar was 86, you have to return "Not even for Wolf of wallstreet?!"
if it was not 88 or 86 (and below 88) you should return "When will you give Leo an Oscar?"
if it was over 88 you should return "Leo got one already!"


 */
public class Kata132 {
    public static String leo(final int oscar) {
        switch (oscar) {
            case 88:
                return "Leo finally won the oscar! Leo is happy";
            case 86:
                return "Not even for Wolf of wallstreet?!";
            default:
                return oscar < 88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
        }
    }
}
