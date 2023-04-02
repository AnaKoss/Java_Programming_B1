package day18_loops;

import java.util.Scanner;

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
public class CountWords {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a sentence: ");
        int count = 0;
        String sen = input.nextLine().trim();
        //sen = sen.trim();
        System.out.println(sen);

        for (int i = 0; i < sen.length(); i++) {
            if (sen.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The count of words: " + (count+1));
    }

}
