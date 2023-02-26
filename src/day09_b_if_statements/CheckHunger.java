package day09_b_if_statements;

import java.util.Scanner;

public class CheckHunger {

    public static void main(String[] args) {


        //int hunger = 45;
        //int notHunger = 65;
        //if(hunger >= notHunger){
            //System.out.println(" Java Class have hunger people");
       // } else{
           // System.out.println(" I am not hungry and don't wanna go to the break ");
       // }


        Scanner input = new Scanner(System.in);
        System.out.print("Are you hungry? (true or false): ");
        boolean isHungry = input.nextBoolean();

        if (isHungry){
            System.out.println("Eat");
        } else{
            System.out.println(" gime me some food");
        }




    }
}
