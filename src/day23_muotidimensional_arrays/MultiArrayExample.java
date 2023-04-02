package day23_muotidimensional_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {2, 4, 5, 6}; // datatype is int array
        int [] m = {10, 33, 55,77};

        int [][] all = {n, m}; // 2 dimentional int array
        System.out.println(all);

        System.out.println(Arrays.toString(all)); //printing 2D dimentional array
        System.out.println(Arrays.toString(n)); // printing 1D dimentional array

        System.out.println(Arrays.deepToString(all)); // correct way to print 2D array !!!!!!!!
        System.out.println("First array: " + Arrays.toString(all[0]));// here print first 1D array in the 2D array
        System.out.println("Second array: " + Arrays.toString(all[1]));// it prints second

        System.out.println("_______________________");
        int [][] twoD = {
                {2, 3, 6, 8},
                {23, 45, 12, 334},
                {23},
                {349, 234, 345, 324, 234, 12, 67}
        };

        System.out.println(twoD[0].length); //4
        System.out.println(twoD[1].length); //4
        System.out.println(twoD[2].length); //1
        System.out.println(twoD[3].length); //7
       // System.out.println(twoD[4].length); //ArrayIndexOutOfBoundsException


    }
}
