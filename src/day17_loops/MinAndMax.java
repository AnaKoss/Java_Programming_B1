package day17_loops;

import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */
/*
    repeated steps:
        ask for a number
        check is it the biggest
        check is it the smallest
 */
public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        //int smallest= Integer.MIN_VALUE;
        int smallest = 999999999;
        System.out.println(smallest);
        //int biggest = Integer.MAX_VALUE;
        int biggest = 0;
        System.out.println(biggest);


    while ( count <= 5) {

    System.out.println("enter the number: ");
    int num = input.nextInt(); //3

smallest = num;
biggest = num;

    if ( num> smallest ){
        smallest = num;
    }
    if (num>biggest){
        biggest = num;
    }
    count++;
    }
        System.out.println("My max number " + smallest);
        System.out.println("My min number " + biggest);

    }
}
