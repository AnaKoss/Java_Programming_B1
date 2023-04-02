package day15_string;

import java.util.Scanner;

/*
   [Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
    */
public class MoveFirstWord {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        //1 get index of first space
int firstIndexOfSpace = sentence.indexOf(" ");
//2 get the first word
        String beginning = sentence.substring(0,firstIndexOfSpace);
//3 second part of the sentence
        String secondPart = sentence.substring(firstIndexOfSpace).trim();
        //String secondPart = sentence.substring(firstIndexOfSpace +1);
//3 poot java to the end of sentence

        System.out.println(beginning);

        System.out.println(secondPart);

        System.out.println(secondPart+ " "+ beginning);

    }
}
