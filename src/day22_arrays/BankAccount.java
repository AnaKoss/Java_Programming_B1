package day22_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String [] bankAccOne = {"Tom Jerry", "Checking", "100000344566", "100,000.00"};
        System.out.println("Number of elements in the array: " + bankAccOne.length); //4

        System.out.println("My entire array: " + Arrays.toString(bankAccOne)); //[Tom Jerry, Checking, 100000344566, 100,000.00]
        System.out.println("Name: " + bankAccOne[0]); // Tom Jerry
        System.out.println("Account type: "+ bankAccOne[1]);
        System.out.println("Account#: "+ bankAccOne[2]);
        System.out.println("Balance: $" + bankAccOne[3]);
        System.out.println("___________________");

String [] bankAccTwo = new String [4];
        System.out.println("Array with default values: "+ Arrays.toString(bankAccTwo));
        bankAccTwo[0] = "Micky Mouse";
        bankAccTwo[1] = "Saving";
        bankAccTwo[2]= "23456789";
        bankAccTwo[3] = "234,567.00";
        //bankAccTwo[4] = "234,567.00"; //  ERROR : run time exception --> ArrayIndexOutOfBoundsException
        //bankAccTwo [4] = 4; // CompileTimeException
        System.out.println("My entire array 2 : " + Arrays.toString(bankAccTwo));
        System.out.println("_____________________________");
        String [] bankAccThree = new String[4];
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        bankAccThree[0] = input.nextLine();

        System.out.println("Account type: ");
        bankAccThree [1] = input.next();

        System.out.println("Account #: ");
        bankAccThree[2] = input.next();

        System.out.println("Balance: $");
        bankAccThree[3] = input.next();

        System.out.println("My entire array 3: " + Arrays.toString(bankAccThree));

        System.out.println("________________________________");

String [] questions = {"Name: ", "Account type: ", "Account #: ", "Balance: $"};
                 //       0             1               2             3
        //for (int i = 0; i <= questions.length -1 ; i++) {
        String [] bankAccFor = new String [4];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            bankAccFor[i] = input.nextLine();
        }
        System.out.println("My entire array 4: "+Arrays.toString(bankAccFor));

    }
}
