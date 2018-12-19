package kyu7;
/*
Kata: My Languages
Task: Given a dictionary/hash/object of languages and your respective test results,
return the list of languages where your test score is at least 60, in descending order of the results.

Note: There will be no duplicate values.

Examples
{"Java" => 10, "Ruby" => 80, "Python" => 65}  --> ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71} --> ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}   --> []
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Kata003 {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> output = new ArrayList<>();
        results.entrySet().stream()
                .filter(o -> Integer.parseInt(o.getValue().toString()) >= 60)
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(a -> output.add(a.getKey()));
        return output;
    }
}