package kyu8;

/*
Kata: Color Ghost
Task: Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class Kata143 {
    private String color = "";
    String[] colors = {"white", "yellow", "red", "purple"};

    public Kata143() {
        this.color = colors[(int) (Math.random() * colors.length)];
    }

    public String getColor() {
        return color;
    }
}