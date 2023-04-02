package day15_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
        //String first = input.next().toUpperCase();

        System.out.println("Enter last name: ");
        String last = input.next();
        String initials = ("" + first.charAt(0) + last.charAt(0)).toUpperCase(); // "" casted
        //initials = initials.toUpperCase();
        System.out.println("Your initial is: "+ initials);
        //System.out.println("Your initial is: "+ initials.toUpperCase());






    }





}
