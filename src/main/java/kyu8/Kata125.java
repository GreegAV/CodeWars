package kyu8;

/*
Kata: Swap Values
Task: I would like to be able to pass an array with two elements to my swapValues function to swap the values.
However it appears that the values aren't changing.

Can you figure out what's wrong here?
 */
public class Kata125 {
    public Object[] arguments;

    public Kata125(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
//        Object[] args = new Object[]{arguments[0], arguments[1]};
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }

}