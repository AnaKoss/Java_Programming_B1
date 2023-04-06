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

    /**
     * This method will accept a String with multiple words
     * And convert it to cameCase String
     * Input:
     *         JAVA will ruLE tHe wORLd
     * Output:
     *         javaWillRuleTheWorld
     */
    public static String cameCase (String str){ //JAVA will ruLE tHe wORLd

        String[] arr = str.split(" ");
        String result = "";
        for (String each : arr){

            result += (each.charAt(0) + "").toUpperCase() + each.substring(1).toLowerCase();
        }
        //JavaWillRuleTheWorld
        return (result.charAt(0) + "").toLowerCase() + result.substring(1);

    }

    /**
     * This method accepts String
     * And returns only unique char as a String
     */
    public static String uniqueCharacters (String str){
        String checked = "";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains(str.charAt(i) + "")){
                int count =  StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);
                if (count ==1){
                    unique +=str.charAt(i);
                }
            }
        }
        return unique;
    }

    /**
     * This method accepts String and a char
     * And returns how many times char exist in the String
     * Input:
     *        apple, z
     * Output:
     *        0
     */
    public static int frequencyOfCharacter(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==ch){
                count++;
            }
        }
        return count;
    }
}