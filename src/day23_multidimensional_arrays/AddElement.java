package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
have a starting array
you want to add # to the end
so make your array bigger to store the new #
Ex:
{45, 123, 62}
 ADDING 100
 {45, 123, 62, 100}
 */
public class AddElement {
    public static void main(String[] args) {

int [] nums = {1, 2, 3, 4}; //4

        Scanner input = new Scanner (System.in);
        System.out.println("What do you want your array size to be?");

        int arrOneSize = input.nextInt();
        int [] arr1 = new int [arrOneSize];

        System.out.println(Arrays.toString(arr1));
        System.out.println("Add your elements one at the time: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1 [i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("How many more elements do you want to add: ");
int addNum = input.nextInt();

int [] arr2 = Arrays.copyOf( arr1 ,arr1.length + addNum );

        System.out.println(Arrays.toString(arr2));

        System.out.println("Add your elements one at a time for additional spaces: ");

        for (int i = arr1.length; i < arr2.length; i++) { // int i = arr1.length --> here i want to start from new elements ; if int i = 0 it will be print and change to all new nums
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr2));


    }
}
