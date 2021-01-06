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
        // TODO implement your logic
        int water = 0;
        int carbonDioxide = 0;
        int methane = 0;
        int remainH=h;
        int remainO=o;
        int remainC=c;
// h2o
        if (h >= 2 & o >= 1) {
            int hUsed4Water=h/2;
            if (hUsed4Water>o) {
                water=o;
                remainO=0;
                remainH=h-2*water;
            } else {
                water=hUsed4Water;
                remainO=-water;
                remainH-=2*hUsed4Water;
            }
        }

 //c02


//ch4


        return new int[]{water, carbonDioxide, methane};
    }

    public static void main(String[] args) {
        for (int el:burner(10,222,10)) System.out.println(el);
    }
}
