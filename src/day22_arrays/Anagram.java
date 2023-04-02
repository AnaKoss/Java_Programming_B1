package day22_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "silent";
        String word2 = "listen";

//1 convert array
        //String [] arr1 = word1.split(""); can do with split again
        char[] arr11 = word1.toCharArray();
        char[] arr22 = word2.toCharArray();

        //2 sort both arrays
        Arrays.sort(arr11);
        Arrays.sort(arr22);
        //3 compare teo arrays

        System.out.println(Arrays.equals(arr11, arr22)? "Anagram" : "Not Anagram");

// this is extra just showing it with if else statement

if (Arrays.equals(arr11, arr22)){
    System.out.println("Anagram");
}else {
            System.out.println("Not Anagram");
        }







    }
}
