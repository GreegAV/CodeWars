package kyu6;

/*
Kata: Stop gninnipS My sdroW!
Task:
Write a function that takes in a string of one or more words, and returns the same string,
 but with all five or more letter words reversed (Just like the name of this Kata).
 Strings passed in will consist of only letters and spaces.
 Spaces will be included only when more than one word is present.
 */
public class Kata004 {

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String result = "";
        if (sentence.split(" ").length>1 && sentence.length()>5) {
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length()<5) result+=words[i]+" ";
                else result+=new StringBuilder(words[i]).reverse().toString()+" ";
            }
            return result.trim();
        } else {
            return sentence.length()>5?new StringBuilder(sentence).reverse().toString():sentence;
        }
    }
}
