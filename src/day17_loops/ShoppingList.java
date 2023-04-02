package day17_loops;

import java.util.Scanner;
/*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items
        at the end show the full shopping list
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String list = "Shopping list:\n\t";
        String addMore ="";
        do{
        System.out.println("Enter the name of the items: ");
        // the all are the same
        //String newItem = input.next();
        //list =list + "\n\t"+ newItem;
        //list = list + "\n\t" + input.next();

        list += "\n\t" + input.next();

        System.out.println("do you wanna add more to your shopping list?");
        addMore = input.next(); // it will be yes or not

    } while (addMore.equalsIgnoreCase ("yes"));

        System.out.println( list);

    }

}
