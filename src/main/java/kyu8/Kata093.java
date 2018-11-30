package kyu8;

/*
Kata: Rock Paper Scissors!
Task: Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples:

rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!

 */
public class Kata093 {
    public static String rps(String p1, String p2) {
        // your code
        if (p1.equals(p2))
            return "Draw!";
        if (p1.equals("rock"))
            return p2.equals("paper") ? "Player 2 won!" : "Player 1 won!";
        if (p1.equals("paper"))
            return p2.equals("rock") ? "Player 1 won!" : "Player 2 won!";
        if (p1.equals("scissors"))
            return p2.equals("paper") ? "Player 1 won!" : "Player 2 won!";
        return "Draw!";
    }
}
