package my_util;
// reverse
// create a method that will accept a String und returns the reversed String

import java.util.Locale;

/*** This method made by Loopcamp Batch#1
 * The method that will accept a String und returns the reversed String
 */
public class StringUtil {
    public static String reverseString ( String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    }
    /**
     * This method made by Loopcamp Batch#1
     * This method accepts a String parameter and puts it is a format
     * Ex:
     *       The format will be like this
     *
     *       First letter is in upperCase and rest in lowerCase
     *
     * Then return a String in a formatted way.
     */
 public static String fixFormat(String str){
     String fixed = str.trim();
     fixed= str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
     return fixed;
    }
}