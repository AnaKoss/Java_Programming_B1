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
    /**
     *
     * This method accepts int array and a number
     * And retrns the index of the number in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (int [] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * This method accepts String array and a String
     * And retrns the index of the String in the array
     * If it does not exist, it returns -1
     */
    public static int indexOf (String [] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *This method will accept an int array and the number
     * It will return if the number exists in array
     */
    public static boolean containArr (int [] arr, int num){ // [2, 4, 6, 8, 9, 10], 44

        for ( int each : arr){
            if ( each == num){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * This method accepts int array and the int num
     * And returns the a new array with the num added at the end
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }
    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;
        return newArr;
    }

    /**
     * This method accepts int number and the int array
     * And returns the new array with the number added at the beginning
     */
    public static int [] addElemBeginning (int num, int ... arr){    // 77 { 1, 4, 8}
        int [] newArr = new int [arr.length + 1];                   //       0  1  2
                                                                     //   {_, 1, 4, 8}
                                                                    //     0  1  2  3
        for (int i = 1; i <newArr.length ; i++) { // we need to stat from 1 index to add number at the beginning
            newArr[i] = arr[i -1];
        }
       //System.out.println(Arrays.toString(newArr));
        newArr[0] = num;
        return newArr;
    }

    /**
     * This method accepts String word and String array
     * And returns the new array with the word added at the beginning
     */
    public static String [] addElemBeginning (String word, String ... arr){    // 77 { 1, 4, 8}
        String [] newArr = new String [arr.length + 1];                   //       0  1  2
        //   {_, 1, 4, 8}
        //     0  1  2  3
        for (int i = 1; i <newArr.length ; i++) { // we need to stat from 1 index to add number at the beginning
            newArr[i] = arr[i -1];
        }
        //System.out.println(Arrays.toString(newArr));
        newArr[0] = word;
        return newArr;
    }


    }
