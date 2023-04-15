package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {

    public static void main(String[] args) {

        //create ArrayList of String
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        ArrayList<String> switchedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {   //--> 2 is indicate that i will go every 2nd

            switchedList.add(list.get(i+1));
            switchedList.add(list.get(i));
            System.out.println(list);
            System.out.println();
        }

    }
}
