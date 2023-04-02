package day12_switch_statements;

import java.util.Scanner;

/*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

    - The person must be a citizen or a resident
        -> If not print: You must be a citizen or a resident
    - Their age must be between 18 and 35
        -> If not print: Your age must be between 18 to 35 years old
    - They must have a high school diploma
        -> If not print: You must have a high school diploma

    > If all the criteria is met print: You are qualified for the Army
 */
public class ArmyQuality {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean hasCitizenship;
        boolean isResident;
        boolean hasDiploma;
        int age;

        System.out.println("Are you a citizen?");
        //I need to get the value/info/answer from user and assign to hasCitizenship
hasCitizenship = input.nextBoolean();
        System.out.println("\nAre you a resident?");
        // I need to get info and assign to a variable isResident
        isResident = input.nextBoolean();

        System.out.println("\nDo you have a high school diploma? (true/false)");
        hasDiploma = input.nextBoolean();

        System.out.println("\nHow old are you?");
        age = input.nextInt();

// you arte either eligible else you are not
        if((hasCitizenship || isResident) && (age >=18 && age <= 35) && hasDiploma){
            System.out.println(("you are qualified for the Army"));
        }else{
            if(!hasCitizenship || !isResident){
                System.out.println("You must be a citizen or a resident");
            }
            if(age< 18 | age>35){
                System.out.println(" Your are must be between 18 to 35 y.o");
            }
            if(!hasDiploma){
                System.out.println("You must habe a high school diploma");
            }
        }


    }



}
