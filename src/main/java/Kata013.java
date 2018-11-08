/*
Kata: Remove String Spaces

Task: Simple, remove the spaces from the string, then return the resultant string.
 */
class Kata013 {
    static String noSpace(final String x) {
        // newbie code
//        StringBuilder result= new StringBuilder();
//        for (char tmp:x.toCharArray()) {
//            if (!String.valueOf(tmp).equals(" "))
//                result.append(tmp);
//        }
//        return result.toString();

        return x.replace(" ", "");      // simply the Best!
    }
}