package day43_map;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    /*
    create a map
    add couple student objects into that map as a value
    for the key we can add just numbers, starting from 1
     */

    public static void main(String[] args) {
/*
if I want to keep the insertion order ---> LinkedHashMap
if I want to keep the sorted order ---> TreeMap
if I want to be able to accept null as value but NOT AS KEY  ---> HashMap & LinkedHashMap
If I want NOT to be able to accept null neither as key nor as value -- > HashTable
 */


        //Create a MAP
Map <Integer, Student> map = new HashMap<>();

//Add Students and the numbers
       Student s1 = new Student("Ana",3.90, 12);
     map.put(1, s1);

        map.put(2, new Student("Vlad", 3.90, 12));

        map.put(3, new Student("Nazakat", 3.99, 10));
        map.put(4, new Student("Gunel", 3.95, 11));
        map.put(5, new Student("Ilgar", 4.00, 13));

        System.out.println(map);
        System.out.println("----------------");
        System.out.println(map.get(3));

        // How can I get ONLY the name ofe 4th element in the map?
        System.out.println(map.get(4).name);
        System.out.println(map.get(4).gpa);
        System.out.println(map.get(4).id);


        System.out.println("*********LOOPING THROUGH MAP**********");
        System.out.println(map.keySet());


        for (Integer eachKey : map.keySet()) {
            System.out.println("Rank: " + eachKey);
            System.out.println("\tValue: " + map.get(eachKey));
            System.out.println();
        }


        System.out.println("*********LOOPING THROUGH MAP's VALUES**********");
        System.out.println(map.values());

        System.out.println();
        // print only the objects whose gpa is 4.00
        for (Student eachValue : map.values()) {
            if (eachValue.gpa == 4.00) {
                System.out.println(eachValue);
            }
        }


        System.out.println("*********LOOPING THROUGH MAP's ENTRYSET**********");
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println("-----<>----------");

        // Can I have a condition where my key is bigger than 3 and Student's gpa is less than 3.95
        for (Map.Entry<Integer, Student> eachEntry : map.entrySet()) {
            System.out.println("Rank: " + eachEntry.getKey());
            System.out.println("Value: " + eachEntry.getValue());
            System.out.println();
        }





    }
}
