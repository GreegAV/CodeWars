package kyu8;

/*
Kata: Total amount of points

Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.

For example: ["3:1", "2:2", "0:1", ...]

Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:

if x>y - 3 points
if x<y - 0 point
if x=y - 1 point
Notes:

there are 10 matches in the championship
0 <= x <= 4
0 <= y <= 4
 */
public class Kata144 {

    public static int points(String[] games) {
        int points = 0;
        //implement me
        for (String score : games) {
            int x = score.charAt(0);
            int y = score.charAt(2);

            if (x > y) {
                points += 3;
            }
            if (x == y) points += 1;
        }
        return points;
    }

    public static void main(String[] args) {
        String[] results = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        System.out.println(points(results));
    }
}