package kyu7;

/*
A laboratory is testing how atoms react in ionic state during nuclear fusion.
They introduce different elements with Hydrogen in high temperature and pressurized chamber.
Due to unknown reason the chamber lost its power and the elements in it started precipitating
Given the number of atoms of Carbon [C],Hydrogen[H] and Oxygen[O] in the chamber.
Calculate how many molecules of Water [H2O], Carbon Dioxide [CO2] and Methane [CH4]
will be produced following the order of reaction affinity below

1. Hydrogen reacts with Oxygen   = H2O
2. Carbon   reacts with Oxygen   = CO2
3. Carbon   reacts with Hydrogen = CH4
FOR EXAMPLE:
(C,H,O) = (45,11,100)
return no. of water, carbon dioxide and methane molecules
Output should be like:
(5,45,0)
 */
public class Kata014 {
    public static int[] burner(int c, int h, int o) {
        int water = 0;
        int carbonDioxide = 0;
        int methane = 0;
        int remainH = h;
        int remainO = o;
        int remainC = c;
        if (remainH >= 2 & remainO >= 1) {
            water = Math.min(remainH / 2, remainO);
            remainO -= water;
            remainH -= 2 * water;
        }
        if (remainC >= 1 & remainO >= 2) {
            carbonDioxide = Math.min(remainO / 2, remainC);
            remainC -= carbonDioxide;
        }
        if (remainH >= 4 & remainC >= 1) {
            methane = Math.min(remainH / 4, remainC);
        }
        return new int[]{water, carbonDioxide, methane};
    }
}
