package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double [5]; //0,1,2,3,4

       // arr = new double [6]; //reassign
       // arr[5]=30; // it is not a 5th index : Index 5 out of bounds for length 5

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = new int [3];
        System.out.println(Arrays.toString(arr2));

        boolean [] arr3 = new boolean[2]; // it print by default false false
        System.out.println(Arrays.toString(arr3));

        String [] arr4 = new String [4];
        System.out.println(Arrays.toString(arr4));

        System.out.println("++++++++++++++++++++++++++++++++");

        arr[0]= 10;
        System.out.println(arr[0]);

        arr[1] = 23.3;
        System.out.println(Arrays.toString(arr));

        arr[2] = -44.4;
        arr[3] = 100;
        arr[4] = 200;
        System.out.println(Arrays.toString(arr));

        System.out.println("_________________");
        arr = new double [8]; // this is the new object - this is a new array with the size of 8 elements
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");

        String[] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};

        System.out.println(Arrays.toString(cities));
        cities[5] = "Chicago";
        System.out.println(Arrays.toString(cities));
        System.out.println(cities[2]);


    }
}
