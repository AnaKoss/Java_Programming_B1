package day20_nested_loops;

import java.util.Scanner;

public class FinRainRange2Class {
    public static void main(String[] args) {
        int num =5;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number to check each up to that num: ");
        int userNum = input.nextInt();

        for (int i = 1; i <= userNum ; i++) {
            String str = "";


            if (i %3 ==0){
                str += "FIN";
            }

            if (i %5 ==0){
                str += "RA";
            }
     if ( str.isEmpty()){
         System.out.println(i);
     }else {
         System.out.println(str + " ");
     }

           // System.out.println(str.isEmpty()? i : str ); // ternary
                                // boolean    ? true : false

        }







    }
}

