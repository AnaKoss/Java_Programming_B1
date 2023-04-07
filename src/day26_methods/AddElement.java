package day26_methods;

import java.util.Arrays;

public class AddElement {

    // create the method that accept int array and int value
    //adds that value at the end of array

    public static void main(String[] args) {
       int [] arr = {23, 4, 6, 6}; //size = 4
        // int [] arr = {23, 4, 6, 6, _};
        add(arr, 67);
    }
    public static int [] add (int[] arr, int num){    // or -->int ... arr
        int [] newArr = Arrays.copyOf(arr, arr.length +1);
        System.out.println(Arrays.toString(newArr));
newArr[newArr.length-1]  = num;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }



}
