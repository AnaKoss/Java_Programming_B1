package day43_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

//Create a Map that holds data as a String and Array List of String as values
        Map < String, ArrayList<String> > countries = new HashMap<>();

  /*
  add keys                            add values
            United Stated                        Chicago, Virginia, DC, LA, NY
            Turkey                               Istanbul, Ankara, Izmir, Antalya
            Canada                               Quebec, Toronto, Vancuver
   */
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Virginia", "DC", "LA", "NY")));

        ArrayList<String> citiesTurkey = new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir", "Antalya"));
        countries.put("Turkey", citiesTurkey);


        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));


        System.out.println(countries);

        System.out.println();

        //print all cities that starts with V or I ?

        System.out.println();
        // Print all the cities that starts with V or I ?
        for (ArrayList<String> eachValue : countries.values()) { // The outer loop will iterate through the values of the map which are the ArrayList of cities

            for (String eachCity : eachValue) {  // The inner loop will iterate through the each city in the Arraylist value

                if (eachCity.startsWith("V") || eachCity.startsWith("I")){  // This is just a condition
                    System.out.println(eachCity);
                }
            }
        }




    }

}
