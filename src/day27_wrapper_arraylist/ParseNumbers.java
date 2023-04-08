package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {

        String year = "2023";

        System.out.println("this year is " + year);
        System.out.println("next year will be " + (year + 1));
        System.out.println("next year will be " + year + 1);
// converting String to primitive datatype
int yearInNum = Integer.parseInt(year);
        System.out.println("this year is " + yearInNum);
        System.out.println("next year will be " + (yearInNum + 1));
        System.out.println("next year will be " + yearInNum + 1);
        System.out.println("______________");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: \n\t(Ex. I am 23 years old)");
        String userInput = input.nextLine();
String age = userInput.split(" ")[2];
int ageAsNum = Integer.parseInt(age);

        System.out.println("You will be " + (ageAsNum + 10)  + " after 10 years");


    }
}
