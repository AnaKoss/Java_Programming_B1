package day15_string;

import java.util.Scanner;

public class Title {
//Mr. Ms. Dr. Jr. Sr. + lastname--> Hello Doctor
    // Jr. Sr. --> Nice to meet you Junior
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name, with Titles: ");

        String nameAndTitle = input.nextLine();
nameAndTitle = nameAndTitle.toLowerCase();


        if (nameAndTitle.startsWith("mr")|| nameAndTitle.startsWith("mister")){
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms")|| nameAndTitle.startsWith("missis")){
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr")|| nameAndTitle.startsWith("doctor")){
            System.out.println("Hello Doctor");
        }

        if (nameAndTitle.endsWith("Jr")|| nameAndTitle.endsWith("Junior")){
            System.out.println("Nice to meet you Junior");
        }else if (nameAndTitle.endsWith("Sr")){
            System.out.println("hello Senior");
        }






    }
}
