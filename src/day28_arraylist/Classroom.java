package day28_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {


        ArrayList <String> group = new ArrayList<>();

        System.out.println(group);

        group.add("tom");
        group.add("jerry");
        group.add("micky");
        group.add("mouse");
        System.out.println(group);
        group.add("vinni");
        System.out.println(group);

        //get the total element count
        System.out.println(group.size());
        System.out.println("First cartoon character: " + group.get(0));
        System.out.println("Last cartoon character: " +group.get(group.size()-1));

        for (int i = 0; i < group.size(); i++) { // for (int i = 0; i <= group.size()-1; i++) {
            System.out.println("cahrtoon char number: " + (i + 1)+ " " +  group.get(i));
        }


    }



}
