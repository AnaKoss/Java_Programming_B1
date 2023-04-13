package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Laptop");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");

        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        String removed = list.remove(0); //removes the first element and returns the removed element. Since dataType of the removed element is String , we can assign it to a String variables.
        System.out.println(removed);
        System.out.println(list);

        list.remove("Mouse"); //return ---boolean
        System.out.println(list);

        boolean isRemoved = list.remove("Keyboard");

        System.out.println(isRemoved);
        System.out.println(list);

        list.add("Screen");
        list.add("Screen");
        list.add("Screen");
        list.add("Table");
        list.add("Screen");
        System.out.println(list);

        list.remove("Screen");//removed only 1 one element
        System.out.println(list);

        /*for (String each: list) {
            if (each.equals("Screen")){   //well be cover later
                list.remove(each);
            }
        }
        System.out.println(list);

         */



    }
}
