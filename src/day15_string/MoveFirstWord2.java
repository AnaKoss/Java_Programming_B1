package day15_string;

public class MoveFirstWord2 {
    public static void main(String[] args) {

        String str= "One Two";

        String firstWord = str.substring(0, str.indexOf(" "));
        System.out.println(firstWord);
String secondWord = str.substring(str.indexOf(" ")+1);
        System.out.println(secondWord + " " + firstWord);


        //int firstIndexOfSpace = firstWord.indexOf(" ");
       // String secondWord = str.substring(0,firstIndexOfSpace);
       // System.out.println(secondWord);


    }
}
