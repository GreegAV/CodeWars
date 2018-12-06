package kyu8;

import java.util.ArrayList;
import java.util.List;

/*
Kata: Unfinished Loop - Bug Fixing #1
Task: Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished For Loop!
 */
public class Kata108 {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;count++) // was without "count++"
        {
            list.add(count);
        }

        return list;
    }
}
