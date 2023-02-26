package day09_a_scanner;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        //create a scanner object
        // asks the user to enter 3 angles  #
        Scanner input = new Scanner(System.in);


        System.out.println("Enter 3 angle numbers");

        double degreeOne = input.nextDouble();
        double degreeTwo = input.nextDouble();
        double degreeThree = input.nextDouble();

// for triangle ==> total degree of inner calculation is 180

//Calculate what is the total of 3 numbers
        double total = degreeOne + degreeTwo + degreeThree;

        // Weite a print statments that prints if it is triangle.
        System.out.println(" It is triangle: " + (total == 180));

        //whrite a print statment that print if it is circle

        System.out.println("It is circle: " + (total == 360));
        // write a print statment that print if it is Either triangle or Circle

        System.out.println("It is either trianger or circle: " + (total ==180 || total ==360));

    }

}
