package day27_wrapper_arraylist;
import java.util.ArrayList;
public class RemoveExample {
    public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("apple");
        list.add("banana");
        list.add("wine");

        System.out.println(list);
        System.out.println("I have total " + list.size() +  " elements on my list");

        //list.remove(0); // returns the element if the boolean result is true. and it is true if the element is removed ( it will remove but did not print out )
        System.out.println(list.remove(0)); // it will remove element and print out the element.
        System.out.println(list);
        System.out.println("_________");


        String removeElem = list.remove(list.size()-1);
        System.out.println(removeElem);
        System.out.println(list);


        boolean isRemoved = list.remove( "banana"); //it that element exist in list, it will remove and return the boolean result
        System.out.println(isRemoved);
        System.out.println(list);

        /*
        remove(withIndex);
                        --> it check if the index is in the ArrayList range, it true, it removes that element on that index and return the removed element.
                        -> it check if the index is in the ArrayList range, it false , it trows  the exception
        removed (withElement);
                        --> it checks
                        1. if the given element exists in the Arraylist, if true, it removes that element and removes that element and return True
                        2. if the given element does NOT exist in the ArrayList, it false, ir does NOT remove that element and return FALSE
         */

        list.add("peach");
        System.out.println(list);
        list.add(0, "cake");
        System.out.println(list);
    }
}
