package day21_arrays;

import java.util.Arrays;

/*
reverse array
ex: input:
[1,2,3,4,5]
output:
[5,4,3,2,1]
 */
public class ReverseArray {
    public static void main(String[] args) {

int [] original = {1,2,3,4,5};

int [] reverse = new int [original.length];


        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reverse));
        System.out.println("__________________________");
        for (int i = original.length-1; i >=0; i--) { // also can be used reserve.length
   reverse [reverse.length - (i +1)] = original[i];
        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reverse));





    }
}
