package day40_exeption.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter the number");
            int num = input.nextInt(); // possible InputMismatchException

            System.out.println("Enter number 2");
            int num2 = input.nextInt(); // possible InputMismatchException


            System.out.println(num / num2); // possible ArithmeticException
        }catch(InputMismatchException e){

            e.printStackTrace();

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally { // optional
            System.out.println("final block");
            input.close();
        }

        System.out.println("Done");

    }
}
