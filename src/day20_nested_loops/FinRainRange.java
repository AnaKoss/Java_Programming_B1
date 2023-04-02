package day20_nested_loops;

import java.util.Scanner;

// %3 fin
//%5 ra
//both -> finra
//neither -> number
public class FinRainRange {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);


        System.out.println("Enter the number: ");

        int num = input.nextInt();


        for (int i = 0; i <=num ; i++) {
            if (i%3 ==0 && i%5 ==0){
                System.out.println(i + " finra");
            }else if ( i%3 ==0){
                System.out.println(i + " ra");
            } else if (i % 5==0){
                System.out.println(i + " fin");
            }
        }








    }
}
