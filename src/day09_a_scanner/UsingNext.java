package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday");
        System.out.print("What is today class?"); //Java

        String classname = input.next();

        System.out.println();

        System.out.print("What month is it?");  //february
        String month = input.next();
        System.out.println("I like " + month + " month");
        System.out.println();

        input.nextLine();
        System.out.println("Enter you full name: "); // multiple word = has space in it
        String fullName = input.nextLine();
        System.out.println("Full name is: " + fullName);
        input.close();
    }
}
