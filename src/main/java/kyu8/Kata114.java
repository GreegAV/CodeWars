package kyu8;

import java.util.ArrayList;
import java.util.List;

/*
Kata: Push a hash/an object into array
Task: You are trying to put a hash in ruby or an object in javascript or java into an array,
but it always returns error, solve it and keep it as simple as possible!
 */
public class Kata114 {
    public static List<String> push() {
        List<String> items = new ArrayList<>();
        items.add("an object"); //was without parentheses
        return items;
    }
}
