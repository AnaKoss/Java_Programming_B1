package day17_loops;

import java.util.Scanner;
// ask user to guess a num 1 -100 to find my number
//check num if lower that my guessed number -> it is too low
//check num if higher than my guessed num - > it is too high
//if it is correct guess --> end the loop and print "You guessed correctly";
public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int ourSecretNum =37;
        int guessNumber;
        do {
            System.out.println("Guess a num 1 -100 to find what is in my mind");
            guessNumber = input.nextInt();
            if (guessNumber < ourSecretNum) {
                System.out.println(guessNumber + " it's too low ");
            } else if (guessNumber > ourSecretNum) {
                System.out.println(guessNumber + " it's too high");
            }
        }while (guessNumber != ourSecretNum);

        System.out.println("You guess the correct number " + ourSecretNum);


    }
}
