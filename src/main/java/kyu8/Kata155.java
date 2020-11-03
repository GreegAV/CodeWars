package kyu8;
/*
Kata: Grasshopper - Messi goals function

Messi goals function
Messi is a soccer player with goals in three leagues:

LaLiga
Copa del Rey
Champions
Complete the function to return his total number of goals in all three leagues.

Note: the input will always be valid.

For example:

5, 10, 2  -->  17
 */
public class Kata155 {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        // your code here
        return laLigaGoals+copaDelReyGoals+championsLeagueGoals;
    }
}
