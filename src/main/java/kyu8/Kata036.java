package kyu8;

/*
Kata: Find the force of gravity between two objects

You job is to find the gravitational force between two spherical objects (obj1 , obj2).

input
Two arrays are give :

arr_val (value array), consists of 3 elements
1st element : mass of obj 1
2nd element : mass of obj 2
3rd element : distance between their centers
arr_unit (unit array), consists of 3 elements
1st element : unit for mass of obj 1
2nd element : unit for mass of obj 2
3rd element : unit for distance between their centers
mass units are :

kilogram (kg)
gram (g)
milligram (mg)
microgram (μg)
pound (lb)
distance units are :

meter (m)
centimeter (cm)
millimeter (mm)
micrometer (μm)
feet (ft)
Note
value of G = 6.67 x 10-11N.kg–2.m2

1ft = 0.3048m

1lb = 0.453592kg

return value must be Newton for force (obviously)
 */
public strictfp class Kata036 {
    public static double solution(double[] arrVal, String[] arrUnit) {
        double mass1 = arrVal[0];
        double mass2 = arrVal[1];
        double dist = arrVal[2];
        double g = 6.67 * Math.pow(10, -11);
        switch (arrUnit[0]) {
            case "kg": {
                break;
            }
            case "g": {
                mass1 *= 1e-3;
                break;
            }
            case "mg": {
                mass1 *= 1e-6;
            }
            case "μg": {
                mass1 *= 1e-9;
            }
            case "lb": {
                mass1 *= 0.453592;
            }
        }

        switch (arrUnit[1]) {
            case "kg": {
                break;
            }
            case "g": {
                mass2 *= 1e-3;
                break;
            }
            case "mg": {
                mass2 *= 1e-6;
                break;
            }
            case "μg": {
                mass2 *= 1e-9;
                break;
            }
            case "lb": {
                mass1 *= 0.453592;
                break;
            }
        }


        switch (arrUnit[2]) {
            case "m": {
                break;
            }
            case "cm": {
                dist *= 1e-3;
                break;
            }
            case "mm": {
                dist *= 1e-6;
                break;
            }
            case "μm": {
                dist *= 1e-9;
                break;
            }
            case "ft": {
                dist *= 0.3048;
                break;
            }
        }

        return g * (mass1 * mass2 / (dist * dist));
    }

}
