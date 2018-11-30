package kyu8;

/*
Kata: Welcome to the City
Task: Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person.
Note that name will be an array consisting of one or more values that should be joined together with one space betweeen each,
and the length of the name array in test cases will vary.

Example:

sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 */
public class Kata094 {
    public String sayHello(String[] name, String city, String state) {
        //code here
        String greeting = "Hello, ";
        for (String str : name) {
            greeting += str;
            greeting += " ";
        }
        greeting = greeting.trim();
        greeting += "! Welcome to " + city + ", " + state + "!";
        return greeting;
    }
}
