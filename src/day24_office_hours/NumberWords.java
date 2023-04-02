package day24_office_hours;
// write a method that accepts the number between 1 to 10
//ant it returns the number as a word
// ex: numWord(4);
// output: four

import java.util.Scanner;

public class NumberWords {

    public static String numWord(int num) {

      /*  if (num == 1) {
            return "One";
        } else if (num == 2) {
            return "Two";
        } else if (num == 3) {
            return "Three";
        } else if (num == 4) {
            return "Four";
        }
*/
        if (num>10 || num <1){
            //System.out.println("Number is not in the range");
            return"Number is not in the range";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five"};
        //                   0      1       2        3       4
        return  words [num -1];

    }

    public static void main(String[] args) {
        numWord(1);
        String result = numWord(2);
        System.out.println(numWord(1));
        System.out.println(result);
        System.out.println("_____________");
        System.out.println(numWord(5));

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the num: ");
        int userNum = input.nextInt();
        System.out.println(numWord(userNum));
    }
}