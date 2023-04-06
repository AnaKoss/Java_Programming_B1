package my_util;

import java.util.Arrays;

/**
 * This method will accept an int array
 * And will return the minimum number
 */
public class ArrayUtil {
    public static int minNumInArray (int [] arr){
        int min = arr[0];


        for ( int each : arr) {
            if (each < min){
                min =each;
            }
        }
        return min;
    }
    /**
     * This method will accept an int array
     * And will return the minimum number
     */
    public static int minNumInArrWithSort ( int [] arr){
        Arrays.sort(arr);
        return arr[0];

    }
}
