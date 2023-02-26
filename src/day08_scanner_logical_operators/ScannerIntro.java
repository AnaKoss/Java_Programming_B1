package day08_scanner_logical_operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {


      String name = "Tom";
        System.out.println("My name is " + name);
        System.out.println("\n");
        System.out.println(" Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(" You have entered: " + number);
        System.out.println();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("after 25 years you will be " + age + " old." );
        

    }
}
