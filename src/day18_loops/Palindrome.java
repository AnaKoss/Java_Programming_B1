package day18_loops;

import java.sql.SQLOutput;

/*
    Palindrome: its the same reading from the beginning and end
    Ex:
        mom
        racecar
        anna
        madam
    Task: Check if a word is palindrome
    Flow:
        declare some initial String
        how to reverse a String
        check if the reverse version is the same as the original
 */
public class Palindrome {
    public static void main(String[] args) {

String word = "abcba"; //length is 5
// index is    01234
String revers = ""; // if we dont have it, will be complain - error
        for (int i = word.length()-1; i >=0 ; i--) {
            revers += word.charAt(i);
        }
        if ( word.equals(revers)){
            System.out.println("palindrome word");
        }else {
            System.out.println("NOT palindrome word");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println(word.equals(revers)? "palindrome":"NOT palindrome");

    }
}
