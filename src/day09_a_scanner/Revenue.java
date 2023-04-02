package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price;
        int quantity;

        System.out.println("Enter the price and quantity:" );

        price = input.nextDouble();
        quantity = input.nextInt();

        //double revenue = price * quantity;
        //System.out.println(revenue);
        System.out.println(price*quantity);


       // System.out.println();
        //System.out.println(price);
        //System.out.println(quantity);


    }
}
