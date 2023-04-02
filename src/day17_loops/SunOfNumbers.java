package day17_loops;

import java.util.Scanner;

public class SunOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int numOfSum = 0;
// continue getting a number from user until it is negative number
        while (num >= 0 ){  // num >-1 - the same

            numOfSum = numOfSum = num;  //numOfSun +=num;
            System.out.println("sum of the num so far: " + numOfSum);
            System.out.println("enter number again: ");
            num = input.nextInt();
if (num <0 ){
    System.out.println(num + " is a negative number. That is why the while loop ended");
}
        }

    }
}
