package day29_arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //this will be my shopping List to hold all items.

        ArrayList<String> shoppingList = new ArrayList<>();
/*
Enter item
-> apple
Do you want to continue y/n?
-> yes / start loop again
 */
    //!!! we will use do while loop !!! if i need to execute a body one or more times no matter what my condition is I would use DO WHILE LOOP
String wantsContinue; // it needs to be out of the do while loop , bc we can assign it inside do block
        int count = 0;
        do {
            System.out.println("Enter the item: ");
            //String item = input.nextLine();
            shoppingList.add(input.nextLine());
            System.out.println("Do you want to continue y/n?");
            wantsContinue = input.nextLine(); //y or n

        }while (wantsContinue.equalsIgnoreCase("Y"));
        System.out.println("Shopping list: " + shoppingList.size() + " items: ");
// looping through the list
        for( String each : shoppingList){
            System.out.println("*\t"+ each);
        }
        System.out.println("_________________________");

        // how i can check if my list have water
        System.out.println("WHAT ITEM DO YOU WANNA CHECK IF IT ON THE LIST?");
        String itemToCheck = input.nextLine();
        System.out.println(shoppingList.contains(itemToCheck)? (itemToCheck + " is on the list"): (itemToCheck + " is not on the list"));
        //System.out.println(shoppingList.contains("Water") ? "Water is on the list": "Water is not on the list");

       /* if (shoppingList.contains("Water")){
            System.out.println("Water is on the list ");
        }else{
            System.out.println("Water is not on the list");
        }
        */
        //can you remove specific item from the list?
        System.out.println("Do you want to remove any items y/n?");
        if(input.nextLine().equalsIgnoreCase("Y")){
            System.out.println("What number of item do you wanna remove?");
            String itemToRemove = input.nextLine();


            // let say user may give you either item name or the number of the item in the list --> "1"| "qcx(?><"
            if (Character.isDigit(itemToRemove.charAt(0))){ //checked if first index is digit
                shoppingList.remove(Integer.parseInt(itemToRemove)-1);
            }else{
                System.out.println(itemToRemove);
            }

            shoppingList.remove(itemToRemove);

        }
        System.out.println("Final list: " + shoppingList);
    }
}
