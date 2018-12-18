package kyu7;

import java.util.ArrayList;
import java.util.Arrays;

/*
Kata: Double Sort
Simple enough this one - you will be given an array.
The values in the array will either be numbers or strings, or a mix of both.
You will not get an empty array, nor a sparse one.

Your job is to return a single array that has first the numbers sorted in ascending order,
followed by the strings sorted in alphabetic order. The values must maintain their original type.

Note that numbers written as strings are strings and must be sorted with the other strings.
 */
public class Kata002 {
    public static Object[] dbSort(Object[] a) {
        ArrayList<String> strArr = new ArrayList<>();
        ArrayList<Integer> strInt = new ArrayList<>();
        for (Object obj : a) {
            if (obj instanceof String)
                strArr.add(obj.toString());
            if (obj instanceof Integer)
                strInt.add(Integer.parseInt(obj.toString()));
        }
        String[] resStr = new String[strArr.size()];
        int[] resInt = new int[strInt.size()];
        for (int i = 0; i < strInt.size(); i++) {
            resInt[i] = strInt.get(i);
        }
        for (int i = 0; i < strArr.size(); i++) {
            resStr[i] = strArr.get(i);
        }
        Arrays.sort(resInt);
        Arrays.sort(resStr);
        Object[] obj = new Object[resStr.length + resInt.length];
        for (int i = 0; i < resInt.length; i++) {
            obj[i] = resInt[i];
        }
        for (int i = 0; i < resStr.length; i++) {
            obj[i + resInt.length] = resStr[i];
        }
        return obj;
    }
}