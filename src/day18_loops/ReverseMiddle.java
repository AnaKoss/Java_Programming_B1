package day18_loops;

import java.util.Scanner;

// give the sen with 3 word
// take in the middle
// revers it
public class ReverseMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter 3 word sen: ");
        String str = input.nextLine();
            //sen : I Love jave
            //      012345678910

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");
        String middle = str.substring(firstSpace+1, lastSpace);
        String revers= " ";
        for (int i = middle.length()-1; i >=0 ; i--) {
            revers += middle.charAt(i);

        }
// print : I evol java
        System.out.println(str.substring( 0, firstSpace) + revers + " " +str.substring(lastSpace +1));


    }
}
