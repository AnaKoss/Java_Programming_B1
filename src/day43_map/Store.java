package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        //create a Map that accepts String as KEY and double as VALUE


        Map<String, Double> map = new HashMap<>();
map.put("Water", 1.5);
map.put("Coffee", 2.5);
map.put("Apples", 0.99);
map.put("Bread", 2.35);
map.put("Cucumber", 3.89);

//can you print the inventory
        /*
        Store Inventory
         Item: Water for $1.5
         .
         .
         */

        System.out.println("Store Inventory");
        for (Map.Entry<String, Double> eachRow : map.entrySet()) {
            System.out.println("\t"+eachRow.getKey() + " for $" + eachRow.getValue());
        }


        System.out.println();
        // Can you print all the values?
        System.out.println("Values: " + map.values());




    }
}
