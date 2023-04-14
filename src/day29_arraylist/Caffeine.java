package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>(); // 1 object
        drinks.add("coffee"); // element
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("energy drink");
        drinks.add("hot chocolate");
        System.out.println(drinks);
        ArrayList<String> drinks2 = drinks; // no new object , actually we address to object 1
        //how many ArrayList object i have created so far? -->1

        ArrayList <String> drinks3 = new ArrayList<>(drinks); // 2nd object
        //how many ArrayList object i have created so far? -->2

String [] drinkList = {"Juice", "Milk", "Cappuccino", "Iced coffee"};
ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList(drinkList));
        System.out.println(drinks4);

        ArrayList<String> drinks5 = new ArrayList<>(Arrays.asList("2Juice", "2Milk", "2Cappuccino", "2Iced coffee"));
        System.out.println(drinks5);


        // new method .addAll();
        ArrayList<String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList("3Juice", "3Milk", "3Cappuccino", "3Iced coffee"));
        System.out.println(drinks6);

drinks6.addAll(0, Arrays.asList("drink1", " drink2")); // method overloaded with privious one.
        System.out.println(drinks6);

drinks6.addAll(Arrays.asList("drink3", "drink4"));
        System.out.println(drinks6);



    }
}
