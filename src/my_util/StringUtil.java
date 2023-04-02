package my_util;
// reverse
// create a method that will accept a String und returns the reversed String

/*** This method made by Loopcamp Batch#1
 * The method that will accept a String und returns the reversed String
 */
public class StringUtil {
    public static String reverseString ( String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
