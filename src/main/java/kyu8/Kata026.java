package kyu8;

/*
Kata: Thinkful - Logic Drills: Traffic light
Task: You're writing code to control your town's traffic lights.
You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument
representing the current state of the light and returns a string representing the state the light should change to.

For example, update_light('green') should return 'yellow'.

 */
public class Kata026 {
    public static String updateLight(String current) {

//        newbie code...

//        switch (current) {
//            case "red": return "green";
//            case "yellow": return "red";
//        }
//        return "yellow";
        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
    }
}
