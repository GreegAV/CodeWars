package kyu8;

/*
Kata: Century From Year

Task: Introduction
The first century spans from the year 1 up to and including the year 100,
The second - from the year 101 up to and including the year 200, etc.

Task :
Given a year, return the century it is in.

Input , Output Examples ::
centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)
Hope you enjoy it .. Awaiting for Best Practice Codes
 */
public class Kata033 {
    public static int century(int number) {
        return number % 100 > 0 ? number / 100 + 1 : number / 100;
    }
}
