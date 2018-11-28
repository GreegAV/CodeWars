package kyu8;
/*
Kata: Reversed Words
Task: Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"
 */
public class Kata082 {
    public static String reverseWords(String str){
        //write your code here...
        String[] words=str.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            res.append(words[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}
