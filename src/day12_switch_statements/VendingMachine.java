package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine");
        System.out.print("Please, select one of the followings:\n\tDrinks\n\tSnacks\n\tGum");

        String selection = input.next();
        String msg = "";
        switch (selection) {
            case "Drinks":
                System.out.println("\nYour chose drinks (click 1,2, 3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\tYour number is:");
                int drinkNumber = input.nextInt();
                if (drinkNumber == 1) {
                    msg = "You have selected water";
                } else if (drinkNumber == 2) {
                    msg = "You have selected soda";
                } else if (drinkNumber == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "invalid input";

                }
                break;
            case "Snacks":
                System.out.println("\nYou chose snacks: \n\t1) sport Bar\n\t2) chips\n\t3) cookies\n\tYour number is:");
                int snackNumber = input.nextInt();

                if (snackNumber == 1) {
                    msg = "You have selected sport bar";
                } else if (snackNumber == 2) {
                    msg = "You have selected chip";
                } else if (snackNumber == 3) {
                    msg = "You have selected cookies";
                } else {
                    msg = "invalid input";
                }
                    break;
                    case "Gum":
                        System.out.print("\nYou chose snacks: \n\t1) mint\n\t2) turbo\n\t3) love is...\n\tYour number is:");
                        int gumNumber = input.nextInt();

                        if (gumNumber == 1) {
                            msg = "You have selected mint";
                        } else if (gumNumber == 2) {
                            msg = "You have selected turbo";
                        } else if (gumNumber == 3) {
                            msg = "You have selected Love is...";
                        } else {
                            msg = "invalid input";
                        }
                            break;
                            default:
                                msg = "Not valid selection";

                        }

                        System.out.println((msg));


                }
        }