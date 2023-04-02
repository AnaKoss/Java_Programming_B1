package day21_arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,0,5,0,1,0};
        int [] change = new int[nums.length]; // reserve spot
int index = 0;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(change));
        System.out.println("___________________________");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                change[index] = nums[i];
                index++;
            }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(change));



    }
}
