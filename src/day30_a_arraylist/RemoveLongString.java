package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    //create a method that accepts list of Strings and the int num and returms another list but the string which are longer that the int num removed

    public static ArrayList<String> keepShortStrings (ArrayList<String> list, int sizeToCheck){

        /*//this is another way you can do it
        ArrayList <String> newList = new ArrayList<>();

        for (String each: list) {
            if(each.length()< sizeToCheck){
                newList.add(each);
            }
        }
        return newList;
         */
list.removeIf(each-> each.length()> sizeToCheck);
return list;

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        System.out.println(keepShortStrings(list, 3));

    }
}
