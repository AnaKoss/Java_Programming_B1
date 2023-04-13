package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(300);
        nums.add(700);
        nums.add(500);
        System.out.println(nums);

        nums.set(1, -300);
        System.out.println(nums);

        nums.set(3, 432456789);
        System.out.println(nums);


    }






}
