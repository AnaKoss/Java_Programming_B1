package day09_b_if_statements;

import java.util.Scanner;

public class SingleIfWithScanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Why are we studying Java? ");

        String answer = input.nextLine();
        System.out.println("Is Java fun?");
        boolean answer2 = input.nextBoolean();
if(answer2 ) {
    System.out.println("Teacher is really happy");
}

if ( !answer2) {
    System.out.println("turn your camera on it time to be grilled");
}

    }

}
