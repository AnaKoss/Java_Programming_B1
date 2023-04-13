package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("tom");
        names.add("jerry");
        names.add("micky");
        names.add("mouse");
        System.out.println(names);
        //.contains(); ---> it will returns boolean value
        System.out.println(names.contains("tom"));
        System.out.println(names.contains("Tom"));

        boolean isInList = names.contains("mouse");
        System.out.println(isInList);
        System.out.println("+++++++++++");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        System.out.println(nums.contains(200));//contains() method takes the parameter as an object NOT as index
    }
}