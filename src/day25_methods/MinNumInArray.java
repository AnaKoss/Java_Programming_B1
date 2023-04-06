package day25_methods;

import java.util.Arrays;

public class MinNumInArray {
    public static int minNumInArray (int [] arr){
        int min = arr[0];


        for ( int each : arr) {
            if (each < min){
                min =each;
            }
        }
        return min;
    }

    public static int minNumInArrWithSort ( int [] arr){
        Arrays.sort(arr);
        return arr[0];

    }
    public static int minNumInArrWithSort2 ( int ... arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(minNumInArrWithSort2(123,34,54,65));
    }
}
