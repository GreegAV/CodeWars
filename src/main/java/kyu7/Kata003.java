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
import java.util.List;
import java.util.Map;

public class Kata003 {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        ArrayList<String> sortedList = new ArrayList();
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() >= 60) sortedList.add(entry.getKey());
        }
        return sortedList;
    }
}