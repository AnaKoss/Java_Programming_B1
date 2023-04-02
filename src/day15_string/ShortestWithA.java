package day15_string;

import java.util.Scanner;

public class ShortestWithA {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


        System.out.println("Enter 3 words: ");

    String word1 = input.next();
    String word2 = input.next();
    String word3 = input.next();
//String word1 = input.next(), word2 = input.next(), String word3 = input.next();

    int word1Length =word1.length();
    int word2Length = word2.length();
    int word3Length = word3.length();
String result= "";

        if ( word1.contains ("a") && (word1Length <= word2Length && word1Length <= word3Length)){
        result =  word1 + " is the smallest with \"a\"";
    }else if (word2.contains ("a") && (word2Length <= word1Length && word2Length <= word3Length)) {
       result= word2 + " is the smallest with \"a\"";
    }else if (word3.contains ("a") && (word3Length <= word1Length && word3Length <= word2Length)) {
        result = word2 + " is the smallest with \"a\"";
    }else{
        System.out.println("No single smallest word with \"a\"");
    }
        System.out.println(result);
}
}

