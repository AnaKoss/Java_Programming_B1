package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String [] letters = {"l", "o", "o", "p"};
        System.out.println(Arrays.toString(letters));
        String word = "loop";
//yoCharArray();
        char [] convertedWord = word.toCharArray();
        System.out.println(Arrays.toString(convertedWord));
        System.out.println("_________________");
        System.out.println(convertedWord[0]);
        System.out.println(convertedWord[1]);
        System.out.println(convertedWord[2]);
        System.out.println(convertedWord[3]);
        System.out.println("_________________");
       // for (int i = 0; i < convertedWord.length; i++) {
        for (char eachChar : convertedWord) {
            System.out.println(eachChar);
        }
        System.out.println("_________________");
        String days = "Monday - Sunday";
        char [] allLetters = days.toCharArray();
        System.out.println(allLetters[6]);
        System.out.println(Arrays.toString(allLetters));



    }
}
