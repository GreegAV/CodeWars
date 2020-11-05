package kyu8;

/*
Kata: Grasshopper - Personalized Message

Personalized greeting
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:

case	return
name equals owner	'Hello boss'
otherwise	'Hello guest'
 */
public class Kata169 {
    static String greet(String name, String owner) {
        // Add code here
        return "Hello " + (name.equalsIgnoreCase(owner) ? "boss" : "guest");
    }
}
