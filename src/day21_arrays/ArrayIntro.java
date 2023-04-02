package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal way
        String str1 = "Fairfax";
        String str2 = "New York";
        String str3 = "Alexandria";
        String str4 = "Bethesda";
        String str5 = "Reston";
        String str6 = "Gaithersburg";

        //Declaring the arrays
        String[] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"}; // String cities [] = {"Fairfax", "new York",.....}; also right , anothey wat to declare
        //String [] cities2 ={str1, str2, str3, str4, str5, str6}; // just example how to use

        // how to reach each element? by index

        System.out.println(cities[0]);         //String word = "java";
        System.out.println(cities[1]);         //               0123
        System.out.println(cities[2]);         // word .charAt(4); --> erroe
        System.out.println(cities[3]);
        System.out.println(cities[4]);   //{"Far","NY', "Beth",..};// FROM 0-5 = 6
        System.out.println(cities[5]);   //  0     1    2   ... 5
        //System.out.println(cities[6]);  // CIETIES[6]---> EXCEPTION

        System.out.println("All cities: "+ cities[0] + ", "+ cities[1]+", "+ cities[2]);

        // System.out.println(cities); // this is NOT the way how we print all the elements in array. This show some kind of memory location

        System.out.println(Arrays.toString(cities)); // use substring to print without []
        System.out.println(Arrays.toString(cities).substring(1,Arrays.toString(cities).length()-1));

        System.out.println("_________________________");
        //how do we get the number of elements in array
        System.out.println(cities.length); // 6 it is the number of cities

        String allCities = Arrays.toString(cities);
        System.out.println(allCities);
        //System.out.println(Arrays.toString(cities).length); // will complain bc arrays.to string is STRING
        System.out.println(Arrays.toString(cities).length()); // print nub from all string : "Fairfax", "NY', "Bethesda",...with is 63

        System.out.println("hello".substring(1,3));

    }
}
