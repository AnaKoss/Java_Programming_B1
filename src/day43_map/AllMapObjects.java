package day43_map;

//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        // we need to provide 2 data - key & value
        Map <String, String> map = new HashMap<>(); // order not guaranteed | NULL as key is Ok

        map.put("James", "Java");
        map.put("Tom", "Cartoon");
        map.put("Bond", "Movie");
        map.put("Nadir", "Automation");

        map.put(null, "test");
        map.put("Check", null);

        System.out.println(map);

       map.put("Bond", "Theater"); // UPDATE THAT
        map.put("Bond2", "Theater"); // ADDED NEW ONE
        System.out.println(map);


        Map <String, String> linked = new LinkedHashMap<>(); // Maintains the Insertion Order | NULL as key is OK

        linked.put("James", "Java");
        linked.put("Tom", "Cartoon");
        linked.put("Bond", "Movie");
        linked.put("Nadir", "Automation");
        linked.put(null, "test");
        linked.put("Check", null);
        linked.put(null, "test");


        System.out.println(linked);

        System.out.println();

        Map <String, String> treeMap= new TreeMap<>(); // Maintains the Sorted (Ascending) order| NULL as key is not OK

        treeMap.put("James", "Java");
        treeMap.put("Tom", "Cartoon");
        treeMap.put("Bond", "Movie");
        treeMap.put("Nadir", "Automation");
        //treeMap.put(null, "test");
        treeMap.put("Check", null);
        System.out.println(treeMap);


        System.out.println();

        Map<String, String> tableMap = new Hashtable<>(); //Order is not guaranteed | NULL as key or as value is NOT OK
        tableMap.put("James", "Java");
        tableMap.put("Tom", "Cartoon");
        tableMap.put("Bond", "Movie");
        tableMap.put("Nadir", "Automation");
        // treeMap.put(null, "test");
        // tableMap.put("check", null);
        System.out.println(tableMap);

        System.out.println("_________METHODS__________");

        System.out.println(map.get("James"));
        System.out.println(map.get("TEST"));

        System.out.println(map.containsKey("James"));
        System.out.println(map.containsKey("TEST"));

        System.out.println(map.containsValue("Java"));
        System.out.println(map.containsValue("TEST"));

        System.out.println("____");
        System.out.println(map);
        map.remove("James");
        //map.remove("TTTTTTTT");
        System.out.println(map);

    }

}
/*
            .put(key, value); ---> this method will add a key and value, if the key does not exist in the map. If the key is already in th emap, it will just apdate the value
            .get(key); ---> This method will return the value of the matching key, if there is no matching, will return NULL
            .containsKey(key); ---> this method will return boolean if the given key exist among the keys in the map
            .containsValue(value); --> this method will return boolean if the given value exist among the value is the map
            .remove(key); --->  this method will remove the data (key & value), if the given key is among the keys in the map
            .keySet();---> this method will  return the set of the key in the map
            .values(); ---> this method will return the list of values in the map
            .entrySet(); --- > this method will return a single row map on each iteration

 */

