package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(700);
        nums.add(500);
        System.out.println(nums);
        System.out.println(nums.size()); //output -->4

        System.out.println(nums.isEmpty()); //it is not empty , we have some values! --> This checks if the ArrayList is empty or not and returns boolean value

        System.out.println("Noe clearing the ArrayList");

        nums.clear();
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        //nums.clear(); // .clear() method does not return anything. It is return type -- VOID!!!!!

    }
}
