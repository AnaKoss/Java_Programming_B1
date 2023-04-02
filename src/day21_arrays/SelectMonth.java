package day21_arrays;

import java.util.Scanner;

/*
ask the user the month # they want, print the month name
1-->Jan
2-->Dec
assyme only valid # are giben, but as a challenge you can handle invalid #
 */
public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        System.out.println("Enter which month # you want: ");
int monthNum = input.nextInt();
String [] allMonths =  {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("The number you enter represents this month: " + allMonths[monthNum-1]);













    }
}
