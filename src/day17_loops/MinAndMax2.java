package day17_loops;

import java.util.Scanner;

public class MinAndMax2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int max = 0; // bc if person give 10 than 0<10 ---> int is 10;
        int min = 999999999;
//int min= Integer.MIN_VALUE;
//int max = Integer.MAX_VALUE;

        System.out.println(max);
        System.out.println(min);

        int count = 1;
         while (count <=5){
             System.out.println("Enter the number: ");
             int num = input.nextInt();

            if (max < num){
                max = num;
            }
            if (min > num) {
                min = num;
            }
             count ++;
         }
        System.out.println("max " + max);
        System.out.println("min " + min);

    }
}
