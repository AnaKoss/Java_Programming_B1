package day09_b_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");

        double balance = input.nextDouble();


        System.out.print("How much do you wnat to withdraw? ");

        double withdraw = input.nextDouble();

        //balance = balance- withdraw;
        balance -= withdraw;

        if( balance < withdraw) {
            System.out.println("You can not withdraw");
        }
        System.out.println();
        System.out.println("New balance is: " + balance);



    }
}
