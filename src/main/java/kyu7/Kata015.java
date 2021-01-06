package kyu7;
/*
Red Knight is chasing two pawns. Which pawn will be caught, and where?

Input / Output
Input will be two integers:

N / n (Ruby) vertical position of Red Knight (0 or 1).
P / p (Ruby) horizontal position of two pawns (between 2 and 1000000).
Output has to be an object (java):

"Black" or "White" - which pawn was caught
Where it was caught (horizontal position)
Example
// This class is preloaded
class PawnDistance {
  private String color;
  private long distance;
  public PawnDistance(String s, long d) {
    color = s;
    distance = d;
  }
}

Input = 0, 4;
Output = new PawnDistance("White", 8);

Notes
Red Knight will always start at horizontal position 0.
The black pawn will always be at the bottom (vertical position 1).
The white pawn will always be at the top (vertical position 0).
The pawns move first, and they move simultaneously.
Red Knight moves 2 squares forward and 1 up or down.
Pawns always move 1 square forward.
Both pawns will start at the same horizontal position.
 */

public class Kata015 {
    public static PawnDistance redKnight(int knight, long pawn) {
        String color = (knight + pawn) % 2 == 0 ? "White" : "Black";
        long distance = pawn * 2;
        return new PawnDistance(color, distance);
    }
}

class PawnDistance {
    private String color;
    private long distance;

    public PawnDistance(String s, long d) {
        color = s;
        distance = d;
    }
}