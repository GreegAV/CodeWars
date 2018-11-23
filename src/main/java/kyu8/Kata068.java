package kyu8;

/*
Kata: Counting sheep...
Consider an array of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
 */
public class Kata068 {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            // using Boolean.TRUE first to avoid NPE
            if (Boolean.TRUE.equals(sheep)) {
                count++;
            }
        }
        return count;
    }
}
