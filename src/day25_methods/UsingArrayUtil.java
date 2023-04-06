package day25_methods;

import my_util.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] arr = new int [] {23, 43, 54, 65};// not direct used
        System.out.println(ArrayUtil.minNumInArray(arr));

        System.out.println(ArrayUtil.minNumInArray(new int[]{15, 27, 3, 4, 5})); // direct used in the method

        System.out.println(ArrayUtil.minNumInArrWithSort(arr));
        System.out.println(ArrayUtil.minNumInArrWithSort(new int[]{15, 27, 3, 4, 5}));


    }



}
