package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group);
        group.add("Anna");
        System.out.println(group);
        group.add(0, "Katy");
        System.out.println(group);

        // method overloading is happening
        group.add("Vlad");
        group.add(0,"Helen");


    }
}
